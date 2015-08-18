package com.lam.mathematics;


import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.BenfordsLaw;

public class BenfordsLawTest extends TestCase {
	BenfordsLaw law;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		law = new BenfordsLaw();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		law = null;
	}

	@Test
	public void testQuestionableDigit() {
		Assert.assertEquals(1, law.questionableDigit(new int[] { 5236,7290,200,1907,3336,9182,17,4209,8746,7932,
				  6375,909,2189,3977,2389,2500,1239,3448,6380,4812 }, 2));
		Assert.assertEquals(2, law.questionableDigit(new int[] { 1,10,100,2,20,200,2000,3,30,300 }, 2));
		Assert.assertEquals(-1, law.questionableDigit(new int[] { 9,87,765,6543,54321,43219,321987,21987,1987,345,234,123 }, 2 ));
		Assert.assertEquals(9, law.questionableDigit(new int[] { 1,2,3,4,5,6,7,8,7,6,5,4,3,2,1 }, 8));
		Assert.assertEquals(8, law.questionableDigit(new int[] { 987,234,1234,234873487,876,234562,17,
				  7575734,5555,4210,678234,3999,8123 }, 3));
	}
}
