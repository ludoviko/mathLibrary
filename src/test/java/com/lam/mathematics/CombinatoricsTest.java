package com.lam.mathematics;


import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

import com.lam.mathematics.Combinatorics;

public class CombinatoricsTest  {
	@Test
	public void testPermutationsBI() {
//		Assert.assertEquals(new BigInteger(""), Combinatorics.permutationsBI(, ));
		Assert.assertEquals(new BigInteger("6"), Combinatorics.permutationsBI(3, 2));
		Assert.assertEquals(new BigInteger("5040"), Combinatorics.permutationsBI(10, 4));
		Assert.assertEquals(new BigInteger("10068347520"), Combinatorics.permutationsBI(49, 6));
	}
	

	@Test
	public void testCombinationsBI() {
//		Assert.assertEquals(new BigInteger(""), Combinatorics.combinationsBI(, ));
		Assert.assertEquals(new BigInteger("10"), Combinatorics.combinationsBI(5, 3));
		Assert.assertEquals(new BigInteger("13983816"), Combinatorics.combinationsBI(49, 6));
	}
	
	public void testfactorial() {
		Assert.assertEquals(1, Combinatorics.factorial(0));
		Assert.assertEquals(1, Combinatorics.factorial(1));
		Assert.assertEquals(2, Combinatorics.factorial(2));
		Assert.assertEquals(6, Combinatorics.factorial(3));
		Assert.assertEquals(24, Combinatorics.factorial(4));
	}

	@Test
	public void testfactorialBI() {
		Assert.assertEquals(new BigInteger("1"), Combinatorics.factorialBI(0));
		Assert.assertEquals(new BigInteger("1"), Combinatorics.factorialBI(1));
		Assert.assertEquals(new BigInteger("2"), Combinatorics.factorialBI(2));
		Assert.assertEquals(new BigInteger("6"), Combinatorics.factorialBI(3));
		Assert.assertEquals(new BigInteger("24"), Combinatorics.factorialBI(4));
	}
}
