package com.lam.mathematics;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

import com.lam.annotation.Note;


/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Square root of n:
 *         
 *         Initially x_0 = n/2;
 *         
 *         x_1 = (x_0 + n/x_0)/2
 * 
 */

@Note(note="Testing pending, XXX")
public class SquareRoot {

	public static FractionBI find(int n, int expansion) {
		FractionBI squareRoot = null;
		// The initial guess is n/2
		FractionBI start = new FractionBI(BigInteger.valueOf(n),
				BigInteger.valueOf(2));
		FractionBI nf = new FractionBI(BigInteger.valueOf(n));

		for (int i = 0; i < expansion; i++) {
			squareRoot = start.add(nf.divide(start)).divide(
					new FractionBI(BigInteger.valueOf(2)));
			start = squareRoot;
			// System.out.println(i + ": " + start.add(data) + " : "
			// +
			// start.add(data).getNumerator().divide(start.add(data).getDenominator()));
		}

		return squareRoot.reduce();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 10;
		int x = 4;
		// 1.41421356237309504880
		for (int i = 2; i < 5; i++) {

			FractionBI f = find(i, n);
			System.out.println("Fraction: " + f + ", i : " + i);
			BigDecimal num = new BigDecimal(f.getNumerator());
			BigDecimal den = new BigDecimal(f.getDenominator());
			BigDecimal data = num.divide(den, 100, RoundingMode.DOWN);
			String sub = data.toString().substring(0, 101);
			sub = sub.replaceAll("\\.", "");
			int summa = Digits.sum(sub);
			System.out.println(" Data : " + data);
			System.out.println(" Summa (475): " + summa);
		}

	}
}
