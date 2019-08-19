package com.lam.mathematics;

import com.lam.annotation.Note;


@Note(note="Testing missing")
public class PascalTriangle {

	/**
     * Find a a single Pascal element from a given row and column. For not existing
     * rows and columns the method returns zero.
     *
	 * @param row: The row is zero based.
     * @param column: The column is zero based.
	 * @return the Pascal element
	 */
    public static long pascal(int row, int column) {
        if (row == column) {
            return 1;
        } else if (column == 0) {
            return 1;
        } else if (row > 0 && column > 0) {
            return pascal(row - 1, column - 1) + pascal(row - 1, column);
        } else {
            return 0;
		}
	}
}
