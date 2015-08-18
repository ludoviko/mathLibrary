package com.lam.mathematics;

import java.math.BigInteger;


// TODO apply memorization
public class Factorial {
	public static long find(long n) {
		long factorial = 1;
		if (n == 0 || n == 1) {
			return 1;
		}
		for (long i = n; i >= 1; i--) {
			factorial *= i;
		}
		return factorial;
	}

	public static BigInteger findBI(int n) {
		BigInteger big = new BigInteger("1");
		
		if (n == 0 || n == 1) {
			return big;
		}

		for (int i = n; i >= 1 ; i--) {
			big = big.multiply(new BigInteger(i + ""));
		}
		return big;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long n = Factorial.find(9);
		System.out.println(n);
	}

}
