package com.lam.mathematics;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.NumberTheory;

public class NumberTheoryTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSigma() {
		Assert.assertEquals(28, NumberTheory.sigma(12));
		Assert.assertEquals(195, NumberTheory.sigma(72));
	}

	@Test
	public void testIsPerfect() {
		Assert.assertTrue(NumberTheory.isPerfect(6));
		Assert.assertTrue(NumberTheory.isPerfect(28));
		Assert.assertTrue(NumberTheory.isPerfect(496));
		Assert.assertTrue(NumberTheory.isPerfect(8128));
	}

	@Test
	public void testIsNotPerfect() {
		Assert.assertFalse(NumberTheory.isPerfect(7));
		Assert.assertFalse(NumberTheory.isPerfect(29));
		Assert.assertFalse(NumberTheory.isPerfect(497));
		Assert.assertFalse(NumberTheory.isPerfect(8129));
	}

	@Test
	public void testIsAbundant() {
		Assert.assertTrue(NumberTheory.isAbundant(12));
	}

	@Test
	public void testIsNotAbundant() {
		Assert.assertFalse(NumberTheory.isAbundant(496));
	}

	@Test
	public void testIsDeficient() {
		Assert.assertTrue(NumberTheory.isDeficient(10));
	}

	@Test
	public void testIsNotDeficient() {
		Assert.assertFalse(NumberTheory.isDeficient(496));
	}
	
	@Test
	public void testTriangleNumbers() {
		Assert.assertEquals(28, NumberTheory.triangleNumber(7));
		Assert.assertEquals(36, NumberTheory.triangleNumber(8));
		Assert.assertEquals(76576500, NumberTheory.triangleNumber(12375));
	}
	
	@Test
	public void testIsHappyNumber() {
		Assert.assertTrue(NumberTheory.isHappyNumber(1));
		Assert.assertTrue(NumberTheory.isHappyNumber(47443422));
		Assert.assertTrue(NumberTheory.isHappyNumber(7));
		Assert.assertTrue(NumberTheory.isHappyNumber(913));
		Assert.assertTrue(NumberTheory.isHappyNumber(921));
		
		Assert.assertFalse(NumberTheory.isHappyNumber(4));
		Assert.assertFalse(NumberTheory.isHappyNumber(89));
//		Assert.assertTrue(NumberTheory.isHappyNumber());
	}
}
