package com.lam.mathematics;


import java.math.BigInteger;

import org.junit.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.FractionBI;
import com.lam.mathematics.SquareRootOfTwoConvergents;

public class SquareRootOfTwoConvergentsTest  {
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFind() {
		Assert.assertEquals(new FractionBI(new BigInteger("3"), new BigInteger("2")), SquareRootOfTwoConvergents.find(2, 1));
		Assert.assertEquals(new FractionBI(new BigInteger("7"), new BigInteger("5")), SquareRootOfTwoConvergents.find(2, 2));
		Assert.assertEquals(new FractionBI(new BigInteger("17"), new BigInteger("12")), SquareRootOfTwoConvergents.find(2, 3));
		Assert.assertEquals(new FractionBI(new BigInteger("41"), new BigInteger("29")), SquareRootOfTwoConvergents.find(2, 4));
		Assert.assertEquals(new FractionBI(new BigInteger("99"), new BigInteger("70")), SquareRootOfTwoConvergents.find(2, 5));
		Assert.assertEquals(new FractionBI(new BigInteger("239"), new BigInteger("169")), SquareRootOfTwoConvergents.find(2, 6));
		Assert.assertEquals(new FractionBI(new BigInteger("577"), new BigInteger("408")), SquareRootOfTwoConvergents.find(2, 7));
		Assert.assertEquals(new FractionBI(new BigInteger("1393"), new BigInteger("985")), SquareRootOfTwoConvergents.find(2, 8));
		Assert.assertEquals(new FractionBI(new BigInteger("3363"), new BigInteger("2378")), SquareRootOfTwoConvergents.find(2, 9));
	}
}
