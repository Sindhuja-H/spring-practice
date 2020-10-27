package com.training.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.training.examples.Calculator;
import com.training.examples.NegValueException;

class CalculatorTest {
	Calculator calculator;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all testcases");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all testcases");
	}

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
		System.out.println("Before each testcases");
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
		System.out.println("After each testcases");
	}

	@Test
	void testSum() {
		int actual = calculator.sum(10,20);
		assertEquals(30, actual);
	}
	@Test
	void testSumNeg() {
		int actual = calculator.sum(-10, 20);
				assertEquals(10, actual);
	}
	@Disabled
	@Test
	void testSubtract() {
		int actual = calculator.difference(-10,-20);
		assertEquals(10, actual);
	}
	@Test
	void testDivide() {
		int actual = calculator.divide(28,7);
		assertEquals(4, actual);
	}
	@Test 
	void testAverage() {
		double actual = calculator.average(2, 3, 4);
		assertEquals(3, actual);
	}
	@Test
	void testAverageNeg() {
		assertThrows(NegValueException.class,()->calculator.average(-9, -3, -3));
	}
}
