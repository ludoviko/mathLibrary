package com.lam.mathematics;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.ChampernownesConstant;

public class ChampernownesConstantTest {
	ChampernownesConstant champer;
	int size;
	
	@Before
	public void setUp() throws Exception {
		champer = new ChampernownesConstant();
	}

	@After
	public void tearDown() throws Exception {
		champer = null;
		size = 0;
	}

	@Test
	public void testGetChampernownes() {
		int size = 10;
		champer.setUpToFractionalPosition(10);
		champer.setChampernownes();
		Assert.assertEquals(size  + 2, champer.getChampernownes().length());
		Assert.assertEquals("0.1234567891", champer.getChampernownes().toString());
		
		size = 25;
		champer.setUpToFractionalPosition(size);
		champer.setChampernownes();
		Assert.assertEquals(size + 2, champer.getChampernownes().length());
		Assert.assertEquals("0.1234567891011121314151617", champer.getChampernownes().toString());
	}
}
