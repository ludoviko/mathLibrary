package com.lam.mathematics;


import java.math.BigInteger;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.Factorial;

public class FactorialTest extends TestCase {

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
		Assert.assertEquals(1, Factorial.find(0));
		Assert.assertEquals(1, Factorial.find(1));
		Assert.assertEquals(2, Factorial.find(2));
		Assert.assertEquals(6, Factorial.find(3));
		Assert.assertEquals(24, Factorial.find(4));
	}

	@Test
	public void testFindBI() {
		Assert.assertEquals(new BigInteger("1"), Factorial.findBI(0));
		Assert.assertEquals(new BigInteger("1"), Factorial.findBI(1));
		Assert.assertEquals(new BigInteger("2"), Factorial.findBI(2));
		Assert.assertEquals(new BigInteger("6"), Factorial.findBI(3));
		Assert.assertEquals(new BigInteger("24"), Factorial.findBI(4));
	}

}
