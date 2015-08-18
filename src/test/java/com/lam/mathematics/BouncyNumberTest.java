package com.lam.mathematics;


import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.BouncyNumber;

public class BouncyNumberTest extends TestCase {

	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testIsBouncyFalse() {
		Assert.assertFalse(BouncyNumber.isBouncy(89));
		Assert.assertFalse(BouncyNumber.isBouncy(11234));
		Assert.assertFalse(BouncyNumber.isBouncy(4321));
		Assert.assertFalse(BouncyNumber.isBouncy(43211));
		Assert.assertFalse(BouncyNumber.isBouncy(134468));
		Assert.assertFalse(BouncyNumber.isBouncy(66420));
	}

	@Test
	public void testIsBouncyTrue() {
		Assert.assertFalse(BouncyNumber.isBouncy(1));
		Assert.assertFalse(BouncyNumber.isBouncy(1111));
		Assert.assertTrue(BouncyNumber.isBouncy(538));
		Assert.assertTrue(BouncyNumber.isBouncy(121));
		Assert.assertTrue(BouncyNumber.isBouncy(123412));
		Assert.assertTrue(BouncyNumber.isBouncy(155349));
	}
}
