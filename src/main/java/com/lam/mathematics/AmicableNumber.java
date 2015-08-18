package com.lam.mathematics;


/**
 * 
 * Amicable numbers
 * 
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n
 * which divide evenly into n). If d(a) = b and d(b) = a, where a ≠ b, then a
 * and b are an amicable pair and each of a and b are called amicable numbers.
 * 
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44,
 * 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4,
 * 71 and 142; so d(284) = 220.
 * 
 * 
 */
public class AmicableNumber {
	public AmicableNumber() {
	}

	private long amicable;

	public boolean isAmicable(int n) {
		long a, b;

		a = NumberTheory.sigma(n) - n;
		b = NumberTheory.sigma((int) a) - a;

		if (b == n && a != n) {
			this.amicable = a;
			return true;
		} else {
			this.amicable = 0;
			return false;
		}
	}

	public long getAmicable() {
		return this.amicable;
	}

	public static void main(String[] args) {
		AmicableNumber amicable = new AmicableNumber();
		if (amicable.isAmicable(220)) {
			System.out.println(amicable.getAmicable());
		}
	}
}
