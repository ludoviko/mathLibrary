package com.lam.mathematics;


import java.math.BigInteger;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         It is possible to show that the square root of two can be expressed
 *         as an infinite continued fraction.
 * 
 *         √ 2 = 1 + 1/(2 + 1/(2 + 1/(2 + ... ))) = 1.414213...
 * 
 *         By expanding this for the first four iterations, we get:
 * 
 *         1 + 1/2 = 3/2 = 1.5 1 + 1/(2 + 1/2) = 7/5 = 1.4 1 + 1/(2 + 1/(2
 *         +1/2)) = 17/12 = 1.41666... 1 + 1/(2 + 1/(2 + 1/(2 + 1/2))) = 41/29 =
 *         1.41379...
 * 
 *         The next three expansions are 99/70, 239/169, and 577/408, but the
 *         eighth expansion, 1393/985, is the first example where the number of
 *         digits in the numerator exceeds the number of digits in the
 *         denominator.
 * 
 */

public class SquareRootOfTwoConvergents {
	public static FractionBI find(int n, int expansion) {
		FractionBI data = new FractionBI(BigInteger.ZERO);
		FractionBI total = null;

		FractionBI one = new FractionBI(BigInteger.valueOf(1));
		FractionBI nf = new FractionBI(BigInteger.valueOf(n));

		for (int i = 1; i <= expansion; i++) {
			data = one.divide(nf.add(data));
			// System.out.println(i + ": " + start.add(data) + " : "
			// +
			// start.add(data).getNumerator().divide(start.add(data).getDenominator()));
		}

		total = one.add(data);
		return total.reduce();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 3;
		int x = 2;
		System.out.println(x + ": " + find(2, n));
	}
}
