package com.lam.mathematics.array;

import com.lam.annotation.Note;


public class ArrayUtil {
	public static int[] findPrefixSum(int n, int... array) {
		int[] prefix = new int[1 + array.length];

		for (int i = 1; i < prefix.length; i++) {
			if (array[i - 1] == n) {
				prefix[i] = 1 + prefix[i - 1];
			} else {
				prefix[i] = prefix[i - 1];
			}
		}
		return prefix;
	}

	public static int[] findPrefixSum(int... array) {
		int[] prefix = new int[1 + array.length];

		for (int i = 1; i < prefix.length; i++) {
			prefix[i] = prefix[i - 1] + array[i - 1];
		}
		return prefix;
	}

	public static int[] findPrefixSum(int[] array, int start, int end) {
		int[] prefix = new int[2 + end - start];

		for (int i = 1; i < prefix.length; i++) {
			prefix[i] = prefix[i - 1] + array[start + i - 1];
		}
		return prefix;
	}

	   @Note(note = "Tested missing")
	public static int goldenMaxSlice(int[] array) { 
            int maxEnding = 0;
            int maxSlice = 0;
            for (int a : array) {
            	maxEnding = Math.max(0, maxEnding + a);
            	maxSlice = Math.max(maxSlice, maxEnding);
            }
            
            return  maxSlice;
	   }
	   
	public static void main(String[] args) {
		int[] prefix = ArrayUtil
				.findPrefixSum(new int[] { 4, 3, 2, 2, 2, 5, 8 });

		for (int n : prefix) {
			System.out.println(n);
		}
	}
}
