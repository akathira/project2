package com.tcs.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {

	@Test
	public void testAdd() {
		Calculator cal = new Calculator();
		int add = cal.add(10, 10);
		int exp = 20;
		assertEquals(exp, add);
	}

	@Test
	public void add() {
		fail("test");
	}

}