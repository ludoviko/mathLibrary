package com.lam.mathematics;

/***
 * 
 * @author Ludoviko Azuaje
 * 
 *  See Problem 112
 *   
 *         Bouncy numbers 
 * 
 *         Working from left-to-right if no digit is exceeded by the digit to
 *         its left it is called an increasing number; for example, 134468.
 * 
 *         Similarly if no digit is exceeded by the digit to its right it is
 *         called a decreasing number; for example, 66420.
 * 
 *         We shall call a positive integer that is neither increasing nor
 *         decreasing a "bouncy" number; for example, 155349.
 * 
 *         Clearly there cannot be any bouncy numbers below one-hundred, but
 *         just over half of the numbers below one-thousand (525) are bouncy. In
 *         fact, the least number for which the proportion of bouncy numbers
 *         first reaches 50% is 538.
 * 
 *         Surprisingly, bouncy numbers become more and more common and by the
 *         time we reach 21780 the proportion of bouncy numbers is equal to 90%.
 * 
 * 
 */


public class BouncyNumber {
	public static boolean isBouncy(long number) {
		long n = number;
		long previous = n % 10;
		long actual;
		n /= 10;
		
		boolean isDecreasing = false;
		boolean isIncreasing = false;
		
		while (n > 0) {
			actual = n % 10;
			if ( previous > actual ) {
				isDecreasing = true;
				if  (isIncreasing) {
					return true;
				}
			} else if ( previous < actual ) {
				isIncreasing = true;
				if  (isDecreasing) {
					return true;
				}
			};
			previous = actual;
			n /= 10;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(BouncyNumber.isBouncy(1));
		System.out.println(BouncyNumber.isBouncy(89));
		System.out.println(BouncyNumber.isBouncy(538));
		System.out.println(BouncyNumber.isBouncy(11234));
		System.out.println(BouncyNumber.isBouncy(4321));
		System.out.println(BouncyNumber.isBouncy(43211));
		System.out.println(BouncyNumber.isBouncy(1111));
		System.out.println(BouncyNumber.isBouncy(121));
		System.out.println(BouncyNumber.isBouncy(123412));
	}
}
