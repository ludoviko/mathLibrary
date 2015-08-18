package com.lam.mathematics;


import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.SpiralGrid;

public class SpiralGridTest extends TestCase {
	SpiralGrid spiral; 
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		spiral = new SpiralGrid();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		spiral = null;
	}

	@Test
	public void testGetSumDiagonals() {
		spiral.setGrid(new int[5][5]);
		spiral.fillGrid();
		Assert.assertEquals(101, spiral.getSumDiagonals());
	}
}
