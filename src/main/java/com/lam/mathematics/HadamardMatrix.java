package com.lam.mathematics;

import java.util.Arrays;

public class HadamardMatrix {

    /**
     * A recursive method for finding the Hadamard Matrix 
     * 
     * @param n: order of the matrix, it is a power of 2.
     * @return the Hadamard matrix.
     */
    public static char[][] create(int n) {
        if (n == 1) {
            return new char[][] {{'T'}};
        } else {
            char[][] data = new char[n][n];
            // Divide the matriz into four submatrices
            for (int i = 0; i < n/2; i++) {
                for (int j = 0; j < n/2; j++) {
                    data[i][j] = create(n / 2)[i][j];
                }
            }
            for (int i = n/2, k = 0; i < n; i++, k++) {
                for (int j = 0; j < n/2; j++) {
                    data[i][j] = create(n / 2)[k][j];
                }
            }
            
            for (int i = 0; i < n/2; i++) {
                for (int j = n/2, y = 0; j < n; j++, y++) {
                    data[i][j] = create(n / 2)[i][y];
                }
            }

            for (int i = n/2, k = 0; i < n; i++, k++) {
                for (int j = n/2, y = 0; j < n; j++, y++) {
                    data[i][j] = create(n / 2)[k][y];
                    if (data[i][j] == 'F') {
                        data[i][j] = 'T';
                    } else {
                        data[i][j] = 'F';
                    }
                }
            }
            return data;
        }
    }
    
    public static void print(char[][] data) { 
        for (int i = 0; i < data.length; i++) {
            System.out.println(Arrays.toString(data[i]));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        HadamardMatrix.print(HadamardMatrix.create(1));
        HadamardMatrix.print(HadamardMatrix.create(2));
        HadamardMatrix.print(HadamardMatrix.create(4));
        HadamardMatrix.print(HadamardMatrix.create(8));
    }
}
