package com.lam.mathematics;

/**
 * 
 * 
 * Problem 28: Number spiral diagonals 
 * 
 * Starting with the number 1 and moving to the right in a clockwise direction a
 * 5 by 5 spiral is formed as follows:
 * 
 * 21 22 23 24 25 
 * 20  7  8  9 10 
 * 19  6  1  2 11 
 * 18  5  4  3 12  
 * 17 16 15 14 13
 * 
 * It can be verified that the sum of the numbers on the diagonals is 101.
 * 
 * What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral
 * formed in the same way?
 * 
 * Answer: 669171001.
 * 
 */

public class SpiralGrid {
	public static int RIGHT = 1;
	public static int DOWN = 2;
	public static int LETF = 3;
	public static int UP = 4;

	public static int START_FROM = 1;

	private int[][] grid;

	public SpiralGrid(int[][] array) {
		setGrid(array);
		this.fillGrid();
	}

	public SpiralGrid(int size) {
		setGrid(new int[size][size]);
		this.fillGrid();
	}
	
	public SpiralGrid() {
	}
	
	public void setGrid(int[][] array) {
		this.grid = array;
	}

	public int[][] getGrid() {
		return grid;
	}

	public  void fillGrid() {
		int value = START_FROM;
		int m, n, side, upTo;
		String string;
		String[] strings;

		m = grid.length / 2;
		n = m;

		grid[m][n] = value++;

		upTo = grid.length * 2 - 1;

		for (int i = 1; i <= upTo; i++) {
			side = (int) Math.round(i / 2.0);
			// System.out.println("Side :" + side);
			if (side >= grid.length) {
				--side;
			}
			string = this.move(grid, m, n, value, side, i);
			strings = string.split(",");
			m = Integer.parseInt(strings[0]);
			n = Integer.parseInt(strings[1]);
			value = Integer.parseInt(strings[2]);
		}
	}

	public int getSumDiagonals() {
		int main_diagonal = 0;
		int second_diagonal = 0;
		for (int i = 0; i < grid.length; i++) {
			main_diagonal += grid[i][i];
			second_diagonal += grid[grid.length - 1 - i][i];
		}
		return main_diagonal + second_diagonal - START_FROM;
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
	
	private String move(int[][] array, int x, int y, int value, int side, int to) {
		to = getWise(to);
		 
		switch (to) {
		case 1: {
			for (int i = 1; i <= side; i++) {
				y = y + 1;
				array[x][y] = value;
				value++;
			}
			break;
		}
		case 2: {
			for (int i = 1; i <= side; i++) {
				x = x + 1;
				array[x][y] = value;
				value++;
			}
			break;
		}
		case 3: {
			for (int i = 1; i <= side; i++) {
				y = y - 1;
				array[x][y] = value;
				value++;
			}
			break;
		}
		case 4: {
			for (int i = 1; i <= side; i++) {
				x = x - 1;
				array[x][y] = value;
				value++;
			}
			break;
		}
		}
		return x + "," + y + "," + value;
	}

	public void print() {
		for (int i = 0; i < grid[0].length; i++) { 
			for (int j = 0; j < grid.length; j++) { 
				System.out.print(grid[i][j] +  " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		SpiralGrid spiral = new SpiralGrid(new int[101][101]);
		System.out.println(spiral.getSumDiagonals());
		spiral.print();
	}
}
