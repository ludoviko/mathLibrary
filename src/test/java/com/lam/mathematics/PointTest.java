package com.lam.mathematics;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.space.Point;

public class PointTest  {
	Point point;
	
	@Before
	public void setUp() throws Exception {
	   point = new Point(4,3);
	}

	@After
	public void tearDown() throws Exception {
      point = null;
	}

	@Test
    public void testEquals() {
        Assert.assertEquals(new Point(0, 0), new Point(0, 0));
        Assert.assertEquals(new Point(5, 8), new Point(5, 8));
        Assert.assertEquals(new Point(-4, 6), new Point(-4, 6));

        Assert.assertFalse(new Point(0, 0).equals(new Point(1, 0)));
        Assert.assertFalse(new Point(0, 0).equals(new Point(0, 1)));
        Assert.assertFalse(new Point(4, 4).equals(new Point(-4, 4)));
        Assert.assertFalse(new Point(4, 4).equals(new Point(4, -4)));
        Assert.assertFalse(new Point(4, 4).equals(new Point(-4, -4)));
        Assert.assertFalse(new Point(-4, 4).equals(new Point(-4, -4)));
    }

	@Test
    public void testDistance() {
        Assert.assertEquals(13d, new Point(0, 0).distance(new Point(0, 13)), 0);
        Assert.assertEquals(13d, new Point(0, 0).distance(new Point(13, 0)), 0);
        Assert.assertEquals(13d, new Point(0, 0).distance(new Point(0, -13)), 0);
        Assert.assertEquals(13d, new Point(0, 0).distance(new Point(-13, 0)), 0);
        Assert.assertEquals(5d, new Point(1, 1).distance(new Point(4, 5)), 0);
        Assert.assertEquals(5d, new Point(1, 1).distance(new Point(-2, -3)), 0);
    }

	@Test
    public void testStaticDistance() {
        Assert.assertEquals(5d, Point.distance(point, new Point(0,0)));
    }
}
