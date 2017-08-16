package com.lam.mathematics;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.hamcrest.CoreMatchers;

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

	@Test
	public void testCountBits() {
        Assert.assertThat("Should be the same.", Bitwise.countBits(0), CoreMatchers.is(0));
        Assert.assertThat("Should be the same.", Bitwise.countBits(1), CoreMatchers.is(1));
        Assert.assertThat("Should be the same.", Bitwise.countBits(2), CoreMatchers.is(1));
        Assert.assertThat("Should be the same.", Bitwise.countBits(3), CoreMatchers.is(2));
        Assert.assertThat("Should be the same.", Bitwise.countBits(31), CoreMatchers.is(5));
		Assert.assertThat("Should be the same.", Bitwise.countBits(-1), CoreMatchers.is(32));
//        Assert.assertThat("Should be the same.", Bitwise.countBits(), CoreMatchers.is(1));
	}

}
