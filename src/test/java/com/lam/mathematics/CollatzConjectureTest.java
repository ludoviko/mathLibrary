package com.lam.mathematics;


import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class CollatzConjectureTest  {
	List<Long> list;
	
	@Before
	public void setUp() throws Exception {
		list =  new LinkedList<Long>();
	}

	@After
    public void tearDown() throws Exception {
		list =  null;
	}

	@Test
	public void testFind() {
		list.add(new Long(13));
		list.add(new Long(40));
		list.add(new Long(20));
		list.add(new Long(10));
		list.add(new Long(5));
		list.add(new Long(16));
		list.add(new Long(8));
		list.add(new Long(4));
		list.add(new Long(2));
		list.add(new Long(1));

		CollatzConjecture  sequence = new CollatzConjecture();

		Assert.assertEquals(list, sequence.findSequence(13L));
	}
}
