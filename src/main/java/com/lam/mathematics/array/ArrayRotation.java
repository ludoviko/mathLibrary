package com.lam.mathematics.array;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;

/**
 * Created by Usuario on 25/08/2018.
 */
public class ArrayRotation {
    private Object[][] data;

    public ArrayRotation(Object[][] data) {
        this.data = data;
    }

    public static Object[][] rotateMatrixClockwise(int times, Object[][] array) {
        Object[][] rotated = array;

        for (int i = 0; i < times; i++) {
            rotated = rotateMatrixClockwise(rotated);
        }

        return rotated;
    }

    public static Object[][] rotateMatrixClockwise(Object[][] array) {
        int rows = array.length;
        int columns = array[0].length;

        Object[][] rotate = new Object[columns][rows];

        for (int r = 0; r < columns; r++) {
            for (int c = 0; c < rows; c++) {
                rotate[r][c] = array[rows - 1 - c][r];
            }
        }

        return rotate;
    }

    // XXX.
    public static Object[][] rotateMatrixCounterClockwise(Object[][] array) {
        int rows = array.length;
        int columns = array[0].length;

        Object[][] rotate = new Object[columns][rows];

        for (int r = 0; r < columns; r++) {
            for (int c = 0; c < rows; c++) {
                rotate[r][c] = array[rows - 1 - c][r];
            }
        }

        return rotate;
    }


    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;

        Object[][] array = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},
                {'j', 'k', 'l'},
                {'m', 'n', 'o'}
        };

        Object[][] matrix = rotateMatrixClockwise(1, array);
        out.println(Arrays.toString(matrix));
        matrix = rotateMatrixClockwise(2, array);
        matrix = rotateMatrixClockwise(3, array);
        matrix = rotateMatrixClockwise(4, array);
        out.println(Arrays.toString(matrix));

    }

}
