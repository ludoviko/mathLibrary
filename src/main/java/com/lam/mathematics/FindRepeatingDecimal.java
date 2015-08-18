package com.lam.mathematics;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         A unit fraction contains 1 in the numerator. The decimal
 *         representation of the unit fractions with denominators 2 to 10 are
 *         given:
 * 
 *         1/2 = 0.5 1/3 = 0.(3) 1/4 = 0.25 1/5 = 0.2 1/6 = 0.1(6) 1/7 =
 *         0.(142857) 1/8 = 0.125 1/9 = 0.(1) 1/10 = 0.1
 * 
 *         Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle. It
 *         can be seen that 1/7 has a 6-digit recurring cycle.
 * 
 *         Find the recurring cycle of ONE divided by any integer.
 * 
 */

public class FindRepeatingDecimal {
	private String decimal;
	private int length;
	private int divisor;
	public static final int NUMERATOR = 1;
	
	public void findRepeatingDecimal(int divisor) {
		this.setDivisor(divisor);
		int len = 0;
		int remainder = 0;
		int number = NUMERATOR;
		String result = "";
		ArrayList<Integer> list = new ArrayList<Integer>();

		while (number < divisor) {
			list.add(number);
			number = number * 10;
			if (result.length() == 0) {
				result = "0,";
			} else {
				result += "0";
			}
		}

		boolean flag = true;
		do {
			remainder = number % divisor;
			if (remainder == 0) {
				break;
			} else {
				result += number / divisor;
			}

			len = this.findRemainderLen(list, remainder);
			if (len > 0) {
				this.setDecimal(result);
				this.setLength(len);
//				System.out.println("Divisor " + divisor + ", Length: "
//						+ len + ", result =" + result);
				break;
			}

			number = remainder;
			if (number < divisor) {
				number = number * 10;
				list.add(remainder);
			} else {
			}
		} while (flag);
	}

	public String getDecimal() {
		return decimal;
	}

	public int getLength() {
		return length;
	}

	public int getDivisor() {
		return divisor;
	}

	private void setDivisor(int divisor) {
		this.divisor = divisor;
	}

	private void setDecimal(String decimal) {
		this.decimal = decimal;
	}

	private void setLength(int length) {
		this.length = length;
	}

	private int findRemainderLen(List<Integer> list, int remainder) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == remainder) {
				return list.size() - i;
			}
		}
		return -1;
	}
	
	@Override
	public String toString() {
		return "FindRepeatingDecimal [" +
				"NUMERATOR= " + NUMERATOR +
				", divisor=" + divisor +
				", decimal=" + decimal + ", length="
				+ length +   "]";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FindRepeatingDecimal cycle = new FindRepeatingDecimal();

		cycle.findRepeatingDecimal(11);
		System.out.println(cycle);

		cycle.findRepeatingDecimal(14);
		System.out.println(cycle);
		cycle.findRepeatingDecimal(7);
		System.out.println(cycle);

	}
}
