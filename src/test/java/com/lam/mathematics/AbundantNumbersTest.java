package com.lam.mathematics;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.AbundantNumbers;

public class AbundantNumbersTest {
	AbundantNumbers abundantNumbers;
	
	@Before
	public void setUp() throws Exception {
		abundantNumbers = new AbundantNumbers(10);
	}

	@After
	public void tearDown() throws Exception {
		abundantNumbers = null;
	}

	@Test
	public void testGetNumbers() {
		// First ten: 12, 18, 20, 24, 30, 36, 40, 42, 48, 54
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(12);
		expected.add(18);
		expected.add(20);
		expected.add(24);
		expected.add(30);
		expected.add(36);
		expected.add(40);
		expected.add(42);
		expected.add(48);
		expected.add(54);
		abundantNumbers.find();
		Assert.assertEquals(expected, abundantNumbers.getNumbers());
	}

}
