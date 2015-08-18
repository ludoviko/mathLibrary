package com.lam.mathematics;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.FibonacciRecursive;

public class FibonacciRecursiveTest {
	FibonacciRecursive fibonacci;

	@Before
	public void setUp() throws Exception {
		fibonacci = new FibonacciRecursive();
	}

	@After
	public void tearDown() throws Exception {
		fibonacci = null;
	}

	@Test
	public void testCalculate() {
		int n = 13;
		fibonacci.reset(n);
		long[] fibs = fibonacci.getFibonacci();

		Assert.assertEquals(n +1, fibs.length);
		Assert.assertEquals(233, fibonacci.find());

		Assert.assertEquals(0, fibs[0]);
		Assert.assertEquals(1, fibs[1]);
		Assert.assertEquals(1, fibs[2]);
		Assert.assertEquals(2, fibs[3]);
		Assert.assertEquals(3, fibs[4]);
		Assert.assertEquals(5, fibs[5]);
		Assert.assertEquals(8, fibs[6]);
		Assert.assertEquals(13, fibs[7]);
		Assert.assertEquals(21, fibs[8]);
		Assert.assertEquals(34, fibs[9]);
		Assert.assertEquals(55, fibs[10]);
		Assert.assertEquals(89, fibs[11]);
		Assert.assertEquals(144, fibs[12]);
		Assert.assertEquals(233, fibs[13]);
	}
}
