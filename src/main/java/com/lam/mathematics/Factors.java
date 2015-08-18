package com.lam.mathematics;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// Class for finding the factors or divisors of a given number.
public class Factors {
	private Set<Long> factors;
	private Set<Long> properDivisors;
	private long n;
	
	public Factors(Set<Long> factors) {
		this.factors = factors;
	}

	public Factors() {
		this.factors = new TreeSet<Long>() ;
	}

	// XXX recheck... difficult to follow. 
	public void find(long n) {
		this.n = n;
		List<Long> primeFactors = Factorize.find(n);
		long count = (long) (Math.pow(2, primeFactors.size()));
		String bin;
		long product = 1;

		factors.clear();
		factors.add(1L);
		
		for (int i = 1; i < count; i++) {
			bin = Integer.toBinaryString(i);
			while ( bin.length() <  primeFactors.size()) {
				bin = '0' + bin;
			}
			for (int j = 0; j < bin.length(); j++) {
				if ( bin.charAt(j)  == '1') {
					product *= primeFactors.get(j);
				}
			}
			factors.add(product);
			product = 1;
		}

		this.properDivisors = new TreeSet<Long>(factors);
		properDivisors.remove(n);
	}

	public Set<Long> getProperDivisors() {
		return properDivisors;
	}

	public Set<Long> getFactors() {
		return factors;
	}
	
	public long getN() { 
		return this.n;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Factors factors = new Factors();
		
		factors.find(28);
	    System.out.println(factors.getFactors() + "/" + factors.getProperDivisors());	

		factors.find(12496);
	    System.out.println(factors.getFactors() + "/" + factors.getProperDivisors());
	    
	    long summa = 0;
	    for (long a : factors.getProperDivisors()) {
	    	summa  += a;
	    }
	    System.out.println(summa);
	}
}
