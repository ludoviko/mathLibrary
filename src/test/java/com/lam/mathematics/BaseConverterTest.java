package com.lam.mathematics;


import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.Test;

import com.lam.mathematics.BaseConverter;

public class BaseConverterTest extends TestCase {

	@Test
	public void testBoundariesFrom10ToZ() {
		try {
			Assert.assertEquals("10000", BaseConverter.from10UpToZ(16, 37));
			fail("Expected Runtime Exception: Failure ");
		} catch (RuntimeException  re) {
			System.out.println("Exception catched: " + re.getMessage());
		}
	}

	@Test
	public void testBoundariestestFrom10UpToZ() {
		try {
			Assert.assertEquals( "FF", BaseConverter.from10UpToZ(255, 37));
			fail("Expected Runtime Exception: Failure ");
		} catch (RuntimeException  re) {
			System.out.println("Exception catched: " + re.getMessage());
		}
	}

	@Test
	public void testFrom10To9() {
		Assert.assertEquals("0", BaseConverter.from10UpToZ(0, 2));
		Assert.assertEquals("10000", BaseConverter.from10UpToZ(16, 2));
		Assert.assertEquals("101011", BaseConverter.from10UpToZ(43, 2));
		Assert.assertEquals("10011", BaseConverter.from10UpToZ(19, 2));
	}

	@Test
	public void testFrom10ToBin() {
		Assert.assertEquals("0", BaseConverter.from10ToBinary(0));
		Assert.assertEquals("10000", BaseConverter.from10ToBinary(16));
		Assert.assertEquals("101011", BaseConverter.from10ToBinary(43));
		Assert.assertEquals("10011", BaseConverter.from10ToBinary(19));
	}

	
	public void testToDecimalFromUpToZ() {
		Assert.assertEquals( 255, BaseConverter.toDecimalFromUpToZ("FF", 16 ));
		Assert.assertEquals( 19, BaseConverter.toDecimalFromUpToZ("10011",2 ));
		Assert.assertEquals( 43, BaseConverter.toDecimalFromUpToZ("101011",2 ));
		Assert.assertEquals( 9, BaseConverter.toDecimalFromUpToZ("30", 3));
	}

	
	public void testFrom10UpToZ() {
		Assert.assertEquals( "10", BaseConverter.from10UpToZ(16, 16 ));
		Assert.assertEquals( "FF", BaseConverter.from10UpToZ(255, 16 ));
		Assert.assertEquals( "FE", BaseConverter.from10UpToZ(254, 16));
	}
}
