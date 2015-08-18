package com.lam.mathematics;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.PascalTriangleBI;

public class PascalTriangleBITest {
	PascalTriangleBI pascal;
	
	@Before
	public void setUp() throws Exception {
		pascal = new PascalTriangleBI();
	}

	@After
	public void tearDown() throws Exception {
		pascal = null;
	}

	@Test
	public void testPascalElements() {
		List<BigInteger> list = new ArrayList<BigInteger>();
		list.add(new BigInteger("1"));
		list.add(new BigInteger("1"));
		list.add(new BigInteger("1"));
		Assert.assertEquals(list, pascal.findPascal(1));
		list.add(new BigInteger("1"));
		list.add(new BigInteger("2"));
		list.add(new BigInteger("1"));
		Assert.assertEquals(list, pascal.findPascal(2));
		list.add(new BigInteger("1"));
		list.add(new BigInteger("3"));
		list.add(new BigInteger("3"));
		list.add(new BigInteger("1"));
		Assert.assertEquals(list, pascal.findPascal(3));
		list.add(new BigInteger("1"));
		list.add(new BigInteger("4"));
		list.add(new BigInteger("6"));
		list.add(new BigInteger("4"));
		list.add(new BigInteger("1"));
		Assert.assertEquals(list, pascal.findPascal(4));
	}

	@Test
	public void findElementsFromRow() {
		BigInteger[] array = new BigInteger[2];
		array[0] = new BigInteger("1");
		array[1] = new BigInteger("1");
		Assert.assertArrayEquals(array, pascal.findPascalRow(1));
		array = new BigInteger[3];
		array[0] = new BigInteger("1");
		array[1] = new BigInteger("2");
		array[2] = new BigInteger("1");
		Assert.assertArrayEquals(array, pascal.findPascalRow(2));
		array = new BigInteger[4];
		array[0] = new BigInteger("1");
		array[1] = new BigInteger("3");
		array[2] = new BigInteger("3");
		array[3] = new BigInteger("1");
		Assert.assertArrayEquals(array, pascal.findPascalRow(3));
		array = new BigInteger[5];
		array[0] = new BigInteger("1");
		array[1] = new BigInteger("4");
		array[2] = new BigInteger("6");
		array[3] = new BigInteger("4");
		array[4] = new BigInteger("1");
		Assert.assertArrayEquals(array, pascal.findPascalRow(4));
	}
}
