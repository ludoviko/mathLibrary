package com.lam.mathematics;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.space.Slope;

/**
 */
public class SlopeTest  {
	Slope slope; 
	
	@Before
	public void setUp() throws Exception {
		slope = new Slope(4,3);
	}

	@After
	public void tearDown() throws Exception {
      slope = null;
	}
	
	@Test
    public void testIsInfinite() {
        Assert.assertTrue(new Slope(4, 0).isInfinite());
        Assert.assertTrue(new Slope(-5, 0).isInfinite());
        Assert.assertFalse(new Slope(0, 5).isInfinite());
        Assert.assertFalse(new Slope(0, -5).isInfinite());
    }

//	@Test
//    public void testIsIndetermined() {
//        Assert.assertTrue(new Slope(0, 0).isIndetermined());
//    }

	@Test
    public void testIsConstant() {
        Assert.assertTrue(new Slope(0, 5).isConstant());
        Assert.assertTrue(new Slope(0, -5).isConstant());
        Assert.assertFalse(new Slope(1, -5).isConstant());
        Assert.assertFalse(new Slope(16, -5).isConstant());
    }
	
	@Test
    public void testEquals() {
        Assert.assertTrue(new Slope(0, -5).equals(new Slope(0, -5)));
        Assert.assertTrue(new Slope(1, 3).equals(new Slope(1, 3)));
        Assert.assertTrue(new Slope(-1, 3).equals(new Slope(-1, 3)));
        Assert.assertFalse(new Slope(1, 3).equals(new Slope(1, -3)));
        Assert.assertFalse(new Slope(5, 0).equals(new Slope(9, 0)));
    }

	@Test
    public void testCompare() {
        Assert.assertEquals(1, new Slope(10, 1).compareTo(new Slope(1, 1)));
        Assert.assertEquals(1, new Slope(10, 3).compareTo(new Slope(1, 3)));
        Assert.assertEquals(1, new Slope(-1, 3).compareTo(new Slope(-10, 3)));
  
        Assert.assertEquals(0, new Slope(1, 3).compareTo(new Slope(2, 6)));
        Assert.assertEquals(0 , new Slope(5, 0).compareTo(new Slope(9, 0)));
        Assert.assertEquals(0, new Slope(0, -5).compareTo(new Slope(0, 10)));

        Assert.assertEquals(-1, new Slope(1, 3).compareTo(new Slope(10, 3)));
        Assert.assertEquals(-1, new Slope(1, 3).compareTo(new Slope(10, 0)));
	}

	@Test
    public void testAsDoubleForNonInfiniteSlope() {
        Assert.assertEquals(0, new Slope(0, 4).asDouble(), 0);
        Assert.assertEquals(0, new Slope(0, -4).asDouble(), 0);
        Assert.assertEquals(1, new Slope(3, 3).asDouble(), 0);
        Assert.assertEquals(1, new Slope(-3, -3).asDouble(), 0);
        Assert.assertEquals(-1, new Slope(3, -3).asDouble(), 0);
        Assert.assertEquals(-1, new Slope(-3, 3).asDouble(), 0);
        Assert.assertEquals(2, new Slope(6, 3).asDouble(), 0);
        Assert.assertEquals(1.5, new Slope(6, 4).asDouble(), 0);
    }

	@Test
    public void testAsDoubleFailsForInfiniteSlope() {
        try {
            new Slope(4, 0).asDouble();
            Assert.fail("should have blown up!");
        } catch (IllegalStateException e) {
        }
    }

	@Test
    public void testExceptionForIndeterminedSlope() {
        try {
            new Slope(0, 0);
            Assert.fail("should have blown up!");
        } catch (IllegalStateException e) {
        }
    }
}
