package net.sf.freecol.common.i18n;

import java.util.List;
import java.util.Random;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.common.model.Specification;
import org.junit.*;
import net.sf.freecol.common.model.Game;
import net.sf.freecol.common.FreeColSeed;
import net.sf.freecol.common.ServerInfo;
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

	 public void testFreeColSeed_1()
	            throws Exception {
	            FreeColSeed result = new FreeColSeed();
	            assertNotNull(result);
	            // add additional test code here
	        }
	    
	    
	        
	        public void testGetFreeColSeed_1()
	            throws Exception {
	            boolean generate = true;
	    
	            long result = FreeColSeed.getFreeColSeed(generate);
	   
	        
	            assertNotNull(result);
	        }
	        
	        public void testServerInfo_1()
	                throws Exception {
	         
	                ServerInfo result = new ServerInfo();
	         
	                // add additional test code here
	                assertNotNull(result);
	                assertEquals("null(null:0) 0, 0, false, null, 0", result.toString());
	                assertEquals(null, result.getAddress());
	                assertEquals(null, result.getName());
	                assertEquals(0, result.getPort());
	                assertEquals(null, result.getVersion());
	                assertEquals(0, result.getGameState());
	                assertEquals(0, result.getSlotsAvailable());
	                assertEquals(0, result.getCurrentlyPlaying());
	            }
	        
	        public void testGetAddress_1()
	                throws Exception {
	                ServerInfo fixture = new ServerInfo();
	                fixture.update("", "", 1, 1, 1, true, "", 1);
	         
	                String result = fixture.getAddress();
	         
	            
	                assertEquals("", result);
	            }
	        
	        public void testGetCurrentlyPlaying_1()
	                throws Exception {
	                ServerInfo fixture = new ServerInfo();
	                fixture.update("", "", 1, 1, 1, true, "", 1);
	         
	                int result = fixture.getCurrentlyPlaying();
	         
	                // add additional test code here
	                assertEquals(1, result);
	            }
	        
	        public void testGetCurrentlyPlaying_2()
	                throws Exception {
	                ServerInfo fixture = new ServerInfo();
	                fixture.update("", "", 1, 1, 1, true, "", 1);
	         
	                String result = ServerInfo.getXMLElementTagName();
	         
	        
	                // add additional test code here
	                assertNotNull(result);
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