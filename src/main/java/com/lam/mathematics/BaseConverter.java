package com.lam.mathematics;

public class BaseConverter {

	public static final String BASES = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public static final int LOWEST_BASE = 2; 
	public static final int HIGHEST_BASE = BASES.indexOf('Z'); 
	
	public static void checkBoundaries(int base) {
		if (base > HIGHEST_BASE || base < LOWEST_BASE) {
			throw new RuntimeException("The base must be with in " + LOWEST_BASE 
					+ " and " + HIGHEST_BASE + " bounds, inclusive.");
		}
	}

	public static String from10UpToZ(long number, int base) {
		BaseConverter.checkBoundaries(base);
		String result = "";
		int aux;

		do {
			aux = (int) (number % base);
			result = BASES.charAt(aux) + result;
			number /= base;
		} while (number > 0);

		return result;
	}

	public static String from10ToBinary(long number) {
		// Optimazed using binary operations
		String result = "";
		int aux;

		do {
			aux = (int) (number & 1);
			result = BASES.charAt(aux) + result;
			number = number >> 1;
		} while (number > 0);

		return result;
	}

	
	public static long toDecimalFromUpToZ(String number, int base) {
		BaseConverter.checkBoundaries(base);

		long result = 0;
		long factor = 1;
		int i = number.length() - 1;
		do {
			result = BASES.indexOf(number.charAt(i--)) * (factor) + result;
			factor *= base;
		} while (i >= 0);

		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	}

}
