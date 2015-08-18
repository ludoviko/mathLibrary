package com.lam.mathematics;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.PanDigital;

public class PanDigitalTest extends TestCase {

	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testIsNotPanDigitalLong() {
		Assert.assertFalse(PanDigital.isPanDigital(98765123));
		Assert.assertFalse(PanDigital.isPanDigital(12345789));
		Assert.assertFalse(PanDigital.isPanDigital(12349876));
		Assert.assertFalse(PanDigital.isPanDigital(987650234));
	}

	@Test
	public void testIsNotPanDigitalIncludingZeroLong() {
		Assert.assertFalse(PanDigital.isPanDigitalIncludingZero(1234567790));
		Assert.assertFalse(PanDigital.isPanDigitalIncludingZero(123467089));
		Assert.assertFalse(PanDigital.isPanDigitalIncludingZero(123459876));
	}

	@Test
	public void testIsNotPanDigitalString() {
		Assert.assertFalse(PanDigital.isPanDigital("987651134"));
		Assert.assertFalse(PanDigital.isPanDigital("12346789"));
		Assert.assertFalse(PanDigital.isPanDigital("23459876"));
	}

	@Test
	public void testIsNotPanDigitalIncludingZeroString() {
		Assert.assertFalse(PanDigital.isPanDigitalIncludingZero("987651234"));
		Assert.assertFalse(PanDigital.isPanDigitalIncludingZero("123456789"));
		Assert.assertFalse(PanDigital.isPanDigitalIncludingZero("123459876"));
	}

	@Test
	public void testIsPanDigitalLong() {
		Assert.assertTrue(PanDigital.isPanDigital(987651234));
		Assert.assertTrue(PanDigital.isPanDigital(123456789));
		Assert.assertTrue(PanDigital.isPanDigital(123459876));
	}

	@Test
	public void testIsPanDigitalIncludingZeroLong() {
		Assert.assertTrue(PanDigital.isPanDigitalIncludingZero(1234567890));
		Assert.assertTrue(PanDigital.isPanDigitalIncludingZero(1234567089));
		Assert.assertTrue(PanDigital.isPanDigitalIncludingZero(1230459876));
	}

	@Test
	public void testIsPanDigitalString() {
		Assert.assertTrue(PanDigital.isPanDigital("987651234"));
		Assert.assertTrue(PanDigital.isPanDigital("123456789"));
		Assert.assertTrue(PanDigital.isPanDigital("123459876"));
	}

	@Test
	public void testIsPanDigitalIncludingZeroString() {
		Assert.assertTrue(PanDigital.isPanDigitalIncludingZero("9087651234"));
		Assert.assertTrue(PanDigital.isPanDigitalIncludingZero("1023456789"));
		Assert.assertTrue(PanDigital.isPanDigitalIncludingZero("0123459876"));
	}


}
