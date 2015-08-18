package com.lam.mathematics;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.lam.annotation.Note;


public class EulersTotientFunction {
	public static long findPhi(int n) {
		Map<Long, Long> map = Factorize.exponentialPrimeFactorization(n);
		Set<Map.Entry<Long, Long>> set = map.entrySet();
		Iterator<Map.Entry<Long, Long>> iterator = set.iterator();
		Map.Entry<Long, Long> entry;
		Long key, value;
		long phi = 1;
		
		if (n == 1) {
			return phi;
		}
		
		while (iterator.hasNext()) {
			entry = iterator.next();
			key = entry.getKey();
			value = entry.getValue();
			phi *= (key -1)*Math.pow(key, value -1); 
		}
		
		return phi;
	}
	
	@Note(note="Testing pending")
	// XXX this solution is not optimal. Naive approach. Too slow. 
	// See white paper from ProjectEuler # 69 and forum.
	public static Fraction findNDividedByPhi(int n) {
		Map<Long, Long> map = Factorize.exponentialPrimeFactorization(n);
		Set<Map.Entry<Long, Long>> set = map.entrySet();
		Iterator<Map.Entry<Long, Long>> iterator = set.iterator();
		Map.Entry<Long, Long> entry;
		Long key, value;
		long phi = 1;
		Fraction fraction; 
		
		if (n == 1) {
			return new Fraction(1);
		}
		
		while (iterator.hasNext()) {
			entry = iterator.next();
			key = entry.getKey();
			value = entry.getValue();
			phi *= (key -1)*Math.pow(key, value -1); 
		}
	
		fraction = new Fraction(n, phi);
		fraction = fraction.reduce();
		return fraction;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
