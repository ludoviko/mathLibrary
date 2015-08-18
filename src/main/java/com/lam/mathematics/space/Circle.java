package com.lam.mathematics.space;

public class Circle implements Comparable<Circle>{
	int center;
	int radius;
	int lowerBound;
	int upperBound;
	
	public Circle(int center,  int radius) {
		this.center = center;
		this.radius = radius;
		this.lowerBound = center - radius;
		this.upperBound = center + radius;
	};
	
    int getLowerBound() {
    	return this.lowerBound;
    }	
    int getUpperBound() {
    	return this.upperBound;
    }	

    public boolean isIntersection(Circle point) {
        if (this.compareTo( point ) >= 0) {
        	if ( this.checkPointInside(point.lowerBound, this) )  {
        		return true;
        	} else if ( this.checkPointInside(point.upperBound, this) ) {
        		return true;
        	};
        } else {
        	if ( this.checkPointInside( this.lowerBound, point) )  {
        		return true;
        	} else if ( this.checkPointInside(this.upperBound, point) ) {
        		return true;
        	};
        };	    	
    	return false;
    }

	private boolean checkPointInside(int bound, Circle point ) {
		return bound >= point.lowerBound  && bound <= point.upperBound;
	};

	public int compareTo(Circle o) {
		return this.radius - o.radius;
	}

	@Override
	public String toString() {
		return "Point [center=" + this.center + ", radius=" + this.radius
				+ ", lowerBound=" + this.lowerBound + ", upperBound="
				+ this.upperBound + "]";
	}
	
	public static void main(String[] args) {
		 int[] a = {1,5,2,1,4,0};
		 Circle point = new Circle(0, a[0]);
		 Circle point_2 = new Circle(1, a[1]);
		 Circle point_3 = new Circle(2, a[2]);
		 Circle point_4 = new Circle(3, a[3]);
		 Circle point_5 = new Circle(4, a[4]);
		 Circle point_6 = new Circle(5, a[5]);
		 System.out.println(point.isIntersection(point));
		 System.out.println(point.isIntersection(point_2));
		 System.out.println(point.isIntersection(point_3));
		 System.out.println(point.isIntersection(point_4));
		 System.out.println(point.isIntersection(point_5));
		 System.out.println(point.isIntersection(point_6));
	}
	
	
}
