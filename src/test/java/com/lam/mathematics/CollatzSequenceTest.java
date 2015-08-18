package com.lam.mathematics;


import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.CollatzSequence;

public class CollatzSequenceTest extends TestCase {

	List<Long> list;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		list =  new ArrayList<Long>();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
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

		CollatzSequence  sequence = new CollatzSequence(new ArrayList<Long>());  
		sequence.find(13);
		
		Assert.assertEquals(list, sequence.getList());
	}

}
