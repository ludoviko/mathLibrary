package com.lam.mathematics;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.Digits;

public class DigitsTest extends TestCase {

	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testRotate() {
		Assert.assertArrayEquals(new Long[] { new Long(123), new Long(231),
				new Long(312) }, Digits.rotate(123));
		Assert.assertArrayEquals(new Long[] { new Long(1) }, Digits.rotate(1));
	}

	@Test
	public void testTruncateFromRight() {
		Assert.assertArrayEquals(new Long[] { new Long(3), new Long(37),
				new Long(379), new Long(3797) }, Digits.truncateFromRight(3797));
	}

	@Test
	public void testTruncateFromLeft() {
		Assert.assertArrayEquals(new Long[] { new Long(7), new Long(97),
				new Long(797), new Long(3797) }, Digits.truncateFromLeft(3797));
	}

	@Test
	public void testTruncateFromRightAndLeft() {
		Assert.assertArrayEquals(new Long[] { new Long(3), new Long(7),
				new Long(37), new Long(97), new Long(379), new Long(797),
				new Long(3797) }, Digits.truncate(3797));
	}

	@Test
	public void testIsPalindrome() {
		Assert.assertTrue(Digits.isPalindrome(1));
		Assert.assertTrue(Digits.isPalindrome(4));
		Assert.assertTrue(Digits.isPalindrome(9));
		Assert.assertTrue(Digits.isPalindrome(121));
		Assert.assertTrue(Digits.isPalindrome(484));
		Assert.assertTrue(Digits.isPalindrome(676));
		Assert.assertTrue(Digits.isPalindrome(10201));
		Assert.assertTrue(Digits.isPalindrome(12321));
		Assert.assertTrue(Digits.isPalindrome(14641));
		Assert.assertTrue(Digits.isPalindrome(40804));
		Assert.assertTrue(Digits.isPalindrome(44944));
		Assert.assertTrue(Digits.isPalindrome(69696));
		Assert.assertFalse(Digits.isPalindrome(12345));
	}

	@Test
	public void testReverse() {
		Assert.assertEquals(11, Digits.reverse(11));
		Assert.assertEquals(12345, Digits.reverse(54321));
	}
	
	@Test
	public void testReverseInAnyBase() {
		Assert.assertEquals(11, Digits.reverse(13, 2));
		Assert.assertEquals(11, Digits.reverseBinary(13));
	}
	

	@Test
	public void testMakePalindrom() {
		Assert.assertEquals(12321, Digits.makePalindrome(123, 10, true));
		Assert.assertEquals(123321, Digits.makePalindrome(123, 10, false));
	}

	@Test
	public void testMakePalindromInBase2() {
		Assert.assertEquals(127, Digits.makePalindrome(15, 2, true));
		Assert.assertEquals(255, Digits.makePalindrome(15, 2, false));
		Assert.assertEquals(127, Digits.makePalindromeBase2(15, true));
		Assert.assertEquals(255, Digits.makePalindromeBase2(15, false));
	}

	@Test
	public void testMakePalindromeEven() {
		Assert.assertEquals(-1, Digits.makePalindromeEven(0));
		Assert.assertEquals(11, Digits.makePalindromeEven(1));
		Assert.assertEquals(-1, Digits.makePalindromeEven(11));
		Assert.assertEquals(-1, Digits.makePalindromeEven(123));
		Assert.assertEquals(-1, Digits.makePalindromeEven(1234));
		Assert.assertEquals(1551, Digits.makePalindromeEven(151));
		Assert.assertEquals(123321, Digits.makePalindromeEven(12321));
	}
	
	@Test
	public void testInPalindromInBase2() {
		Assert.assertEquals(127, Digits.makePalindrome(15, 2, true));
		Assert.assertEquals(127, Digits.makePalindromeBase2(15, true));
		Assert.assertTrue(Digits.isPalindrome(127, 2));
	
		Assert.assertEquals(255, Digits.makePalindrome(15, 2, false));
		Assert.assertEquals(255, Digits.makePalindromeBase2(15, false));
		Assert.assertTrue(Digits.isPalindrome(255, 2));
	}
	
	
	@Test
	public void testSumDigits() {
		Assert.assertEquals(45, Digits.sum(123456789));
		Assert.assertEquals(36, Digits.sum(12345678));
		Assert.assertEquals(45, Digits.sum("123456789"));
		Assert.assertEquals(36, Digits.sum("12345678"));
		Assert.assertEquals(0, Digits.sum(0));
		Assert.assertEquals(0, Digits.sum("0"));
	}
	
	@Test
	public void testMultiplyDigits() {
		Assert.assertEquals(1, Digits.multiply(1));
		Assert.assertEquals(0, Digits.multiply(0));
		Assert.assertEquals(0, Digits.multiply(10));
		Assert.assertEquals(5, Digits.multiply(15));
		Assert.assertEquals(14, Digits.multiply(27));
		Assert.assertEquals(24, Digits.multiply(1234));
	}
}
