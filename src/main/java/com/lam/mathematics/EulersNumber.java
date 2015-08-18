package com.lam.mathematics;

import java.math.BigInteger;

/**
 * 
 * @author Ludoviko Azuaje
 *
 * Class to find the value of euler's number.
 * 
 * It is based on the formula:
 * 
 * e = 1 + 1 + 2/2! + 3/3! + 4/4! + ...
 * 
 */
public class EulersNumber {
	// Find practical use of this class
	// Testing pending
	public static FractionBI  find(int expansion) {
        FractionBI ef = new FractionBI(BigInteger.ONE);
        FractionBI unity = new FractionBI(BigInteger.ONE);
        FractionBI factor = new FractionBI(BigInteger.ONE);
        FractionBI nextFactor = new FractionBI(BigInteger.ONE);
        
        for (int i = 0; i < expansion; i++) {
        	factor = factor.multiply(nextFactor);
        	nextFactor = nextFactor.add(unity);
        	ef = ef.add( unity.divide(factor));
        }
		
		return ef;
	} 
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int expansion = 5;
		FractionBI e = EulersNumber.find(expansion);
		
		System.out.println(e);
		System.out.println(Math.E);
		

	}

}
