package com.lam.mathematics;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.Bitwise;

public class BitwiseTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindBit() {
		Assert.assertEquals(1, Bitwise.findBit(1, 0));
		Assert.assertEquals(1, Bitwise.findBit(3, 0));
		Assert.assertEquals(1, Bitwise.findBit(3, 1));
		Assert.assertEquals(0, Bitwise.findBit(3, 2));
	}
}
