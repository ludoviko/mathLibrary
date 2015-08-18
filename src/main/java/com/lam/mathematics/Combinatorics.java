package com.lam.mathematics;

import java.math.BigInteger;

public class Combinatorics {
	// TODO apply memorization
	public static long factorial(long n) {
		long factorial = 1;
		if (n == 0 || n == 1) {
			return 1;
		}
		for (long i = n; i >= 1; i--) {
			factorial *= i;
		}
		return factorial;
	}

	// TODO apply memorization
	public static BigInteger factorialBI(long n) {
		BigInteger big = new BigInteger("1");

		if (n == 0 || n == 1) {
			return big;
		}

		for (long i = n; i >= 1 ; i--) {
			big = big.multiply(new BigInteger(i + ""));
		}
		return big;
	}
	
	// Permutations are arrangements.
	public static long permutations(long n, long m) {
		checkArgument(n, m);
		
		long factorial = 1;
		for (long i = n; i > n - m; i--) {
			factorial *= i;
		}
		return factorial;
	}

	public static BigInteger permutationsBI(long n, long m) {
		checkArgument(n, m);
		
		BigInteger big = new BigInteger("1");

		for (long i = n; i > n -m  ; i--) {
			big = big.multiply(new BigInteger(i + ""));
		}
		return big;
	}

//	n! / (r!(n−r)!)
	public static long combinations(long n, long m) {
		checkArgument(n, m);

	    long permutation = permutations(n, m);
	    long factorial_m = factorial(m);
		
		return permutation / factorial_m;
	}
	
	public static BigInteger combinationsBI(long n, long m) {
		checkArgument(n, m);
		
		BigInteger permutation = permutationsBI(n, m);
		BigInteger factorial_m = factorialBI(m);
		
		return permutation.divide(factorial_m);
	}
	
	private static void checkArgument(long n, long m) {
		if ( n < 0  || m < 0 || n - m < 0) {
			throw new IllegalArgumentException("n and m must be greater than 0 and n >= m. ");
		}
	}

	private static void checkArgumentZero(long n, long m) {
		if ( n <= 0  || m <= 0 || n - m < 0) {
			throw new IllegalArgumentException("n and m must be greater than 0 and n >= m. ");
		}
	}

}
