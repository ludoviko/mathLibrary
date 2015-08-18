package com.lam.mathematics;

/**
 * 
 * @author LAzuaje
 * 
 *         A quick class for evaluating polynomials.
 * 
 *         P = m[0] + m[1] x + m[2] x^2 + m[3] x^3+ m[4] x^4 +... + m[n-1]
 *         x^(n-1)
 * 
 */

public class HornerMethod {
	/**
	 * A method for finding the numerical value of the polynomial.
	 * 
	 * @param x: The value of the powers of X.
	 * @param m: The array of coefficients;
	 * @return The calculated value after the substitution.
	 */
	public static long find(long x, long[] m) {
		long sum = m[m.length - 1];

		for (int i = m.length - 2; i >= 0; i--) {
			sum = x * sum + m[i];
		}

		return sum;
	}

	/**
	 * A method for finding the numerical value of the polynomial.
	 * 
	 * @param x: The value of the powers of X.
	 * @param m: The array of coefficients;
	 * @return The calculated value after the substitution.
	 */
	public static long find_2(long x, long[] m) {
		long sum = 0;

		for (int i = m.length - 1; i >= 1; i--) {
			sum = x * (m[i] + sum);
		}

		return sum + m[0];
	}

	public static void main(String[] args) {
		// 5
		System.out.println(HornerMethod.find(3L, new long[] { -1, 2, -6, 2 }));
		// 2x3 - x2 - 6x + 5 at x = 3; 32
		System.out.println(HornerMethod.find(3L, new long[] { 5, -6, -1, 2 }));
		// x4 + 3x3 + 5x2 + 7x + 9 at x = 2, 83
		System.out.println(HornerMethod.find(2L, new long[] { 9, 7, 5, 3, 1 }));
		// 2x^3 − 3x^2 + 5x − 7 for x = 3; 35
		System.out.println(HornerMethod
				.find(3L, new long[] { -7, 5, -3, 2, 0 }));
	}
}
