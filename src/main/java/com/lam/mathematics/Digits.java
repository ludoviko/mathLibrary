package com.lam.mathematics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.lam.annotation.Note;


public class Digits {
	public static Long[] rotate(long n) {
		List<Long> list = new ArrayList<Long>();

		if (n <= 0)
			return null;

		long digit;

		long position = length(n);
		long counter = position;

		while (counter-- > 0) {
			digit = n % 10;
			n = n / 10;
			n = (long) (digit * Math.pow(10, position - 1) + n);
			list.add(new Long(n));
		}
		Collections.sort(list);
		return list.toArray(new Long[list.size()]);
	}

	public static Long[] truncateFromRight(long n) {
		Set<Long> set = new TreeSet<Long>();

		if (n < 10)
			return null;

		while (n > 0) {
			set.add(new Long(n));
			n = n / 10;
		}
		return set.toArray(new Long[set.size()]);
	}

	public static Long[] truncateFromLeft(long n) {
		Set<Long> set = new TreeSet<Long>();

		if (n <= 0) {
			return null;
		}

		long digit;
		long position = (int) Math.log10(n);

		while (position >= 0) {
			set.add(new Long(n));
			digit = (long) (n / Math.pow(10, position));
			n = (long) (n - digit * Math.pow(10, position));
			position--;
		}
		return set.toArray(new Long[set.size()]);
	}

	public static Long[] truncate(long n) {
		Long[] lefts = Digits.truncateFromLeft(n);
		Long[] rights = Digits.truncateFromRight(n);

		Set<Long> set = new TreeSet<Long>();

		for (Long number : lefts) {
			set.add(number);
		}
		for (Long number : rights) {
			set.add(number);
		}
		return set.toArray(new Long[set.size()]);
	}

	public static int sum(int n) {
		int digit = 0;
		int sum = 0;
		while (n > 0) {
			digit = +n % 10;
			n /= 10;
			sum += digit;
		}
		return sum;
	}

	public static int sum(String string) {
		String digitChar;
		int sum = 0;
		for (int i = 0; i < string.length(); i++) {
			digitChar = string.charAt(i) + "";
			sum += Integer.parseInt(digitChar);
		}
		return sum;
	}

	@Note(note="Missing test")
	public static int length(long n) {
		if (n == 0) {
			return 0;
		}
		return  (int) Math.log10(n) + 1;
	} 
	
	public static boolean isPalindrome(long n, int base) {
		return n == reverse(n, base);
	}

	public static boolean isPalindrome(long n) {
		return isPalindrome(n, 10);
	}

	public static boolean isPalindromeBinary(long n) {
		return n == reverseBinary(n);
	}

	public static long reverse(long n) {
		return reverse(n, 10);
	}

	public static long reverse(long n, int base) {
		long reversed = 0;
		while (n > 0) {
			reversed = base * reversed + n % base;
			n /= base;
		}
		return reversed;
	}

	public static long reverseBinary(long n) {
		// XXX Explanation wanted
		long reversed = 0;
		while (n > 0) {
			reversed = (reversed << 1) + (n & 1);
			n = n >> 1;
		}
		return reversed;
	}

	/**
	 * public static int makePalindrome(int n, int base, boolean oddLength): int
	 * 
	 * @param int n: n, any number in decimal notation.
	 * @param int base: any n base.
	 * @param boolean oddLength: whether the palindrome is of odd or even
	 *        length.
	 * 
	 *        Returns: an int, that represents the decimal representation of
	 *        that palindrome from the given base.
	 * 
	 */
	public static int makePalindrome(int n, int base, boolean oddLength) {
		int result = n;

		if (oddLength) {
			n = n / base;
		}
		while (n > 0) {
			result = base * result + n % base;
			n = n / base;
		}
		return result;
	}

	public static int makePalindromeEven(int palindromeOdd) {
		int len = 0;
		int copy = palindromeOdd;

		if (! isPalindrome(palindromeOdd)) {
			return -1;
		}
		
		while (copy > 0) {
			copy /= 10;
			++len;
		}

		if ((len & 1) == 1) {
		} else {
			return -1;
		}

        len = len / 2 + 1;
		
		int paliOriginal = (int) (palindromeOdd /Math.pow(10, len - 1)); 
		int aux = (int) (( paliOriginal - paliOriginal / 10 ) * Math.pow(10, len)); 
		int result =  palindromeOdd + aux ; 

		return result;
	}

	public static int makePalindrome(int n, boolean oddLength) {
		return makePalindrome(n, 10, oddLength);
	}

	/**
	 * public static int makePalindromeBase2(int n, boolean oddLength): int
	 * 
	 * @param int n: n, any number in decimal notation.
	 * @param boolean oddLength: whether the palindrome is of odd or even
	 *        length.
	 * 
	 *        This function is an optimization from: public static int
	 *        makePalindrome(int n, int base, boolean oddLength): int.
	 * 
	 *        Returns: an int, that represents the decimal representation of
	 *        that palindrome from the base two.
	 * 
	 */
	public static long makePalindromeBase2(long n, boolean oddlength) {
		long res = n;
		if (oddlength) {
			n = n >> 1;
		}
		while (n > 0) {
			res = (res << 1) + (n & 1);
			n = n >> 1;
		}
		return res;
	}

	public static long multiply(int n) {
		long p = 1;
		int d;
		
		if ( n == 0 ) {
			return 0;
		}
		
		while (n != 0) {
			d = n % 10;
			p *= d;
			n = n / 10;
		}
		return p;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Long[] array;
		//
		// array = Digits.truncateFromRight(3797);
		//
		// for (Long n : array) {
		// System.out.println(n);
		// }
		//
		// array = Digits.truncateFromLeft(3797);
		// for (Long n : array) {
		// System.out.println(n);
		// }
		// array = Digits.truncate(3797);
		// for (Long n : array) {
		// System.out.println(n);
		// }

		// System.out.println(BaseConverter.from10UpToZ(83, 2));
		long pali = makePalindrome(21, 2, false);
		System.out.println(pali);
		pali = makePalindrome(21, 2, true);
		System.out.println(pali);
		System.out.println(BaseConverter.from10UpToZ(15, 2));
		System.out.println(pali);
		System.out.println(BaseConverter.from10UpToZ(pali, 2));
		pali = makePalindromeBase2(110, false);
		System.out.println(pali);

		long data = reverse(13, 2);
		System.out.println(data);
		System.out.println(BaseConverter.from10ToBinary(data));
		System.out.println(makePalindromeEven(12321));
		System.out.println(makePalindromeEven(151));
		System.out.println(makePalindromeEven(1234));
		System.out.println(makePalindromeEven(123));
		System.out.println(makePalindromeEven(1));
		System.out.println(makePalindromeEven(0));
	}
}
