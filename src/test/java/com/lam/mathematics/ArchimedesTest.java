package com.lam.mathematics;


import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.geometry.Archimedes;

public class ArchimedesTest extends TestCase {
	Archimedes archimedes;
	double precision = 0.000000001;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		archimedes = new Archimedes();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		archimedes = null;
	}

	@Test
	public void testApproximatePi() {
		Assert.assertTrue(archimedes.approximatePi(96) < 22.0/7);
		Assert.assertTrue(archimedes.approximatePi(96) > 223.0/71);
	}
}
