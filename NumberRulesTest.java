package net.sf.freecol.common.i18n;

import java.io.InputStream;
import java.io.PipedInputStream;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>NumberRulesTest</code> contains tests for the class <code>{@link NumberRules}</code>.
 *
 * @generatedBy CodePro at 5/15/17 11:45 AM
 * @author michaeldavies
 * @version $Revision: 1.0 $
 */
public class NumberRulesTest {
	/**
	 * Run the NumberRules(InputStream) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 11:45 AM
	 */
	@Test
	public void testNumberRules_1()
		throws Exception {
		InputStream in = new PipedInputStream();

		NumberRules result = new NumberRules(in);
		assertNotNull(result);
	}

	/**
	 * Run the Number getNumberForLanguage(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 11:45 AM
	 */
	@Test
	public void testGetNumberForLanguage_1()
		throws Exception {
		String lang = "Test";

		Number result = NumberRules.getNumberForLanguage(lang);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Number getNumberForLanguage(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 11:45 AM
	 */
	@Test
	public void testGetNumberForLanguage_2()
		throws Exception {
		String lang = "";

		Number result = NumberRules.getNumberForLanguage(lang);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isInitialized() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 11:45 AM
	 */
	@Test
	public void testIsInitialized_1()
		throws Exception {

		boolean result = NumberRules.isInitialized();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isInitialized() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 11:45 AM
	 */
	@Test
	public void testIsInitialized_2()
		throws Exception {

		boolean result = NumberRules.isInitialized();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void load(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 11:45 AM
	 */
	@Test
	public void testLoad_1()
		throws Exception {
		InputStream in = new PipedInputStream();

		NumberRules.load(in);

	
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/15/17 11:45 AM
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
	 * @generatedBy CodePro at 5/15/17 11:45 AM
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
	 * @generatedBy CodePro at 5/15/17 11:45 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(NumberRulesTest.class);
	}
}