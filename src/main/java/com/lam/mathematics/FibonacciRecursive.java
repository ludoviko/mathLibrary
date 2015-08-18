
package com.lam.mathematics;

import java.util.Arrays;

/**
 *   @author Ludoviko Azuaje
 *
 */

public class FibonacciRecursive {
	private long[] fibonacci;
	private int n;

	public FibonacciRecursive() {
	}

	public FibonacciRecursive(int n) {
		this.reset(n);
	}

	public void reset(int n) {
		this.n = n;
		this.fibonacci = new long[n + 1];

		Arrays.fill(this.fibonacci, -1);

		this.fibonacci[0] = 0;
		this.fibonacci[1] = 1;
	}

	/**
	 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987,
	 * 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393,
	 * 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887,
	 * 9227465, 14930352, 24157817, 39088169
	 */
	public long find() {
		return this.calculate(this.n);
	}

	private long calculate(int n) {
		if (this.fibonacci[n] != -1) {
			return this.fibonacci[n];
		}
		this.fibonacci[n] = this.calculate(n - 1) + this.calculate(n - 2);
		return this.fibonacci[n];
	}

	public long[] getFibonacci() {
		return this.fibonacci;
	}

	public static void main(String[] strings) {
		FibonacciRecursive fibonacci = new FibonacciRecursive(100);
		System.out.println(fibonacci.find());
		fibonacci.reset(13);
		System.out.println(fibonacci.find());
	}
}
