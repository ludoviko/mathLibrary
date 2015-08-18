package com.lam.mathematics;


import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.FindRepeatingDecimal;

public class FindRepeatingDecimalTest extends TestCase {

	FindRepeatingDecimal decimal;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		decimal = new FindRepeatingDecimal();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		decimal = null;
	}

	@Test
	public void testFindRepeatingDecimal() {
		decimal.findRepeatingDecimal(6);
		Assert.assertEquals(1, decimal.getLength());
		Assert.assertEquals("0,16", decimal.getDecimal());
		
		decimal.findRepeatingDecimal(7);
		Assert.assertEquals(6, decimal.getLength());
		Assert.assertEquals("0,142857", decimal.getDecimal());

		decimal.findRepeatingDecimal(14);
		Assert.assertEquals(6, decimal.getLength());
		Assert.assertEquals("0,0714285", decimal.getDecimal());
	}
}
