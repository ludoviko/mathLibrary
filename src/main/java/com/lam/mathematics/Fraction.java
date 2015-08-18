package com.lam.mathematics;

public class Fraction implements Comparable<Fraction> {
	public long numerator;
	public long denominator;

	public Fraction(long numerator, long denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public Fraction(long numerator) {
		this.numerator = numerator;
		this.denominator = 1;
	}

	public Fraction add(Fraction b) {
		long lcm = GCD.findLCM(this.denominator, b.denominator);
		long num_1 = this.numerator * lcm / this.denominator;
		long num_2 = b.numerator * lcm / b.denominator;
		long num = num_1 + num_2;
		return new Fraction(num, lcm);
	}

	public Fraction multiply(Fraction b) {
		long num = this.numerator * b.numerator;
		long den = this.denominator * b.denominator;
		return new Fraction(num, den);
	}

	public Fraction divide(Fraction b) {
		long num = this.numerator * b.denominator;
		long den = this.denominator * b.numerator;
		Fraction f = new Fraction(num, den);
		f = f.reduce();
		return f;
	}

	public Fraction subtract(Fraction b) {
		long lcm = GCD.findLCM(this.denominator, b.denominator);
		long num_1 = this.numerator * lcm / this.denominator;
		long num_2 = b.numerator * lcm / b.denominator;
		long num = num_1 - num_2;
		return new Fraction(num, lcm);
	}

	public Fraction reduce() {
		Fraction reduced = new Fraction(this.numerator, this.denominator);
		
		long gdc = GCD.find(reduced.numerator, reduced.denominator);
		reduced.numerator /= gdc;
		reduced.denominator /= gdc;
		
		return reduced;
	}

	public long getDenominator() {
		return this.denominator;
	}

	public long getNumerator() {
		return this.numerator;
	}

	@Override
	public String toString() {
		return "Fraction [ " + this.numerator + " / " + this.denominator + " ]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (this.denominator ^ (this.denominator >>> 32));
		result = prime * result + (int) (this.numerator ^ (this.numerator >>> 32));
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
		Fraction other = (Fraction) obj;
		if (this.denominator != other.denominator) {
			return false;
		}
		if (this.numerator != other.numerator) {
			return false;
		}
		return true;
	}

	// public void setNumerator(long numerator) {
	// this.numerator = numerator;
	// }
	//
	// public void setDenominator(long denominator) {
	// this.denominator = denominator;
	// }

	public int compareTo(Fraction o) {
		long LCM = GCD.findLCM(this.denominator, o.denominator);

		Fraction a = new Fraction(LCM * this.numerator / this.denominator, LCM);
		Fraction b = new Fraction(LCM * o.numerator / o.denominator, LCM);

		if (a.numerator > b.numerator) {
			return 1;
		} else if (a.numerator < b.numerator) {
			return -1;
		} else {
			return 0;
		}
	}
}
