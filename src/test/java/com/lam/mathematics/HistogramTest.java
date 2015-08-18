package com.lam.mathematics;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.Histogram;

public class HistogramTest extends TestCase {

	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testFindHistogramIntArray() {
		long[] array = new long[] {4, 3, 3, 2, 3, -1, 3, 3};
		
		Map<Long, Long> map = new HashMap<Long, Long>();
		map.put(3L, 5L);
		map.put(4L, 1L);
		map.put(2L, 1L);
		map.put(-1L, 1L);
		
		Assert.assertEquals(map, Histogram.findHistogram(array));
	}

	@Test
	public void testFindHistogramListOfLong() {
		List<Long> list = new ArrayList<Long>();
		list.add(4L);
		list.add(3L);
		list.add(3L);
		list.add(2L);
		list.add(3L);
		list.add(-1L);
		list.add(3L);
		list.add(3L);

		Map<Long, Long> map = new HashMap<Long, Long>();
		map.put(3L, 5L);
		map.put(4L, 1L);
		map.put(2L, 1L);
		map.put(-1L, 1L);
		
		Assert.assertEquals(map, Histogram.findHistogram(list));
	}

	@Test
	public void testFindGreatest() {
		Map<Long, Long> map = new HashMap<Long, Long>();
		map.put(3L, 5L);
		map.put(4L, 1L);
		map.put(2L, 1L);
		map.put(-1L, 1L);
		
		Assert.assertEquals(new Long(3), Histogram.findModa(map).getKey());
		Assert.assertEquals(new Long(5), Histogram.findModa(map).getValue());
	}
}
