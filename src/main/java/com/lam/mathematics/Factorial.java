package com.lam.mathematics;

import java.math.BigInteger;


public class Factorial {
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
		System.out.println(Factorial.findBI(100));
	}

}
