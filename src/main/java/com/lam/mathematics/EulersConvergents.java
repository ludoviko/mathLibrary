package com.lam.mathematics;

import java.math.BigInteger;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem 65: Convergents of e
 * 
 *         The square root of 2 can be written as an infinite continued
 *         fraction. 
 *         
 *         The infinite continued fraction can be written, √2 = [1;(2)], (2)
 *         indicates that 2 repeats ad infinitum. In a similar way, √23 =
 *         [4;(1,3,1,8)].
 * 
 *         It turns out that the sequence of partial values of continued
 *         fractions for square roots provide the best rational approximations.
 * 
 *         Hence the sequence of the first ten convergents for √2 are: 1, 3/2,
 *         7/5, 17/12, 41/29, 99/70, 239/169, 577/408, 1393/985, 3363/2378, ...
 * 
 *         What is most surprising is that the important mathematical constant,
 *         e = [2; 1,2,1, 1,4,1, 1,6,1 , ... , 1,2k,1, ...].
 * 
 *         The first ten terms in the sequence of convergents for e are: 2, 3,
 *         8/3, 11/4, 19/7, 87/32, 106/39, 193/71, 1264/465, 1457/536, ...
 * 
 *         The sum of digits in the numerator of the 10th convergent is
 *         1+4+5+7=17.
 * 
 *         Find the sum of digits in the numerator of the 100th convergent of
 *         the continued fraction for e.
 *         
 */

// XXX unfinished
public class EulersConvergents {

	public static FractionBI find(int expansion) {
		FractionBI data = new FractionBI(BigInteger.ZERO);
		FractionBI total = null;

		FractionBI one = new FractionBI(BigInteger.valueOf(1));
		FractionBI two = new FractionBI(BigInteger.valueOf(2));
		FractionBI n;

		for (int i = 1; i < expansion; i++) {
			if ( (i) % 3  == 0) {
				n = new FractionBI(BigInteger.valueOf( 2 * ( (i) / 3 ) ));
			} else {
				n = new FractionBI(BigInteger.valueOf(1));
			}
			data = one.divide(n.add(data));
			
			// System.out.println(i + ": " + start.add(data) + " : " m
			// +
			// start.add(data).getNumerator().divide(start.add(data).getDenominator()));
		}

		total = two.add(data);
		return total.reduce();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
