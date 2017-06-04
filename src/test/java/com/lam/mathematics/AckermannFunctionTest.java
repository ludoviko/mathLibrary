package com.lam.mathematics;

import java.math.BigInteger;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.AckermannFunction;


public class AckermannFunctionTest {
	AckermannFunction a; 
	
	@Before
	public void setUp() throws Exception {
		a = new AckermannFunction();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test
	public void testFunctionBI() {
		BigInteger zero = new BigInteger("0");
		BigInteger one = new BigInteger("1");
		BigInteger two = new BigInteger("2");
		BigInteger three = new BigInteger("3");
		BigInteger four = new BigInteger("4");
		
		Assert.assertEquals(one, a.aBI(zero, zero));
		Assert.assertEquals(two, a.aBI(zero, one));
		Assert.assertEquals(three, a.aBI(zero, two));
		Assert.assertEquals(four, a.aBI(zero, three));
		Assert.assertEquals(new BigInteger("5"), a.aBI(zero, four));

		Assert.assertEquals(two, a.aBI(one, zero));
		Assert.assertEquals(three, a.aBI(one, one));
		Assert.assertEquals(four, a.aBI(one, two));
		Assert.assertEquals(new BigInteger("5"), a.aBI(one, three));
		Assert.assertEquals(new BigInteger("6"), a.aBI(one, four));

		Assert.assertEquals(three, a.aBI(two, zero));
		Assert.assertEquals(new BigInteger("5"), a.aBI(two, one));
		Assert.assertEquals(new BigInteger("7"), a.aBI(two, two));
		Assert.assertEquals(new BigInteger("9"), a.aBI(two, three));
		Assert.assertEquals(new BigInteger("11"), a.aBI(two, four));

		Assert.assertEquals(new BigInteger("5"), a.aBI(three, zero));
		Assert.assertEquals(new BigInteger("13"), a.aBI(three, one));
		Assert.assertEquals(new BigInteger("29"), a.aBI(three, two));
		Assert.assertEquals(new BigInteger("61"), a.aBI(three, three));
		Assert.assertEquals(new BigInteger("125"), a.aBI(three, four));

		Assert.assertEquals(new BigInteger("13"), a.aBI(four, zero));
		// Overflow
	//	Assert.assertEquals(new BigInteger("65533"), a.aBI(four, one));
	}
}
