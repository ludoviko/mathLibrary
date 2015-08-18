package com.lam.mathematics;

import java.math.BigInteger;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 * 
 *         Problem Statement
 * 
 * 
 *         A multifactorial of a number is a generalization of the factorial
 *         function. The k-multifactorial of n is denoted by fack(n). The
 *         k-multifactorial of n is the product of every positive number of the
 *         form n - X*k, where X is a non-negative integer. For example, the
 *         3-multifactorial of 14 is 14*11*8*5*2 = 12320, and the
 *         4-multifactorial of 5 is 5*1 = 5.
 * 
 *         A formal definition of multifactorial is:
 * 
 *         fack(n) = n if k >= n fack(n) = n*fack(n-k) if k < n
 * 
 *         You will be given n and k and have to return the value of fack(n) as
 *         a String with no leading zeroes (this value is always a positive
 *         integer). If fack(n) is strictly greater than 1000000000000000000
 *         (1018), return "overflow" (quotes for clarity) instead.
 * 
 *         Definition
 * 
 *         Class: Multifactorial Method: calcMultiFact Parameters: int, int
 *         Returns: String Method signature: String calcMultiFact(int n, int k)
 *         (be sure your method is public)
 * 
 * 
 *         Notes - 1000000000000000000 (1018) fits in a long.
 * 
 *         Constraints - n and k will each be between 1 and 2000000000 (2*109),
 *         inclusive.
 * 
 *         Examples 0)
 * 
 * 
 *         14
 * 
 *         3
 * 
 *         Returns: "12320"
 * 
 *         The first example in the problem statement. 1)
 * 
 * 
 *         5
 * 
 *         4
 * 
 *         Returns: "5"
 * 
 *         The second example in the problem statement. 2)
 * 
 * 
 *         1000
 * 
 *         2
 * 
 *         Returns: "overflow"
 * 
 *         Way too big! 3)
 * 
 * 
 *         2000000000
 * 
 *         1900000000
 * 
 *         Returns: "200000000000000000"
 * 
 *         4)
 * 
 * 
 *         1000
 * 
 *         256
 * 
 *         Returns: "84232704000"
 * 
 *         5)
 * 
 * 
 *         2000000000
 * 
 *         1
 * 
 *         Returns: "overflow"
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for: Single Round Match 335 Round 1 - Division
 *         I, Level One Single Round Match 335 Round 1 - Division II, Level Two
 */

// To slow. 
// Apply memorization

public class Multifactorial {
	public static String calcMultiFact(int n, int k) {
		BigInteger mf;
		String result;

		mf = Multifactorial.multiFact(new BigInteger(n + ""), new BigInteger(k
				+ ""));
		result = mf.toString();
		return result;
	}

	public static BigInteger multiFact(BigInteger n, BigInteger k) {
		BigInteger m = n;

		if (k.compareTo(n) >= 0) {
		} else {
			m = n.multiply(multiFact(n.subtract(k), k));
		}
		return m;
	}
}
