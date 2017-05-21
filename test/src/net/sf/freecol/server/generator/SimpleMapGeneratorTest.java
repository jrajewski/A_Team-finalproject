package net.sf.freecol.server.generator;

import java.util.Random;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import net.sf.freecol.common.model.Map;
import net.sf.freecol.common.model.Game;
import static org.junit.Assert.*;
import org.w3c.dom.Element;
import net.sf.freecol.common.util.LogBuilder;

/**
 * The class <code>SimpleMapGeneratorTest</code> contains tests for the class <code>{@link SimpleMapGenerator}</code>.
 *
 * @generatedBy CodePro at 5/18/17 10:37 PM
 * @author featherylizard
 * @version $Revision: 1.0 $
 */
public class SimpleMapGeneratorTest {
	/**
	 * Run the SimpleMapGenerator(Game,Random) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 10:37 PM
	 */
	@Test
	public void testSimpleMapGenerator_1()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Random random = new Random();

		SimpleMapGenerator result = new SimpleMapGenerator(game, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Map createEmptyMap(int,int,LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 10:37 PM
	 */
	@Test
	public void testCreateEmptyMap_1()
		throws Exception {
		SimpleMapGenerator fixture = new SimpleMapGenerator(new Game(new IIOMetadataNode(), ""), new Random());
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

	/**
	 * Run the Map createMap(LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 10:37 PM
	 */
	@Test
	public void testCreateMap_1()
		throws Exception {
		SimpleMapGenerator fixture = new SimpleMapGenerator(new Game(new IIOMetadataNode(), ""), new Random());
		LogBuilder lb = new LogBuilder(1);

		Map result = fixture.createMap(lb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Map createMap(LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 10:37 PM
	 */
	@Test
	public void testCreateMap_2()
		throws Exception {
		SimpleMapGenerator fixture = new SimpleMapGenerator(new Game(new IIOMetadataNode(), ""), new Random());
		LogBuilder lb = new LogBuilder(1);

		Map result = fixture.createMap(lb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/17 10:37 PM
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
	 * @generatedBy CodePro at 5/18/17 10:37 PM
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
	 * @generatedBy CodePro at 5/18/17 10:37 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SimpleMapGeneratorTest.class);
	}
}