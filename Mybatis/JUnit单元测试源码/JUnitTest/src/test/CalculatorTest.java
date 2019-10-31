package test;


import org.junit.Test;

public class CalculatorTest {
	Calculator c=new Calculator();

	@Test
	public void testAdd() {
		c.add(2);
	}

	@Test
	public void testSubstract() {
		c.substract(3);
	}

	@Test
	public void testMultiply() {
		c.multiply(2);
	}

	@Test
	public void testDivide() {
		try {
			c.divide(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testSquare() {
		c.square(2);
	}

	@Test
	public void testSquareRoot() {
		c.squareRoot(3);
	}

	@Test
	public void testClear() {
		c.clear();
	}

}
