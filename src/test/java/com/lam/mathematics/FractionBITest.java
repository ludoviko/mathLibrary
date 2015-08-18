package com.lam.mathematics;

import java.math.BigInteger;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.FractionBI;

public class FractionBITest extends TestCase {

	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testAdd() {
		FractionBI expected = new FractionBI(BigInteger.valueOf(11),
				BigInteger.valueOf(2));
		FractionBI b = new FractionBI(BigInteger.valueOf(6),
				BigInteger.valueOf(2)).add(new FractionBI(
				BigInteger.valueOf(5), BigInteger.valueOf(2)));
		Assert.assertEquals(expected, b);
	}

	@Test
	public void testAddZero() {
		FractionBI fraction;
		FractionBI b;

		fraction = new FractionBI(BigInteger.ZERO);
		b = new FractionBI(BigInteger.valueOf(5), BigInteger.valueOf(2));
		Assert.assertEquals(b, b.add(fraction));
	}

	@Test
	public void testSubtract() {
		FractionBI expected = new FractionBI(BigInteger.valueOf(6),
				BigInteger.valueOf(2));
		FractionBI b = new FractionBI(BigInteger.valueOf(11),
				BigInteger.valueOf(2)).subtract(new FractionBI(BigInteger
				.valueOf(5), BigInteger.valueOf(2)));
		Assert.assertEquals(expected, b);
	}

	@Test
	public void testMultiply() {
		FractionBI expected = new FractionBI(BigInteger.valueOf(15), BigInteger.valueOf(21));
		FractionBI b = new FractionBI(BigInteger.valueOf(3), BigInteger.valueOf(7)).multiply(new FractionBI(BigInteger.valueOf(5), BigInteger.valueOf(3)));
		Assert.assertEquals(expected, b);
	}

	@Test
	public void testDivide() {
		FractionBI expected = new FractionBI(BigInteger.valueOf(3), BigInteger.valueOf(7));
		FractionBI b = new FractionBI(BigInteger.valueOf(15), BigInteger.valueOf(21)).divide(new FractionBI(BigInteger.valueOf(5), BigInteger.valueOf(3)));
		Assert.assertEquals(expected, b);
	}

	@Test
	public void testReduce() {
		FractionBI fraction = new FractionBI(BigInteger.valueOf(100), BigInteger.valueOf(5));
		FractionBI r = fraction.reduce();
		FractionBI expected = new FractionBI(BigInteger.valueOf(20));
		Assert.assertEquals(expected, r);
	}

	@Test
	public void testCompareTo() {
		Assert.assertTrue(new FractionBI(BigInteger.valueOf(100), BigInteger.valueOf(5)).compareTo(new FractionBI(BigInteger.valueOf(20))) == 0);
		Assert.assertTrue(new FractionBI(BigInteger.valueOf(3), BigInteger.valueOf(4))
				.compareTo(new FractionBI(BigInteger.valueOf(21), BigInteger.valueOf(28))) == 0);
	}

	@Test
	public void testCompareToDoesNotRendeOne() {
		Assert.assertFalse(new FractionBI(BigInteger.valueOf(100), BigInteger.valueOf(3)).compareTo(new FractionBI(BigInteger.valueOf(20))) == 0);
		Assert.assertFalse(new FractionBI(BigInteger.valueOf(3), BigInteger.valueOf(4))
				.compareTo(new FractionBI(BigInteger.valueOf(21), BigInteger.valueOf(27))) == 0);
	}

	@Test
	public void testCompareToGreaterThan() {
		Assert.assertTrue(new FractionBI(BigInteger.valueOf(100), BigInteger.valueOf(3))
				.compareTo(new FractionBI(BigInteger.valueOf(20), BigInteger.valueOf(3))) == 1);
		Assert.assertTrue(new FractionBI(BigInteger.valueOf(3), BigInteger.valueOf(4)).compareTo(new FractionBI(BigInteger.ONE, BigInteger.valueOf(27))) == 1);
	}

	@Test
	public void testCompareToLessThan() {
		Assert.assertTrue(new FractionBI(BigInteger.valueOf(100), BigInteger.valueOf(3))
				.compareTo(new FractionBI(BigInteger.valueOf(99), BigInteger.valueOf(2))) == -1);
		Assert.assertTrue(new FractionBI(BigInteger.valueOf(3), BigInteger.valueOf(4)).compareTo(new FractionBI(BigInteger.valueOf(4), BigInteger.valueOf(3))) == -1);
	}

	@Test
	public void testAddOne() {
		FractionBI total = null;
		FractionBI unit = new FractionBI(BigInteger.ONE);
		FractionBI n = new FractionBI(BigInteger.valueOf(3), BigInteger.valueOf(4));
		total = unit.add(n);
		Assert.assertEquals(new FractionBI(BigInteger.valueOf(7), BigInteger.valueOf(4)), total);
	}
}
