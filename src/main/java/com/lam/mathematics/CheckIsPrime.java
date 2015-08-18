package com.lam.mathematics;

import java.math.BigInteger;

// XXX to slow, redo

public class CheckIsPrime {

	public CheckIsPrime() {
	}

	public static boolean go(long n) {
		long upTo;
		int loop = 5;
		
		if ( n<= 0 ) {
			throw new IllegalArgumentException( n + " must be greater than 0.");
		}; 
		
		if (n == 1) {
			return false;
		} 
		
		if (n == 2 || n == 3 || n == 5 || n == 7) {
			return true;
		};
		
		if (n % 2 == 0) {
			return false;
		};
		
		if (n % 3 == 0) {
			return false;
		};
		
		upTo = (long) Math.floor( ( Math.sqrt(n) ) );	
		
		while (loop <= upTo) {
			if ( n % loop == 0 ) {
				return false;
			};
			if ( n % (loop + 2) == 0 ) {
				return false;
			};
			loop += 6;
		}
		
		return true;
	};

	public static boolean go(BigInteger n) {
		return n.isProbablePrime(100);
	};

	
	public static void main(String[] args) {
	}
}
