package com.lam.mathematics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Definition: The number n is abundant if the sum of all its positive divisors
 * (proper divisors) except itself is more than n.
 * 
 * By mathematical analysis, it can be shown that all integers greater than
 * 28123 can be written as the sum of two abundant numbers.
 * 
 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16.
 * 
 * First ten: 12, 18, 20, 24, 30, 36, 40, 42, 48, 54
 * 
 * There are 2487 abundant numbers below 10,000.
 * 
 */
public class AbundantNumbers {
	public static final int LIMIT = 2487;
	private List<Integer> numbers;
	public static final String PathToFile = "./src/main/resources/dataOut/abundantNumbers";
    private int limit;
    
	public AbundantNumbers() {
		this(LIMIT);
	}

	public AbundantNumbers(int limit) {
		this.numbers = new ArrayList<Integer>();
		this.limit = limit;
	}

	public void find() {
		for (int i = 1; this.numbers.size() < this.limit; i++) {
			if ( NumberTheory.isAbundant(i)) {
				this.numbers.add(i);
			}
		}
	}

	public List<Integer> getNumbers() {
		return this.numbers;
	} 
	
	public void saveNumbers() {
		PrintWriter out = null;
		try {
			out = new PrintWriter(PathToFile);
			for (int i = 0; i < this.numbers.size(); i++) {
				out.println(this.numbers.get(i));
			}
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			out.close();
		}
	}

	public static void main(String[] args) {
		AbundantNumbers abundantNumbers = new AbundantNumbers();
		abundantNumbers.find();
		System.out.println(abundantNumbers.getNumbers().size());
		abundantNumbers.saveNumbers();
	}
}
