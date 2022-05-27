import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testadd() {
		// fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);

		int expected = 9999;
		assertEquals(expected, actual);
	}

	@Test
	public void testSubtract() {
		int a = 9876;
		int b = 4321;

		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);

		int expected = 5555;
		assertEquals(actual, expected);
	}

	@Test
	public void multiply() {
		int a = 2;
		int b = 1;

		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);

		int expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	public final void testdivide() {
		int a = 456;
		int b = 12;

		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);

		int expected = 38;
		assertEquals(expected, actual);
	}

}
