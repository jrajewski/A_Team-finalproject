/**
 *  Copyright (C) 2002-2015  The FreeCol Team
 *
 *  This file is part of FreeCol.
 *
 *  FreeCol is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  FreeCol is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with FreeCol.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.freecol.server.generator;

import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.util.Random;
import java.util.Vector;

import javax.imageio.metadata.IIOMetadataNode;

import org.junit.Test;

import net.sf.freecol.common.io.FreeColSavegameFile;
import net.sf.freecol.common.model.FreeColObject;
import net.sf.freecol.common.model.Game;
import net.sf.freecol.common.model.IndianSettlement;
import net.sf.freecol.common.model.LandMap;
import net.sf.freecol.common.model.Map;
import net.sf.freecol.common.model.Nation;
import net.sf.freecol.common.model.NationOptions;
import net.sf.freecol.common.model.Player;
import net.sf.freecol.common.model.Region;
import net.sf.freecol.common.model.Tile;
import net.sf.freecol.common.model.Turn;
import net.sf.freecol.common.option.FileOption;
import net.sf.freecol.common.option.MapGeneratorOptions;
import net.sf.freecol.common.util.LogBuilder;
import net.sf.freecol.server.model.ServerGame;
import net.sf.freecol.server.model.ServerPlayer;
import net.sf.freecol.server.model.ServerUnit;
import net.sf.freecol.util.test.FreeColTestCase;


public class MapGeneratorTest extends FreeColTestCase {

	public void testCreateEmptyMap(){
		((FileOption) spec().getOption(MapGeneratorOptions.IMPORT_FILE)).setValue(null);

        Game g = new ServerGame(spec());
        g.setNationOptions(new NationOptions(spec()));

        // A new game does not have a map yet
        assertEquals(null, g.getMap());

        MapGenerator gen = new SimpleMapGenerator(g, new Random(1));
		LogBuilder lb = new LogBuilder(10);
		Map map = gen.createEmptyMap(10, 10, lb);
	}
	
	public void testCreateMap(){
		((FileOption) spec().getOption(MapGeneratorOptions.IMPORT_FILE)).setValue(null);

        Game g = new ServerGame(spec());
        g.setNationOptions(new NationOptions(spec()));

        // A new game does not have a map yet
        assertEquals(null, g.getMap());

        MapGenerator gen = new SimpleMapGenerator(g, new Random(1));
		LogBuilder lb = new LogBuilder(10);
		Map map = gen.createMap(lb);
	}
	
	public void testCreateDebugUnits1(){
		//Map map, Player player, Tile startTile,
        //LogBuilder lb 
		//above are params to the method
		// Create land map.
		
		
        
	}
	
    public void testWithNoIndians() {
        ((FileOption) spec().getOption(MapGeneratorOptions.IMPORT_FILE)).setValue(null);

        Game g = new ServerGame(spec());
        g.setNationOptions(new NationOptions(spec()));

        // A new game does not have a map yet
        assertEquals(null, g.getMap());

        MapGenerator gen = new SimpleMapGenerator(g, new Random(1));

        for (Nation n : spec().getNations()) {
            if (n.getType().isEuropean() && !n.getType().isREF()
                && !n.isUnknownEnemy()) {
                g.addPlayer(new ServerPlayer(g, false, n, null, null));
            }
        }

        gen.createMap(new LogBuilder(-1));

        // Check that the map is created at all
        assertNotNull(g.getMap());
    }

    public void testSinglePlayerOnSmallMap() {
        ((FileOption) spec().getOption(MapGeneratorOptions.IMPORT_FILE)).setValue(null);

        Game g = new ServerGame(spec());
        g.setNationOptions(new NationOptions(spec()));

        // A new game does not have a map yet
        assertEquals(null, g.getMap());

        MapGenerator gen = new SimpleMapGenerator(g, new Random(1));
        Nation nation = spec().getNation("model.nation.dutch");

        g.addPlayer(new ServerPlayer(g, false, nation, null, null));

        gen.createMap(new LogBuilder(-1));

        // Check that the map is created at all
        assertNotNull(g.getMap());

        assertEquals(g.getMapGeneratorOptions().getInteger(MapGeneratorOptions.MAP_WIDTH),
                     g.getMap().getWidth());
        assertEquals(g.getMapGeneratorOptions().getInteger(MapGeneratorOptions.MAP_HEIGHT),
                     g.getMap().getHeight());

    }

    public void testMapGenerator() {
        ((FileOption) spec().getOption(MapGeneratorOptions.IMPORT_FILE)).setValue(null);

        Game g = new ServerGame(spec());

        g.setNationOptions(new NationOptions(spec()));
        // A new game does not have a map yet
        assertEquals(null, g.getMap());

        MapGenerator gen = new SimpleMapGenerator(g, new Random(1));

        // Apply the difficulty level
        //spec().applyDifficultyLevel("model.difficulty.medium");

        Vector<Player> players = new Vector<Player>();

        for (Nation n : spec().getNations()) {
            if (n.isUnknownEnemy()) continue;
            Player p = new ServerPlayer(g, false, n, null, null);
            p.setAI(!n.getType().isEuropean() || n.getType().isREF());
            g.addPlayer(p);
            players.add(p);
        }

        gen.createMap(new LogBuilder(-1));

        // Check that the map is created at all
        assertNotNull(g.getMap());

        // Map of correct size?
        Map m = g.getMap();
        assertEquals(m.getWidth(),
                     g.getMapGeneratorOptions().getInteger(MapGeneratorOptions.MAP_WIDTH));
        assertEquals(m.getHeight(),
                     g.getMapGeneratorOptions().getInteger(MapGeneratorOptions.MAP_HEIGHT));

        // Sufficient land?
        int land = 0;
        int total = 0;
        for (Tile t : m.getAllTiles()) {
            if (t.isLand()) land++;
            total++;
        }
        // Land Mass requirement fulfilled?
        assertTrue(100 * land / total >= g.getMapGeneratorOptions()
                   .getInteger(MapGeneratorOptions.LAND_MASS));

        // Does the wholeMapIterator visit all fields?
        assertEquals(total,
                     g.getMapGeneratorOptions().getInteger(MapGeneratorOptions.MAP_WIDTH)
                     * g.getMapGeneratorOptions().getInteger(MapGeneratorOptions.MAP_HEIGHT));
    }

    /**
     * Make sure that each tribe has exactly one capital
     *
     */
    public void testIndianCapital() {
        ((FileOption) spec().getOption(MapGeneratorOptions.IMPORT_FILE)).setValue(null);

        Game g = new ServerGame(spec());
        g.setNationOptions(new NationOptions(spec()));

        MapGenerator gen = new SimpleMapGenerator(g, new Random(1));

        Vector<Player> players = new Vector<Player>();

        for (Nation n : spec().getNations()) {
            if (n.isUnknownEnemy()) continue;
            Player p = new ServerPlayer(g, false, n, null, null);
            p.setAI(!n.getType().isEuropean() || n.getType().isREF());
            g.addPlayer(p);
            players.add(p);
        }

        gen.createMap(new LogBuilder(-1));

        // Check that the map is created at all
        assertNotNull(g.getMap());

        for (Player p : players) {
            if (!p.isIndian())
                continue;

            // Check that every indian player has exactly one capital if s/he
            // has at least one settlement.
            int settlements = 0;
            int capitals = 0;
            for (IndianSettlement s : p.getIndianSettlements()) {
                settlements++;
                if (s.isCapital())
                    capitals++;
            }
            if (settlements > 0)
                assertEquals(1, capitals);
        }
    }

    /**
     * Make sure we can import all distributed maps.
     */
    public void testImportMap() {
        Game game = new ServerGame(spec());
        MapGenerator gen = new SimpleMapGenerator(game, new Random(1));
        File mapDir = new File("data/maps/");
        for (File importFile : mapDir.listFiles(FreeColSavegameFile.getFileFilter())) {
            ((FileOption)spec().getOption(MapGeneratorOptions.IMPORT_FILE))
                .setValue(importFile);
            assertNotNull(gen.createMap(new LogBuilder(-1)));
        }
        // Clear import file option
        ((FileOption)spec().getOption(MapGeneratorOptions.IMPORT_FILE))
            .setValue(null);
    }

    public void testRegions() {
        Game game = new ServerGame(spec());
        MapGenerator gen = new SimpleMapGenerator(game, new Random(1));
        gen.createMap(new LogBuilder(-1));
        
        Map map = game.getMap();
        Region pacific = map.getRegionByKey("model.region.pacific");
        assertNotNull(pacific);
        assertTrue(pacific.isPacific());
        assertEquals(pacific, pacific.getDiscoverableRegion());

        Region southPacific = map.getRegionByKey("model.region.southPacific");
        assertNotNull(southPacific);
        assertFalse(southPacific.getDiscoverable());
        assertTrue(southPacific.isPacific());
        assertEquals(pacific, southPacific.getParent());
        assertEquals(pacific, southPacific.getDiscoverableRegion());

        Player player = new Player(game, FreeColObject.ID_ATTRIBUTE_TAG);
        ServerUnit unit = new ServerUnit(game, null, player,
            spec().getUnitType("model.unit.caravel"));
        pacific.discover(player, new Turn(1));

        assertFalse(pacific.getDiscoverable());
        assertNull(pacific.getDiscoverableRegion());
        assertFalse(southPacific.getDiscoverable());
        assertTrue(southPacific.isPacific());
        assertEquals(pacific, southPacific.getParent());
        assertNull(southPacific.getDiscoverableRegion());

        Region atlantic = map.getRegionByKey("model.region.atlantic");
        assertNotNull(atlantic);
        assertFalse(atlantic.isPacific());
        assertFalse(atlantic.getDiscoverable());
        assertNull(atlantic.getDiscoverableRegion());

        Region northAtlantic = map.getRegionByKey("model.region.northAtlantic");
        assertNotNull(northAtlantic);
        assertFalse(northAtlantic.isPacific());
        assertFalse(northAtlantic.getDiscoverable());
        assertNull(northAtlantic.getDiscoverableRegion());
    }
    
    //codepro test cases
    
	public void testSimpleMapGenerator_1()
		throws Exception {
		//Game g = new ServerGame(spec());
        //g.setNationOptions(new NationOptions(spec()));
		Game game = new ServerGame(spec());
		game.setNationOptions(new NationOptions(spec()));
		Random random = new Random();

		SimpleMapGenerator result = new SimpleMapGenerator(game, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}
	
	public void testCreateEmptyMap_1()
		throws Exception {
		Game game = new ServerGame(spec());
		game.setNationOptions(new NationOptions(spec()));
		SimpleMapGenerator fixture = new SimpleMapGenerator(game, new Random());
		int width = 1;
		int height = 1;
		LogBuilder lb = new LogBuilder(1);

		Map result = fixture.createEmptyMap(width, height, lb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}
	
	public void testCreateMap_1()
		throws Exception {
		Game game = new ServerGame(spec());
		game.setNationOptions(new NationOptions(spec()));
		SimpleMapGenerator fixture = new SimpleMapGenerator(game, new Random());
		LogBuilder lb = new LogBuilder(1);

		Map result = fixture.createMap(lb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}
	
	public void testCreateMap_2()
		throws Exception {
		Game game = new ServerGame(spec());
		game.setNationOptions(new NationOptions(spec()));
		SimpleMapGenerator fixture = new SimpleMapGenerator(game, new Random());
		LogBuilder lb = new LogBuilder(1);

		Map result = fixture.createMap(lb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}
    
}
