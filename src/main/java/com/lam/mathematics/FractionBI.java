package com.lam.mathematics;

import java.math.BigInteger;

public class FractionBI implements Comparable<FractionBI> {
	public BigInteger numerator;
	public BigInteger denominator;

	public FractionBI(BigInteger numerator, BigInteger denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public FractionBI(BigInteger numerator) {
		this.numerator = numerator;
		this.denominator = new BigInteger("1");
	}

	public BigInteger getNumerator() {
		return this.numerator;
	}

	public FractionBI add(FractionBI b) {
		BigInteger lcm = GCD.findLCM(this.denominator, b.denominator);
		BigInteger num_1 = this.numerator.multiply(lcm).divide(this.denominator);
		BigInteger num_2 = b.numerator .multiply(lcm).divide(b.denominator);
		BigInteger num = num_1.add(num_2);
		return new FractionBI(num, lcm);
	}

	public FractionBI multiply(FractionBI b) {
		BigInteger num = this.numerator.multiply(b.numerator);
		BigInteger den = this.denominator.multiply(b.denominator);
		return new FractionBI(num, den);
	}

	public FractionBI divide(FractionBI b) {
		BigInteger num = this.numerator.multiply(b.denominator);
		BigInteger den = this.denominator.multiply(b.numerator);
		FractionBI f = new FractionBI(num, den);
		f = f.reduce();
		return f;
	}

	public FractionBI subtract(FractionBI b) {
		BigInteger lcm = GCD.findLCM(this.denominator, b.denominator);
		BigInteger num_1 = this.numerator.multiply(lcm).divide(this.denominator);
		BigInteger num_2 = b.numerator .multiply(lcm).divide(b.denominator);
		BigInteger num = num_1.subtract(num_2);
		return new FractionBI(num, lcm);
	}

	public FractionBI reduce() {
		BigInteger gdc = GCD.find(this.numerator, this.denominator);
		
		FractionBI reduced = new FractionBI(this.numerator, this.denominator);
		
		reduced.numerator = reduced.numerator.divide(gdc);
		reduced.denominator = reduced.denominator.divide(gdc);
		
		return reduced;
	}

	public BigInteger getDenominator() {
		return this.denominator;
	}

	@Override
	public String toString() {
		return "FractionBI [ " + this.numerator + " / " + this.denominator + " ]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((this.denominator == null) ? 0 : this.denominator.hashCode());
		result = prime * result
				+ ((this.numerator == null) ? 0 : this.numerator.hashCode());
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
		FractionBI other = (FractionBI) obj;
		if (this.denominator == null) {
			if (other.denominator != null) {
				return false;
			}
		} else if (!this.denominator.equals(other.denominator)) {
			return false;
		}
		if (this.numerator == null) {
			if (other.numerator != null) {
				return false;
			}
		} else if (!this.numerator.equals(other.numerator)) {
			return false;
		}
		return true;
	}

	public int compareTo(FractionBI o) {
		BigInteger LCM = GCD.findLCM(this.denominator, o.denominator);

		FractionBI a = new FractionBI(this.numerator.multiply(LCM).divide(this.denominator), LCM);
		FractionBI b = new FractionBI( o.numerator.multiply(LCM).divide(o.denominator), LCM);

		if (a.numerator.compareTo(b.numerator) > 0) {
			return 1;
		} else if (a.numerator.compareTo(b.numerator) < 0) {
			return -1;
		} else {
			return 0;
		}
	}
}
