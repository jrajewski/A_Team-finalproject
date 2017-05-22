package net.sf.freecol.common.i18n;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>OtherNumberRuleTest</code> contains tests for the class <code>{@link OtherNumberRule}</code>.
 *
 * @generatedBy CodePro at 5/15/17 12:16 PM
 * @author michaeldavies
 * @version $Revision: 1.0 $
 */
public class OtherNumberRuleTest {
	/**
	 * Run the Number.Category getCategory(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 12:16 PM
	 */
	@Test
	public void testGetCategory_1()
		throws Exception {
		OtherNumberRule fixture = new OtherNumberRule();
		double input = 1.0;

		Number.Category result = fixture.getCategory(input);

		// add additional test code here
		assertNotNull(result);
		assertEquals("other", result.name());
		assertEquals("other", result.toString());
		assertEquals(5, result.ordinal());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/15/17 12:16 PM
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
	 * @generatedBy CodePro at 5/15/17 12:16 PM
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
	 * @generatedBy CodePro at 5/15/17 12:16 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(OtherNumberRuleTest.class);
	}
}