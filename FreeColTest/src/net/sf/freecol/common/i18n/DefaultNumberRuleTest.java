package net.sf.freecol.common.i18n;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DefaultNumberRuleTest</code> contains tests for the class <code>{@link DefaultNumberRule}</code>.
 *
 * @generatedBy CodePro at 5/15/17 8:35 AM
 * @author michaeldavies
 * @version $Revision: 1.0 $
 */
public class DefaultNumberRuleTest {
	/**
	 * Run the DefaultNumberRule() constructor test.
	 *
	 * @generatedBy CodePro at 5/15/17 8:35 AM
	 */
	@Test
	public void testDefaultNumberRule_1()
		throws Exception {
		DefaultNumberRule result = new DefaultNumberRule();
		assertNotNull(result);
		// add additional test code here
	}



	/**
	 * Run the int countRules() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 8:35 AM
	 */
	@Test
	public void testCountRules_1()
		throws Exception {
		DefaultNumberRule fixture = new DefaultNumberRule();

		int result = fixture.countRules();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the Number.Category getCategory(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 8:35 AM
	 */
	@Test
	public void testGetCategory_1()
		throws Exception {
		DefaultNumberRule fixture = new DefaultNumberRule();
		double input = 1.0;

		Number.Category result = fixture.getCategory(input);

		// add additional test code here
		assertNotNull(result);
		assertEquals("other", result.name());
		assertEquals("other", result.toString());
		assertEquals(5, result.ordinal());
	}

	/**
	 * Run the Rule getRule(Category) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 8:35 AM
	 */
	@Test
	public void testGetRule_1()
		throws Exception {
		DefaultNumberRule fixture = new DefaultNumberRule();
		Number.Category category = Number.Category.few;

		Rule result = fixture.getRule(category);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/15/17 8:35 AM
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
	 * @generatedBy CodePro at 5/15/17 8:35 AM
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
	 * @generatedBy CodePro at 5/15/17 8:35 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DefaultNumberRuleTest.class);
	}
}