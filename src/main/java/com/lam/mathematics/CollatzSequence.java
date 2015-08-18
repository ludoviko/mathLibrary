package com.lam.mathematics;

import java.util.ArrayList;
import java.util.List;

public class CollatzSequence {

	/**
	 *  Collatz sequence
	 * 
	 * The following iterative sequence is defined for the set of positive
	 * integers:
	 * 
	 * n → n/2 (n is even) n → 3n + 1 (n is odd)
	 * 
	 * Using the rule above and starting with 13, we generate the following
	 * sequence: 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
	 * 
	 * It can be seen that this sequence (starting at 13 and finishing at 1)
	 * contains 10 terms. Although it has not been proved yet (Collatz Problem),
	 * it is thought that all starting numbers finish at 1.
	 */

	List<Long> list;

	public CollatzSequence() {
	}

	public CollatzSequence(List<Long> list) {
		this.list = list;
	}

	public List<Long> getList() {
		return list;
	}

	public void setList(List<Long> list) {
		this.list = list;
	}

	public void find(long n) {
		list.clear();
		list.add(n);
		
		while (n != 1 ) {
			if (n % 2 == 0) {
               n = n / 2;
			}  else {
			    n = 3 * n + 1;	
			}
        //	System.out.println(n + " ");
            list.add(n);
		};
	}

	public static void main(String[] args) {
		List<Long> list =  new ArrayList<Long>();
		CollatzSequence  sequence = new CollatzSequence(list);  
		sequence.find(113383);
		
        for (Long n : list) {
        	System.out.print(n + " ");
        }
	}
}
