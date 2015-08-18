package com.lam.mathematics;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.Fraction;

public class FractionTest extends TestCase {

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
		Fraction fraction = new Fraction(11, 2);
		Fraction b = new Fraction(6, 2).add(new Fraction(5, 2));
		Assert.assertEquals(fraction, b);
	}

	@Test
	public void testAddZero() {
		Fraction fraction;
		Fraction b;

	    fraction = new Fraction(0);
		b = new Fraction(5, 2);
		Assert.assertEquals(b, b.add(fraction));
	}

	
	@Test
	public void testSubtract() {
		Fraction fraction = new Fraction(6, 2);
		Fraction b = new Fraction(11, 2).subtract(new Fraction(5, 2));
		Assert.assertEquals(fraction, b);
	}

	@Test
	public void testMultiply() {
		Fraction fraction = new Fraction(15, 21);
		Fraction b = new Fraction(3, 7).multiply(new Fraction(5, 3));
		Assert.assertEquals(fraction, b);
	}

	@Test
	public void testDivide() {
		Fraction fraction = new Fraction(3, 7);
		Fraction b = new Fraction(15, 21).divide(new Fraction(5, 3));
		Assert.assertEquals(fraction, b);
	}

	 @Test
	 public void testReduce() {
			Fraction fraction = new Fraction(100, 5);
			Fraction r = fraction.reduce();
			Fraction expecterd = new Fraction(20);
			Assert.assertEquals(expecterd, r);
	 }
	
	 @Test
	 public void testCompareTo() {
		 Assert.assertTrue(new Fraction(100, 5).compareTo(new Fraction(20)) == 0);
		 Assert.assertTrue(new Fraction(3, 4).compareTo(new Fraction(21,28)) == 0);
	 }

	 @Test
	 public void testCompareToDoesNotRendeOne() {
		 Assert.assertFalse(new Fraction(100, 3).compareTo(new Fraction(20)) == 0);
		 Assert.assertFalse(new Fraction(3, 4).compareTo(new Fraction(21,27)) == 0);
	 }

	 @Test
	 public void testCompareToGreaterThan() {
		 Assert.assertTrue(new Fraction(100, 3).compareTo(new Fraction(20, 3)) == 1);
		 Assert.assertTrue(new Fraction(3, 4).compareTo(new Fraction(1,27)) == 1);
	 }

	 @Test
	 public void testCompareToLessThan() {
		 Assert.assertTrue(new Fraction(100, 3).compareTo(new Fraction(99,2)) == -1);
		 Assert.assertTrue(new Fraction(3, 4).compareTo(new Fraction(4,3)) == -1);
	 }

	 @Test
	 public void testAddOne() {
			Fraction total = null;
			Fraction unit = new Fraction(1); 
			Fraction n = new Fraction(3,4); 
			total = unit.add(n);
			 Assert.assertEquals(new Fraction(7, 4), total);
	 }
}
