package com.lam.mathematics;

import junit.framework.TestCase;

import com.lam.mathematics.space.Circle;

public class CircleTest extends TestCase {

	int[] array = {1,5,2,1,4,0};
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		this.array = null;
	}

	public void testIntersection() {
		 Circle circle = new Circle(0, this.array[0]);
		 Circle circle_2 = new Circle(1, this.array[1]);
		 Circle circle_3 = new Circle(2, this.array[2]);
		 Circle circle_4 = new Circle(3, this.array[3]);
		 Circle circle_5 = new Circle(4, this.array[4]);
		 Circle circle_6 = new Circle(5, this.array[5]);
		 CircleTest.assertTrue(circle.isIntersection(circle));
		 CircleTest.assertTrue(circle.isIntersection(circle_2));
		 CircleTest.assertTrue(circle.isIntersection(circle_3));
		 CircleTest.assertTrue(circle.isIntersection(circle_5));
		 CircleTest.assertFalse(circle.isIntersection(circle_4));
		 CircleTest.assertFalse(circle.isIntersection(circle_6));
	}
}
