package com.lam.mathematics.statistics;

import java.util.Stack;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Class to find within the sequence tha element whose value occurs more
 *         that n / 2 times, where n is the size of the sequence.
 *
 */

public class Leader {
	private char noLeader = '.';

	public Leader() {
	}
	

	public void setNoLeader(char noLeader) {
		this.noLeader = noLeader;
	}
	
	public char goldenLeader(String data) {
		Stack<Character> stack = new Stack<Character>();
		Character last;
		Character leader = this.noLeader;

		for (int i = 0; i < data.length(); i++) {
			if (stack.isEmpty()) {
				stack.push(data.charAt(i));
			} else {
				last = stack.peek();
				if (last != data.charAt(i)) {
					stack.pop();
				} else {
					stack.push( data.charAt(i));
				}
			}
		}

		if (stack.isEmpty()) {
		} else {
			// count the candidate occurrences
			int c = countCandidate(data, stack.peek());
			if (c > data.length() / 2) {
				leader = stack.peek();
			}
		}

		return leader;
	}

	private int countCandidate(String data, char candidate) {
		int c = 0;
		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) == candidate) {
				c++;
			}
		}
		return c;
	}

  public char getNoLeader() {
	  return this.noLeader;
  }
}
