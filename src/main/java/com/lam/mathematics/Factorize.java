package com.lam.mathematics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.lam.annotation.Note;


public class Factorize {
	public static List<Long> find(long n) {
		Primes aPrime = new Primes();
		aPrime.find((int) Math.sqrt(n) + 1);

		long[] primes = aPrime.getArray();
		List<Long> factors = new ArrayList<Long>();

		if (n == 1) {
			factors.add(1L);
			return factors;
		}

		for (int i = 0; i < primes.length; i++) {
			if (primes[i] * primes[i] > n) {
				break;
			}
			while (n % primes[i] == 0) {
				factors.add(primes[i]);
				n /= primes[i];
			}
		}
		if (n > 1) {
			factors.add(n);
		}
		return factors;
	}

	
	@Note(note="Pending unit test")
	public static Map<Long, Long> exponentialPrimeFactorization(int n) {
		List<Long> list = Factorize.find(n);
		Map<Long, Long> map = Histogram.findHistogram(list);
		
		return map;
	}
	
	public static int numberOfFactors(int n) {
		List<Long> list = Factorize.find(n);
		Map<Long, Long> map = Histogram.findHistogram(list);

		Collection<Long> collection = map.values();
		int numberOfFactors = 1;
		
		for ( Long power : collection ) {
			numberOfFactors *= (power + 1);
		}
		return numberOfFactors;
	}
	
	public static void main(String[] args) {
		List<Long> list = Factorize.find(28);
		System.out.println(list);
		Factorize.exponentialPrimeFactorization(20);
	}
}
