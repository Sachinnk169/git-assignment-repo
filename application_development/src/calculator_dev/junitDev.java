package calculator_dev;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class junitDev {

	@Test
	public void calculatorTest() {
		assertEquals(40, Calculator.add(10, 30));
	}
	
	@Test
	public void calculatorTestSub() {
		assertEquals(50, Calculator.sub(70, 30));
	}
	
	@Test
	public void calculatorTestMul() {
		assertEquals(300, Calculator.mul(10, 30));
	}
	
	@Test
	public void calculatorTextDiv() {
		assertEquals(5, Calculator.div(45, 9));
	}
}
