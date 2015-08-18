package com.lam.mathematics;


// XXX no se entiende
public class CountingIntegerPartition {

	public static int count = 0;

	public int count(int n) {

		int counter;

		if (n == 0 || n == 1) {
			return n;
		}

		counter = count(n - 1) + 1;

		return counter;

	}

	public int partition(int sum, int largestNumber) {

		if (largestNumber == 0) {
			return 0;
		}

		if (sum == 0) {
			return 1;
		}

		if (sum < 0) {
			return 0;
		}

		return partition(sum, largestNumber - 1)
				+ partition(sum - largestNumber, largestNumber);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CountingIntegerPartition data = new CountingIntegerPartition();
		
		   int sum = 5;
		    int largestNumber = 4;

		    int result = data.partition(sum,largestNumber);
		    System.out.println(result);
	}
}
