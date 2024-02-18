package com.tcs.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalculator3 {
	
	static Calculator cal;

	@BeforeAll //If same object is used, then add here
	static void setUpBeforeClass() throws Exception {
		cal = new Calculator();
		System.out.println("BeforeClass");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		cal=null;
		System.out.println("AfterClass");
	}



	
	@Test
	public void testAdd() {

		int result = cal.add(10, 10);
		boolean exp = true;
		boolean act= result>0 && result<=20;
		assertTrue(exp==act);
	}
	@Test
	public void testAdd2() {
		Calculator cal = new Calculator();
		int add = cal.add(10, 10);
		int exp = 20;
		assertEquals(exp, add);
	}
	
	@BeforeEach //If different object is used, then add here
	void setUp() throws Exception {
		System.out.println("Before");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After");
	}


}
