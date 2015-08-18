package com.lam.mathematics;


import java.util.Arrays;
import java.util.Comparator;

/**
 * @param args
 */

public class SortDigits {
	public static final String ASC = "ASC";
	public static final String DESC = "DESC";
	private Integer[] digits;

	// XXX Create for BigInteger a new SortDigits class.
	// Used by PanDigital.
	public SortDigits(String number) {
		this.setDigits(Long.parseLong(number));
	}

	public SortDigits() {
	}

	public SortDigits(long number) {
		this.setDigits(number);
	}
	
	public void setDigits(long number) {
		this.digits = new Integer[Digits.length(number)];
		int i = 0;
		while (number > 0) {
			this.digits[i++] = (int) (number % 10);
			number /= 10;
		}
	}

	public long getNumber() {
		Long number = (long) 0;
		for (int i = this.digits.length - 1; i >= 0; i--) {
			number += (long) (this.digits[i] * Math.pow(10,this.digits.length - 1 - i ));
		}
		return number;
	}

	public Integer[] getDigits() {
		return this.digits;
	}

	public String getNumberAsString() {
		String string = "";
		for (int i = 0; i < this.digits.length; i++) {
			string += this.digits[i];
		}
		return string;
	}

	public void go(String selector) {
		if (selector.equalsIgnoreCase(ASC)) {
			Arrays.sort(this.digits);
		} else if (selector.equalsIgnoreCase(DESC)) {
			Arrays.sort(this.digits, new Comparator<Integer>() {
				public int compare(Integer arg0, Integer arg1) {
					return arg1.compareTo(arg0);
				}
			});
		}
	}

	public void go() {
		this.go(ASC);
	}

	public boolean isSorted() {
		for (int i = 0; i < this.digits.length - 1; i++) {
			if (this.digits[i] < this.digits[i + 1]) {
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortDigits sortDigits = new SortDigits(61234L);
		sortDigits.go(SortDigits.ASC);
		sortDigits.go(SortDigits.DESC);
		System.out.println(sortDigits.getDigits());
	}
}
