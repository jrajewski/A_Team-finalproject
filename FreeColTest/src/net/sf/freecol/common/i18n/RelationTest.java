package net.sf.freecol.common.i18n;

import java.util.LinkedList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>RelationTest</code> contains tests for the class <code>{@link Relation}</code>.
 *
 * @generatedBy CodePro at 5/15/17 6:41 PM
 * @author michaeldavies
 * @version $Revision: 1.0 $
 */
public class RelationTest {


	/**
	 * Run the Relation(int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 6:41 PM
	 */
	@Test
	public void testRelation_2()
		throws Exception {
		int low = 1;
		int high = 1;

		Relation result = new Relation(low, high);

		// add additional test code here
		assertNotNull(result);
		assertEquals("n is 1", result.toString());
	}

	/**
	 * Run the boolean matches(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 6:41 PM
	 */
	@Test
	public void testMatches_1()
		throws Exception {
		Relation fixture = new Relation(1, 1);
		fixture.setNegated(true);
		fixture.setInteger(true);
		fixture.setMod(1);
		double number = 1.0;

		boolean result = fixture.matches(number);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean matches(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 6:41 PM
	 */
	@Test
	public void testMatches_2()
		throws Exception {
		Relation fixture = new Relation(1, 1);
		fixture.setNegated(true);
		fixture.setInteger(false);
		fixture.setMod(2);
		double number = 1.0;

		boolean result = fixture.matches(number);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setInteger(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 6:41 PM
	 */
	@Test
	public void testSetInteger_1()
		throws Exception {
		Relation fixture = new Relation(1, 1);
		fixture.setNegated(true);
		fixture.setInteger(true);
		fixture.setMod(1);
		boolean value = true;

		fixture.setInteger(value);

		// add additional test code here
	}

	/**
	 * Run the void setMod(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 6:41 PM
	 */
	@Test
	public void testSetMod_1()
		throws Exception {
		Relation fixture = new Relation(1, 1);
		fixture.setNegated(true);
		fixture.setInteger(true);
		fixture.setMod(1);
		int mod = 1;

		fixture.setMod(mod);

		// add additional test code here
	}

	/**
	 * Run the void setNegated(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 6:41 PM
	 */
	@Test
	public void testSetNegated_1()
		throws Exception {
		Relation fixture = new Relation(1, 1);
		fixture.setNegated(true);
		fixture.setInteger(true);
		fixture.setMod(1);
		boolean value = true;

		fixture.setNegated(value);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 6:41 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Relation fixture = new Relation(1, 1);
		fixture.setNegated(true);
		fixture.setInteger(false);
		fixture.setMod(1);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("n is not 1", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 6:41 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		Relation fixture = new Relation(1, 1);
		fixture.setNegated(false);
		fixture.setInteger(true);
		fixture.setMod(1);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("n is 1", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 6:41 PM
	 */
	@Test
	public void testToString_3()
		throws Exception {
		Relation fixture = new Relation(1, 1);
		fixture.setNegated(true);
		fixture.setInteger(true);
		fixture.setMod(2);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("n mod 2 is not 1", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/17 6:41 PM
	 */
	@Test
	public void testToString_4()
		throws Exception {
		Relation fixture = new Relation(1, 1);
		fixture.setNegated(false);
		fixture.setInteger(true);
		fixture.setMod(2);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("n mod 2 is 1", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/15/17 6:41 PM
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
	 * @generatedBy CodePro at 5/15/17 6:41 PM
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
	 * @generatedBy CodePro at 5/15/17 6:41 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RelationTest.class);
	}
}