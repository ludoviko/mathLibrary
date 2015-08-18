package com.lam.mathematics;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 
 * Problem 28: Number spiral diagonals
 * 
 * Starting with the number 1 and moving to the right in a clockwise direction a
 * 5 by 5 spiral is formed as follows:
 * 
 * 21 22 23 24 25 20 7 8 9 10 19 6 1 2 11 18 5 4 3 12 17 16 15 14 13
 * 
 * It can be verified that the sum of the numbers on the diagonals is 101.
 * 
 * What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral
 * formed in the same way?
 * 
 * Answer: 669171001.
 * 
 */

public class SpiralDiagonal {
	public static int RIGHT = 1;
	public static int DOWN = 2;
	public static int LETF = 3;
	public static int UP = 4;

	public static int START_FROM = 1;

	private int length;

	private List<Integer> diagonalTopDown;
	private List<Integer> diagonalBottomUp;
	private List<Integer> diagonal;


	public SpiralDiagonal(int size) {
		diagonalTopDown = new ArrayList<Integer>();
		diagonalBottomUp = new ArrayList<Integer>();
		diagonal = new ArrayList<Integer>();
		this.length = size;
		this.fillDiagonals();
	}

	public SpiralDiagonal() {
	}

	public List<Integer> getDiagonalTopDown() {
		return diagonalTopDown;
	}

	public List<Integer> getDiagonalBottomUp() {
		return diagonalBottomUp;
	}

	public List<Integer> getDiagonal() {
		diagonal.addAll(diagonalTopDown);
		diagonal.addAll(diagonalBottomUp);
		return diagonal;
	}
	
	public void fillDiagonals() {
		int value = START_FROM;
		int m, n, side, upTo;
		String string;
		String[] strings;

		m = this.length / 2;
		n = m;

		diagonalTopDown.add(value++);

		upTo = this.length * 2 - 1;

		for (int i = 1; i <= upTo; i++) {
			side = (int) Math.round(i / 2.0);
			if (side >= this.length) {
				--side;
			}
			string = this.move(m, n, value, side, i);
			strings = string.split(",");
			m = Integer.parseInt(strings[0]);
			n = Integer.parseInt(strings[1]);
			value = Integer.parseInt(strings[2]);
		}
	}

	public int getSumDiagonals() {
		int main_diagonal = 0;
		int second_diagonal = 0;
		for (int i = 0; i < diagonalTopDown.size(); i++) {
			main_diagonal += diagonalTopDown.get(i);
		}
		for (int i = 0; i < diagonalBottomUp.size(); i++) {
			second_diagonal += diagonalBottomUp.get(i);
		}
		return main_diagonal + second_diagonal;
	}

	private int getWise(int to) {
		if (to > 4) {
			to = to % 4;
		}
		
		switch (to) {
		case 1: {
			to = RIGHT;
			break;
		}
		case 2: { 
			to = DOWN;
			break;
		}
		case 3: { 
			to = LETF;
			break;
		}
		case 0: { 
			to = UP;
			break;
		}
		}
		return to;
	}

	
	private String move(int x, int y, int value, int side, int to) {
        to = getWise(to);
		
		switch (to) {
		case 1: {
			for (int i = 1; i <= side; i++) {
				y = y + 1;
				if (x == y) {
					diagonalTopDown.add(value);
				} else if (x + y == this.length - 1) {
					diagonalBottomUp.add(value);
				}
				value++;
			}
			break;
		}
		case 2: {
			for (int i = 1; i <= side; i++) {
				x = x + 1;
				if (x == y) {
					diagonalTopDown.add(value);
				} else if (x + y == this.length - 1) {
					diagonalBottomUp.add(value);
				}
				value++;
			}
			break;
		}
		case 3: {
			for (int i = 1; i <= side; i++) {
				y = y - 1;
				if (x == y) {
					diagonalTopDown.add(value);
				} else if (x + y == this.length - 1) {
					diagonalBottomUp.add(value);
				}
				value++;
			}
			break;
		}
		case 4: {
			for (int i = 1; i <= side; i++) {
				x = x - 1;
				if (x == y) {
					diagonalTopDown.add(value);
				} else if (x + y == this.length - 1) {
					diagonalBottomUp.add(value);
				}
				value++;
			}
			break;
		}
		}
		return x + "," + y + "," + value;
	}

	public void print() {
		for (int i = 0; i < diagonalTopDown.size(); i++) {
			System.out.print(diagonalTopDown.get(i) + " ");
			System.out.println();
		}
		for (int i = 0; i < diagonalBottomUp.size(); i++) {
			System.out.print(diagonalBottomUp.get(i) + " ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		SpiralDiagonal spiral = new SpiralDiagonal(5);
		System.out.println(spiral.getSumDiagonals());
		// spiral.print();
	}
}
