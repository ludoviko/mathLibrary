package com.lam.mathematics;

import org.junit.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.HornerMethod;

public class HornerMethodTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFind_2() {
		// 2x3 - 6x2 + 2x - 1 at x = 3; 5
		Assert.assertEquals(5,
				HornerMethod.find_2(3L, new long[] { -1, 2, -6, 2 }));
		// 2x3 - x2 - 6x + 5 at x = 3; 32
		Assert.assertEquals(32,
				HornerMethod.find_2(3L, new long[] { 5, -6, -1, 2 }));
		// x4 + 3x3 + 5x2 + 7x + 9 at x = 2, 83
		Assert.assertEquals(83,
				HornerMethod.find_2(2L, new long[] { 9, 7, 5, 3, 1 }));
		// 2x^3 − 3x^2 + 5x − 7 for x = 3; 35
		Assert.assertEquals(35,
				HornerMethod.find_2(3L, new long[] { -7, 5, -3, 2, 0 }));
	}

	@Test
	public void testFind() {
		// 2x3 - 6x2 + 2x - 1 at x = 3; 5
		Assert.assertEquals(5,
				HornerMethod.find(3L, new long[] { -1, 2, -6, 2 }));
		// 2x3 - x2 - 6x + 5 at x = 3; 32
		Assert.assertEquals(32,
				HornerMethod.find(3L, new long[] { 5, -6, -1, 2 }));
		// x4 + 3x3 + 5x2 + 7x + 9 at x = 2, 83
		Assert.assertEquals(83,
				HornerMethod.find(2L, new long[] { 9, 7, 5, 3, 1 }));
		// 2x^3 − 3x^2 + 5x − 7 for x = 3; 35
		Assert.assertEquals(35,
				HornerMethod.find(3L, new long[] { -7, 5, -3, 2, 0 }));
	}

}
