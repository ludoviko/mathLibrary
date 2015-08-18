package com.lam.mathematics;

import java.math.BigInteger;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Project Euler
 *          
 *         Problem 282: The Ackermann function
 * 
 *         For non-negative integers m, n, the Ackermann function A(m, n) is
 *         defined as follows:
 * 
 *         For example A(1, 0) = 2, A(2, 2) = 7 and A(3, 4) = 125.
 * 
 *         Find Summa A(n, n), n = 0..6 and give your answer mod 148.
 */

public class AckermannFunction {
	public final static int SIZE = 3;

	public AckermannFunction() {
	}

	public long a(long m, long n) {
		// Overflow from a.AckermannFunction(4, 1)
		if (m == 0) {
			return n + 1;
		} else if (m > 0 && n == 0) {
			return a(m - 1, 1);
		} else {
			// (m > 0 && n > 0) {
			return a(m - 1, a(m, n - 1));
		}
	}

	public BigInteger aBI(BigInteger m, BigInteger n) {
		// Overflow from a.AckermannFunction(4, 1)

		if (m.compareTo(BigInteger.ZERO) == 0) {
			return n.add(BigInteger.ONE);
		} else if (m.compareTo(BigInteger.ZERO) > 0 && n.compareTo(BigInteger.ZERO) == 0) {
			return aBI(m.subtract(BigInteger.ONE), BigInteger.ONE);
		} else {
			// (m > 0 && n > 0) {
			return aBI(m.subtract(BigInteger.ONE), aBI(m, n.subtract(BigInteger.ONE)));
		}
	}

}
