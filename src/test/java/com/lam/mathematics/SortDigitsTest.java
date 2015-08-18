package com.lam.mathematics;


import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.SortDigits;

public class SortDigitsTest extends TestCase {

	SortDigits sort;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		sort = new SortDigits();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		sort = null;
	}

	@Test
	public void testGoDesc() {
		sort.setDigits(61234L);
		sort.go(SortDigits.DESC);
		Assert.assertEquals(64321, sort.getNumber());
		sort.setDigits(3210654L);
		sort.go(SortDigits.DESC);
		Assert.assertEquals("6543210", sort.getNumberAsString());
	}

	@Test
	public void testGoAsc() {
		sort.setDigits(61234L);
		sort.go();
		Assert.assertEquals(12346, sort.getNumber());
		sort.setDigits(3210654L);
		sort.go(SortDigits.ASC);
		Assert.assertEquals("0123456", sort.getNumberAsString());
	}

}
