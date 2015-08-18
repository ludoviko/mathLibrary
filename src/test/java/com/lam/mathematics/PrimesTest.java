package com.lam.mathematics;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.Primes;

public class PrimesTest  extends TestCase {
   private Primes primes;
	
	@Before
	public void setUp() throws Exception {
	   super.setUp();
	   primes = new Primes();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
		primes = null;
	}

	@Test
	public void testMethod() {
		primes.find(20);;
		long[] array = primes.getArray();
		Assert.assertEquals(8, array.length);
		Assert.assertEquals(2, array[0]);
		Assert.assertEquals(3, array[1]);
		Assert.assertEquals(5, array[2]);
		Assert.assertEquals(7, array[3]);
		Assert.assertEquals(11, array[4]);
		Assert.assertEquals(13, array[5]);
		Assert.assertEquals(17, array[6]);
		Assert.assertEquals(19, array[7]);
	}

}
