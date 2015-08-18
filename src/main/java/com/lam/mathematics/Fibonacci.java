/**
 * 
 */
package com.lam.mathematics;

import java.math.BigInteger;

/**
 * @author lazuajemolle
 * 
 */
public class Fibonacci {

	public Fibonacci() {
	}

	public static BigInteger calculate(long n) {
		BigInteger result = null;
		BigInteger a0 = null;
		BigInteger a1 = null;

		for (int i = 0; i <= n; i++) {
			if (i == 0) {
				a0 = new BigInteger("0");
				a1 = new BigInteger("0");
			} else if (i == 1) {
				a0 = new BigInteger("0");
				a1 = new BigInteger("1");
			} else if (i == 2) {
				a0 = new BigInteger("0");
				a1 = new BigInteger("1");
			} else {
			}
			
			result = a0.add(a1);
			a0 = a1;
			a1 = result;
		}
		return result;
	}

	public static long calculatePhi(long n) {
		double phi = (1 + Math.sqrt(5)) / 2;
		double exp = n * Math.log10(phi) - Math.log10(5) / 2;
		int fib = (int) Math.round(Math.pow(10, exp));

		return fib;
	}

	public static void main(String[] strings) {
		Fibonacci fibonacci = new Fibonacci();
		/**
		 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987,
		 * 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393,
		 * 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887,
		 * 9227465, 14930352, 24157817, 39088169
		 */
		System.out.println(fibonacci.calculate(1));
		System.out.println(fibonacci.calculate(11));
		System.out.println(fibonacci.calculatePhi(11));
	}

}
