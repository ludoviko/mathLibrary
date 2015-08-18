package com.lam.mathematics;


import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.AmicableNumber;

public class AmicableNumberTest extends TestCase {

	AmicableNumber ami;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		ami = new AmicableNumber();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		ami = null;
	}

	@Test
	public void testIsAmicable() {
		Assert.assertTrue(ami.isAmicable(220));
		Assert.assertEquals(284, ami.getAmicable());
		Assert.assertTrue(ami.isAmicable(284));
		Assert.assertEquals(220, ami.getAmicable());
	}

}
