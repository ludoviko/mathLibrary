package com.lam.mathematics;


import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.EulersTotientFunction;

public class EulersTotientFunctionTest extends TestCase {

	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testFind() {
		Assert.assertEquals(1L, EulersTotientFunction.findPhi(1));
		Assert.assertEquals(1, EulersTotientFunction.findPhi(2));
		Assert.assertEquals(2, EulersTotientFunction.findPhi(3));
		Assert.assertEquals(2, EulersTotientFunction.findPhi(4));
		Assert.assertEquals(4, EulersTotientFunction.findPhi(5));
		Assert.assertEquals(2, EulersTotientFunction.findPhi(6));
		Assert.assertEquals(6, EulersTotientFunction.findPhi(7));
		Assert.assertEquals(4, EulersTotientFunction.findPhi(8));
		Assert.assertEquals(6, EulersTotientFunction.findPhi(9));
		Assert.assertEquals(4, EulersTotientFunction.findPhi(10));
		Assert.assertEquals(10, EulersTotientFunction.findPhi(11));
		Assert.assertEquals(8, EulersTotientFunction.findPhi(20));
		Assert.assertEquals(16, EulersTotientFunction.findPhi(40));
		Assert.assertEquals(18, EulersTotientFunction.findPhi(19));
		Assert.assertEquals(28, EulersTotientFunction.findPhi(29));
		Assert.assertEquals(24, EulersTotientFunction.findPhi(39));
		Assert.assertEquals(42, EulersTotientFunction.findPhi(49));
		Assert.assertEquals(58, EulersTotientFunction.findPhi(59));
		Assert.assertEquals(44, EulersTotientFunction.findPhi(69));
		Assert.assertEquals(78, EulersTotientFunction.findPhi(79));
		Assert.assertEquals(88, EulersTotientFunction.findPhi(89));
		Assert.assertEquals(24, EulersTotientFunction.findPhi(90));
		Assert.assertEquals(60, EulersTotientFunction.findPhi(99));
	}
}
