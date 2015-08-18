package com.lam.mathematics.array;

import java.util.ArrayList;
import java.util.List;

import com.lam.annotation.Note;


public class ArrayUtil {

	// public static Object findByValue(Object[] array, Object object) {
	// checkArrayLength(array.length);
	//
	// for (int i = 0; i < array.length; i++) {
	// if (array[i].equals(object)) {
	// return object;
	// }
	//
	// }
	// return null;
	// }

	public static int[] findDistinctCountValues(int... array) {
		int size = findRightSize(array);

		int[] data = new int[size];

		for (int i = 0; i < array.length; i++) {
			data[array[i]] = 1;
		}
		return data;
	}

	private static int findRightSize(int... array) {
		int greatest = findAbsGreatest(array) + 1;
		int size = array.length + 1;

		size = size > greatest ? size : greatest;
		return size;
	}

	public static int[] findAbsDistinctCountValues(int... array) {
		int[] arrayAbs = copyAbsValues(array);
		return findDistinctCountValues(arrayAbs);
	}

	public static int[] findAbsDistinctCountValuesExceptExtremes(int... array) {
		int[] arrayAbs = copyAbsValuesExceptExtremes(array);
		return findDistinctCountValues(arrayAbs);
	}

	public static int[] findHistogram(int[] array) {

		int size = findRightSize(array);

		int[] data = new int[size];

		for (int i = 0; i < array.length; i++) {
			data[array[i]] += 1;
		}
		return data;
	}

	public static int[] findHistogramPositiveValues(int[] array) {

		int size = findRightSize(array);

		int[] data = new int[size];

		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 0) {
				data[array[i]] += 1;
			}
		}
		return data;
	}

	public static int[] findHistogramNegativeValues(int[] array) {

		int size = findRightSize(array);

		int[] data = new int[size];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				data[Math.abs(array[i])] += 1;
			}
		}
		return data;
	}

	public static int[] copyAbsValuesExceptExtremes(int... array) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < array.length; i++) {
			if (array[i] == Integer.MIN_VALUE || array[i] == Integer.MAX_VALUE) {
			} else {
				list.add(Math.abs(array[i]));
			}
		}

		int[] arrayInt = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			arrayInt[i] = list.get(i);
		}

		return arrayInt;
	}

	public static int[] findHistogramAbsoluteValue(int[] array) {
		int[] arrayAbs = copyAbsValues(array);
		return findHistogram(arrayAbs);
	}

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

	public static int findGreatest(int... array) {
		int max = Integer.MIN_VALUE;

		 checkArrayLength(array.length);

		for (int i = 0; i < array.length; i++) {
			if (array[i] >= max) {
				max = array[i];
			}
		}
		return max;
	}

	public static int findLowest(int... array) {
		int min = Integer.MAX_VALUE;

		 checkArrayLength(array.length);

		for (int i = 0; i < array.length; i++) {
			if (array[i] <= min) {
				min = array[i];
			}
		}
		return min;
	}

	public static int findAbsGreatestExceptExtremes(int... array) {
		int[] arrayAbs = copyAbsValuesExceptExtremes(array);
		return findGreatest(arrayAbs);
	}

	public static int findAbsGreatest(int... array) {
		int[] arrayAbs = copyAbsValuesExceptExtremes(array);
		return findGreatest(arrayAbs);
	}

	public static int[] copyAbsValues(int... array) {
		int[] arrayAbs = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			arrayAbs[i] = Math.abs(array[i]);
		}
		return arrayAbs;
	}

	public static int findGreatestAbsoluteValueByIndex(int[] array) {
		int max = Integer.MIN_VALUE;
		int index = -1;

		checkArrayLength(array.length);

		for (int i = 0; i < array.length; i++) {
			if (Math.abs(array[i]) >= max) {
				max = Math.abs(array[i]);
				index = i;
			}
		}
		return index;
	}

	   @Note(note = "Tested missing")
	public static int findGreatestValueByIndex(int[] array) {
		int max = Integer.MIN_VALUE;
		int index = -1;

		 checkArrayLength(array.length);

		for (int i = 0; i < array.length; i++) {
			if ( array[i] >= max) {
				max = Math.abs(array[i]);
				index = i;
			}
		}
		return index;
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
	   
	   @Note(note = "Tested missing")
	public static int findLowestValueByIndex(int[] array) {
			int min = Integer.MAX_VALUE;
			int index = -1;

			// checkArrayLength(array.length);

			for (int i = 0; i < array.length; i++) {
				if (array[i] <= min) {
					min = array[i];
					index = i;
				}
			}
			
			return index;
		}

	private static void checkArrayLength(int len) {
		if (len == 0) {
			throw new RuntimeException("Se ha encontrado una lista vacia:"
					+ "La lista debe tener datos");
		}
	}

	public static void main(String[] args) {
		int[] prefix = ArrayUtil
				.findPrefixSum(new int[] { 4, 3, 2, 2, 2, 5, 8 });

		for (int n : prefix) {
			System.out.println(n);
		}
	}
}
