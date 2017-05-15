package net.sf.freecol.common.i18n;

import java.util.List;
import java.util.Random;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.common.model.Specification;
import org.junit.*;
import net.sf.freecol.common.model.Game;
import net.sf.freecol.common.model.Colony;
import net.sf.freecol.common.model.Settlement;
import net.sf.freecol.common.model.UnitType;
import static org.junit.Assert.*;
import org.w3c.dom.Element;
import net.sf.freecol.common.model.Player;
import net.sf.freecol.common.model.Region;

/**
 * The class <code>NameCacheTest</code> contains tests for the class <code>{@link NameCache}</code>.
 *
 * @generatedBy CodePro at 5/15/17 9:03 AM
 * @author michaeldavies
 * @version $Revision: 1.0 $
 */
public class NameCacheTest {
	/**
	 * Run the NameCache() constructor test.
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testNameCache_1()
		throws Exception {
		NameCache result = new NameCache();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void addCityOfCibola(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testAddCityOfCibola_1()
		throws Exception {
		String key = "Test";

		NameCache.addCityOfCibola(key);

		// add additional test code here
	}

	/**
	 * Run the void addCityOfCibola(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testAddCityOfCibola_2()
		throws Exception {
		String key = "Test";

		NameCache.addCityOfCibola(key);

		// add additional test code here
	}

	/**
	 * Run the void clearCitiesOfCibola() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testClearCitiesOfCibola_1()
		throws Exception {

		NameCache.clearCitiesOfCibola();

		// add additional test code here
	}

	/**
	 * Run the void clearCitiesOfCibola() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testClearCitiesOfCibola_2()
		throws Exception {

		NameCache.clearCitiesOfCibola();

		// add additional test code here
	}

	/**
	 * Run the String getCapitalName(Player,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testGetCapitalName_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), "Test"), new IIOMetadataNode());
		Random random = new Random();

		String result = NameCache.getCapitalName(player, random);

		assertNotNull(result);
	}

	/**
	 * Run the List<String> getCitiesOfCibola() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testGetCitiesOfCibola_1()
		throws Exception {

		List<String> result = NameCache.getCitiesOfCibola();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> getCitiesOfCibola() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testGetCitiesOfCibola_2()
		throws Exception {

		List<String> result = NameCache.getCitiesOfCibola();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the int getMercenaryLeaderIndex(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testGetMercenaryLeaderIndex_1()
		throws Exception {
		Random random = new Random();

		int result = NameCache.getMercenaryLeaderIndex(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: bound must be positive
		//       at java.util.Random.nextInt(Random.java:388)
		//       at net.sf.freecol.common.util.RandomUtils.randomInt(RandomUtils.java:46)
		//       at net.sf.freecol.common.i18n.NameCache.getMercenaryLeaderIndex(NameCache.java:355)
		assertEquals(1, result);
	}

	/**
	 * Run the String getMercenaryLeaderName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testGetMercenaryLeaderName_1()
		throws Exception {
		int index = 1;

		String result = NameCache.getMercenaryLeaderName(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:653)
		//       at java.util.ArrayList.get(ArrayList.java:429)
		//       at net.sf.freecol.common.i18n.NameCache.getMercenaryLeaderName(NameCache.java:367)
		assertNotNull(result);
	}

	/**
	 * Run the String getNewLandName(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testGetNewLandName_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setNewLandName((String) null);

		String result = NameCache.getNewLandName(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getNextCityOfCibola() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testGetNextCityOfCibola_1()
		throws Exception {

		String result = NameCache.getNextCityOfCibola();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getNextCityOfCibola() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testGetNextCityOfCibola_2()
		throws Exception {

		String result = NameCache.getNextCityOfCibola();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getNextCityOfCibola() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testGetNextCityOfCibola_3()
		throws Exception {

		String result = NameCache.getNextCityOfCibola();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getRegionName(Player,Region) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testGetRegionName_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Region region = new Region(new Game(new IIOMetadataNode(), ""));

		String result = NameCache.getRegionName(player, region);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getRegionName(Player,Region) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testGetRegionName_2()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Region region = new Region(new Game(new IIOMetadataNode(), ""));

		String result = NameCache.getRegionName(player, region);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getRegionName(Player,Region) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testGetRegionName_3()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Region region = new Region(new Game(new IIOMetadataNode(), ""));

		String result = NameCache.getRegionName(player, region);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getRegionName(Player,Region) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testGetRegionName_4()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Region region = new Region(new Game(new IIOMetadataNode(), ""));

		String result = NameCache.getRegionName(player, region);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getRegionName(Player,Region) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testGetRegionName_5()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Region region = new Region(new Game(new IIOMetadataNode(), ""));

		String result = NameCache.getRegionName(player, region);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getRegionName(Player,Region) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testGetRegionName_6()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Region region = new Region(new Game(new IIOMetadataNode(), ""));

		String result = NameCache.getRegionName(player, region);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getSeasonName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testGetSeasonName_1()
		throws Exception {
		int index = -1;

		String result = NameCache.getSeasonName(index);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSeasonName(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testGetSeasonName_2()
		throws Exception {
		int index = 1;

		String result = NameCache.getSeasonName(index);

		// add additional test code here
		assertEquals("model.season.autumn.name", result);
	}

	/**
	 * Run the String getSettlementName(Player,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testGetSettlementName_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Random random = new Random();

		String result = NameCache.getSettlementName(player, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getSettlementName(Player,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testGetSettlementName_2()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.addSettlement(new Colony(new Game(new IIOMetadataNode(), ""), ""));
		Random random = new Random();

		String result = NameCache.getSettlementName(player, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getSettlementName(Player,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testGetSettlementName_3()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.addSettlement(new Colony(new Game(new IIOMetadataNode(), ""), ""));
		Random random = new Random();

		String result = NameCache.getSettlementName(player, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getTradeRouteName(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testGetTradeRouteName_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		String result = NameCache.getTradeRouteName(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getTradeRouteName(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testGetTradeRouteName_2()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		String result = NameCache.getTradeRouteName(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getTradeRouteName(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testGetTradeRouteName_3()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		String result = NameCache.getTradeRouteName(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getUnitName(Player,UnitType,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testGetUnitName_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		UnitType type = new UnitType("", new Specification());
		Random random = new Random();

		String result = NameCache.getUnitName(player, type, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getUnitName(Player,UnitType,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testGetUnitName_2()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		UnitType type = new UnitType("", new Specification());
		Random random = new Random();

		String result = NameCache.getUnitName(player, type, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getUnitName(Player,UnitType,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testGetUnitName_3()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		UnitType type = new UnitType("", new Specification());
		Random random = new Random();

		String result = NameCache.getUnitName(player, type, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getUnitName(Player,UnitType,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testGetUnitName_4()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		UnitType type = new UnitType("", new Specification());
		Random random = new Random();

		String result = NameCache.getUnitName(player, type, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void putSettlementName(Player,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testPutSettlementName_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		String name = "";

		NameCache.putSettlementName(player, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void putSettlementName(Player,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testPutSettlementName_2()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), "Test"), new IIOMetadataNode());
		String name = "Test";

		NameCache.putSettlementName(player, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void requireCitiesOfCibola(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testRequireCitiesOfCibola_1()
		throws Exception {
		Random random = new Random();

		NameCache.requireCitiesOfCibola(random);

		// add additional test code here
	}

	/**
	 * Run the void requireCitiesOfCibola(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testRequireCitiesOfCibola_2()
		throws Exception {
		Random random = new Random();

		NameCache.requireCitiesOfCibola(random);

		// add additional test code here
	}

	/**
	 * Run the void requireCitiesOfCibola(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Test
	public void testRequireCitiesOfCibola_3()
		throws Exception {
		Random random = new Random();

		NameCache.requireCitiesOfCibola(random);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/15/17 9:03 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(NameCacheTest.class);
	}
}