package com.lam.mathematics.space;

public class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public static double distance(Point p1, Point p2) {
		double dx = (double) (p2.x - p1.x);
		double dy = (double) (p2.y - p1.y);
		return Math.sqrt(dx * dx + dy * dy);
	}

	public double distance(Point p2) {
		double dx = (double) (p2.x - this.x);
		double dy = (double) (p2.y - this.y);
		return Math.sqrt(dx * dx + dy * dy);
	}

	public double getX() {
		return x;
	}

	// public void setX(double x) {
	// this.x = x;
	// }

	public double getY() {
		return y;
	}

	// public void setY(double y) {
	// this.y = y;
	// }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}
