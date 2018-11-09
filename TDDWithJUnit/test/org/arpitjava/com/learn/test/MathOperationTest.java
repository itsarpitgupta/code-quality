package org.arpitjava.com.learn.test;

import static org.junit.jupiter.api.Assertions.*;

import org.arpitjava.com.learn.MathOperation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathOperationTest {

	private MathOperation mathOperation;
	@BeforeEach
	void setUp() throws Exception {
		mathOperation = new MathOperation();
	}

	@Test
	void adderTest() {
		long result = 10 + 20 + 29;
		System.out.println(mathOperation.add(10,20,29));
		assertEquals(result, mathOperation.add(10,20,29));
	}

	
	@Test
	void subtracterTest() {
		long result = 90 - 20;
		assertEquals(result, mathOperation.subtract(90,20));
	}
	
	
}
