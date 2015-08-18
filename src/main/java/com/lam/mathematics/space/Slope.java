package com.lam.mathematics.space;

import javax.sound.sampled.Line;

// XXX Work in progress... 

/**
 * Represents the slope of a {@link Line}. Objects of this class are immutable.
 */
public class Slope implements Comparable<Slope> {
	// Delta y
	private final double rise;
	// Delta x
	private final double travel;

	public Slope(double rise, double travel) {
		if (travel == 0 && rise == 0) {
			throw new IllegalStateException(
					"A slope with rise = 0 and travel = 0 cannot be represented");
		}
		this.rise = rise;
		this.travel = travel;
	}

	public Slope(Point p2, Point p1) {
		 this(p2.getY() - p1.getY(), p2.getX() - p1.getX());
	}
	
	// public boolean isIndetermined() {
	// return this.travel == 0 && this.rise == 0;
	// }

	public boolean isInfinite() {
		return this.travel == 0 && this.rise != 0;
	}

	public boolean isConstant() {
		return this.travel != 0 && this.rise == 0;
	}

	public double asDouble() {
		if (this.isInfinite()) {
			throw new IllegalStateException(
					"Infinite slope cannot be represented as double");
		}

		// if (this.isIndetermined()) {
		// throw new
		// IllegalStateException("A slope with rise = 0 and travel = 0 cannot be represented as double");
		// }

		return this.rise / this.travel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(this.rise);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(this.travel);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Slope other = (Slope) obj;
		if (Double.doubleToLongBits(this.rise) != Double
				.doubleToLongBits(other.rise)) {
			return false;
		}
		if (Double.doubleToLongBits(this.travel) != Double
				.doubleToLongBits(other.travel)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Slope [rise=" + this.rise + ", travel=" + this.travel + "]";
	}

	public double getRise() {
		return this.rise;
	}

	public double getTravel() {
		return this.travel;
	}

	public int compareTo(Slope other) {
		if (this.isInfinite() && !other.isInfinite()) {
			return 1;
		} else if (!this.isInfinite() && other.isInfinite()) {
			return -1;
		} else if (this.isInfinite() && other.isInfinite()) {
			return 0;
		} else

		if (this.asDouble() > other.asDouble()) {
			return 1;
		} else if (this.asDouble() < other.asDouble()) {
			return -1;
		} else {
			return 0;
		}
	}
}
