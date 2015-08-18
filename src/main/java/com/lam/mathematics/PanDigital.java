package com.lam.mathematics;

public class PanDigital {
	public static boolean isPanDigital(long n) {
		// XXX. TODO check it. 
	    int digits = 0;
	    int count = 0;
	    int tmp;
	 
	    while (n > 0) {
	        tmp = digits;
	        digits = digits | 1 << (int)((n % 10) - 1);
	        if (tmp == digits) {
	            return false;
	        }
	        count++;
	        n /= 10;
	    }
	    return digits == (1 << count) - 1;
	}	
	
	public static boolean isPanDigital(String number) {
		return isPanDigital(Long.parseLong(number));
	}

	public static boolean isPanDigitalIncludingZero(long number) {
		return isPanDigitalIncludingZero(number + "");
	}
	
	public static boolean isPanDigitalIncludingZero(String number) {
		if (number.contains("0")) {
			
		} else {
			return false;
		}
		StringBuilder aux = new StringBuilder();
		String sorted = "";
		int anInt;

		SortDigits sort = new SortDigits(number);
		sort.go();
		sorted = sort.getNumberAsString();

		anInt = Integer.parseInt( sort.getNumberAsString().substring(0, 1));
		
		for (int i = 0; i < sorted.length(); i++) {
			aux.append(anInt + i);
		}
		return aux.toString().equals(sorted);
	}

	public static void main(String[] args) {
		System.out.println( PanDigital.isPanDigital(987651234));
		System.out.println( PanDigital.isPanDigital(987651234));
		System.out.println( PanDigital.isPanDigital(987650234));
		System.out.println( PanDigital.isPanDigital("932718654"));
	}
}
