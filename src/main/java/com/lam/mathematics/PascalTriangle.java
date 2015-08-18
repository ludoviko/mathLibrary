package com.lam.mathematics;

import java.util.ArrayList;
import java.util.List;

import com.lam.annotation.Note;


@Note(note="Testing missing")
public class PascalTriangle {
	
	/**
	 * Find a a single Pascal element from a given row.
	 * 
	 * @param row: The row is zero based.
	 * @param column
	 * @return the Pascal element
	 */
	public Long findPascalElement(int row, int column) {
		Long element = Combinatorics.combinations(row, column);
		return element;
	}

	/**
	 * 
	 * 	Find the Pascal elements from the Pascal Triangle that are in a given row. 
	 * 
	 * @param rows: The row is zero based. 
	 * @return: an array with the row's elements.
	 */
	public long[] findPascalRow(int row) {
		long[] array = new long[row + 1]; 
		
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
	public List<Long> findPascal(int rows) {
	 List<Long> list = new ArrayList<Long>();
	 
		for (int row = 0; row <= rows; row++) {
			for (int i = 0; i <= row; i++) {
				list.add(findPascalElement(row, i));
			}
		}
		return list;
	}
	
}
