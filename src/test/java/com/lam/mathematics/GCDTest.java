package com.lam.mathematics;

import java.math.BigInteger;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

import com.lam.mathematics.GCD;

public class GCDTest extends TestCase {
	@Test
	public void testMCD() {
        Assert.assertEquals(146, GCD.find(1314, 2336)); 
	}
	
	@Test
	public void testLCM() {
	       Assert.assertEquals(21024, GCD.findLCM(1314, 2336)); 
	}
	
	@Test
	public void testMCD_BI() {
        Assert.assertEquals(new BigInteger("146"), GCD.find(new BigInteger("1314"), new BigInteger("2336")));
	}
	
	@Test
	public void testLCM_BI() {
	       Assert.assertEquals(new BigInteger("21024"), GCD.findLCM(new BigInteger("1314"), new BigInteger("2336"))); 
	}
	
	@Test
	public void testRelativePrimeBI() {
	       Assert.assertTrue(GCD.relativePrime(new BigInteger("10"), new BigInteger("9"))); 
	       Assert.assertTrue(GCD.relativePrime(new BigInteger("25"), new BigInteger("6"))); 
	       Assert.assertTrue(GCD.relativePrime(new BigInteger("7"), new BigInteger("13")));
	       Assert.assertFalse(GCD.relativePrime(new BigInteger("21"), new BigInteger("14")));
	}

	@Test
	public void testRelativePrime() {
	       Assert.assertTrue(GCD.relativePrime(2, 1)); 
	       Assert.assertTrue(GCD.relativePrime(10, 9)); 
	       Assert.assertTrue(GCD.relativePrime(25, 6)); 
	       Assert.assertTrue(GCD.relativePrime(7, 13)); 
	       Assert.assertFalse(GCD.relativePrime(21, 14)); 
	}
}
