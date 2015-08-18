package com.lam.mathematics;


import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.Factorize;

public class FactorizeTest extends TestCase {
	Factorize factorize;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		factorize = new Factorize();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		factorize = null;
	}

	@Test
	public void testFind() {
		List<Long> list = new ArrayList<Long>();
		list.add(2L);
		list.add(2L);
		list.add(2L);
		list.add(2L);
		list.add(3L);
		Assert.assertEquals(list, Factorize.find(48));
	}


	@Test
	public void testNumberOfFactors() {
		Assert.assertEquals(10, Factorize.numberOfFactors(48));
	}
}
