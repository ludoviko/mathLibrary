package com.lam.mathematics;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AmicableNumberTest {

	AmicableNumber ami;
	
	@Before
    public void setUp() throws Exception {
		ami = new AmicableNumber();
	}

	@After
    public void tearDown() throws Exception {
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
