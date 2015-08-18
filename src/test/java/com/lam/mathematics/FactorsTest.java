package com.lam.mathematics;


import java.util.Set;
import java.util.TreeSet;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.Factors;

public class FactorsTest extends TestCase {
	Factors factors; 
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		factors = new Factors();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testFind() {
		Set<Long> set = new TreeSet<Long>();
		set.add(1L);
		set.add(2L);
		set.add(3L);
		set.add(4L);
		set.add(6L);
		set.add(8L);
		set.add(12L);
		set.add(16L);
		set.add(24L);
		set.add(48L);
		
        factors.find(48L); 
		Assert.assertEquals(set, factors.getFactors());
	}

	@Test
	public void testFindProperDivisors() {
		Set<Long> set = new TreeSet<Long>();
		set.add(1L);
		set.add(2L);
		set.add(3L);
		set.add(4L);
		set.add(6L);
		set.add(8L);
		set.add(12L);
		set.add(16L);
		set.add(24L);
		
        factors.find(48L); 
		Assert.assertEquals(set, factors.getProperDivisors());
	}
}
