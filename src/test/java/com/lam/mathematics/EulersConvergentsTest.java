package com.lam.mathematics;

import java.math.BigInteger;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class EulersConvergentsTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Ignore
	// Class in construction....
	@Test
	public void testFind() {
		Assert.assertEquals(new FractionBI(new BigInteger("8"), new BigInteger("3")), EulersConvergents.find(3));
		Assert.assertEquals(new FractionBI(new BigInteger("2")), EulersConvergents.find(1));
		Assert.assertEquals(new FractionBI(new BigInteger("3")), EulersConvergents.find(2));
		//2, 3, 8/3, 11/4, 19/7, 87/32, 106/39, 193/71, 1264/465, 1457/536, 
//		Assert.assertEquals(new FractionBI(new BigInteger(""), new BigInteger("")), EulersConvergents.find());
//		Assert.assertEquals(new FractionBI(new BigInteger(""), new BigInteger("")), EulersConvergents.find());
//		Assert.assertEquals(new FractionBI(new BigInteger(""), new BigInteger("")), EulersConvergents.find());
//		Assert.assertEquals(new FractionBI(new BigInteger(""), new BigInteger("")), EulersConvergents.find());
//		Assert.assertEquals(new FractionBI(new BigInteger(""), new BigInteger("")), EulersConvergents.find());
//		Assert.assertEquals(new FractionBI(new BigInteger(""), new BigInteger("")), EulersConvergents.find());
//		Assert.assertEquals(new FractionBI(new BigInteger(""), new BigInteger("")), EulersConvergents.find());
	}

}
