package com.lam.mathematics;

import java.math.BigInteger;

public class GCD {
	
	public static long findRecursive(long a, long b) {
		if (a == 0 || b == 0 && (a != b)) {
			return a + b;
		}

		return findRecursive(b, a % b);
	}

	public static long find(long a, long b ) {
		long remainder;

		do {
			remainder = a % b;
			a = b;
			b = remainder;
		} while (remainder != 0);

		return a;
	}


	public static BigInteger find(BigInteger a, BigInteger b) {
		BigInteger remainder;
		
		do {
			remainder = a.mod(b);
			a = b;
			b = remainder;
		} while (! remainder.equals(BigInteger.ZERO));

		return a;
	}

	public static BigInteger findRecursive(BigInteger a, BigInteger b) {
		if (a.equals(new BigInteger("0")) || b.equals(new BigInteger("0"))) {
			return (a.add(b));
		}

		return find(b, a.mod(b));
	}

	public static long findLCM(long m, long n) {
		return m * n / GCD.find(m, n);
	}

	public static BigInteger findLCM(BigInteger m, BigInteger n) {
		return m.multiply(n).divide(m.gcd(n));
	}

	public static boolean relativePrime(BigInteger m, BigInteger n) {
		return find(m, n).equals(new BigInteger("1"));
	}

	public static boolean relativePrime(int m, int n) {
		return find(m, n) == 1;
	}
}
