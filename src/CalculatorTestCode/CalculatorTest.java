package CalculatorTestCode;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import CalculatorMainCode.Calculator;

public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("CalculatorTestCode");
    }

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}
	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}
} 