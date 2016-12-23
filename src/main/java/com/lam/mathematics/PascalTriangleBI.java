package com.lam.mathematics;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public class PascalTriangleBI {
	
	/**
	 * Find a a single Pascal element from a given row.
	 * 
	 * @param row: The row is zero based.
	 * @param column
	 * @return the Pascal element
	 */
	public BigInteger findPascalElement(int row, int column) {
		BigInteger element = Combinatorics.combinationsBI(row, column);
		return element;
	}

	/**
	 * 
	 * 	Find the Pascal elements from the Pascal Triangle that are in a given row. 
     * 
	 * 
	 * @param row: The row is zero based.
	 * @return: an array with the row's elements.
	 */
	public BigInteger[] findPascalRow(int row) {
		BigInteger[] array = new BigInteger[row + 1]; 
		
		for (int i = 0; i < array.length; i++) {
			array[i] = findPascalElement(row, i);
		}
		return array;
	}


	/**
	 * Find the Pascal elements from the Pascal Triangle. 
	 * 
	 * @param rows: The rows are zero based. 
	 * @return: a list that contains the Palcal's elements.
	 */
	public List<BigInteger> findPascal(int rows) {
	 List<BigInteger> list = new ArrayList<BigInteger>();
	 
		for (int row = 0; row <= rows; row++) {
			for (int i = 0; i <= row; i++) {
				list.add(findPascalElement(row, i));
			}
		}
		return list;
	}
	
}
