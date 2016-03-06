/**
 * 
 */
package com.lam.mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.math.BigInteger;
import java.util.Arrays;

/**
 * Class for calculation the fibonacci number up to a given number.
 * Intermediate -lower- values are saved in an array of Big Integers.
 * Use of iterative technique.
 */
public class Fibonacci {
    private BigInteger[] data;
    private int n;

    /**
     * @param n: the parameter for the fibonacci constructor.
     */
	public Fibonacci(int n) {
        // The serie is calculated for the starting arg of zero.
        this.data = new BigInteger[n + 1];
        this.n = n;

        // Those values not calculated are flagged with -1.
        Arrays.fill(this.data, new BigInteger("-1"));

        // The base  cases for arguments 0 and 1.
        this.data[0] = new BigInteger("0");
        if ( n > 0 ) {
            this.data[1] = new BigInteger("1");
        }
	}

    /**
     * This method triggers the search of the fibonacci value for n.
     */
    public void find() {
        this.calculate(this.n);
    }

    /**
     * @param n: the argument for calculation the fibonacci number.
     * @return The calculated the fibonacci number.
     * The array of calculated values is set accordingly.
     */
    private BigInteger calculate(int n) {
        BigInteger result = null;
        BigInteger a0 = null;
        BigInteger a1 = null;

        for (int i = 2; i <= n; i++) {
            this.data[i]  = this.data[i-1].add(this.data[i-2]);
        }

        return this.data[n];
    }

    /**
     * @return The array of BigIntegers of calculated values from o to n.
     */
    public BigInteger[] getData() {
        return this.data;
    }

    /**
     * A static utility class for finding the fibonacci number for any value.
     * @param n: the i argument for calculation the fibonacci number using the Phi formula.
     * @return The calculated the fibonacci number.
     *
     */
	public static long calculatePhi(long n) {
		double phi = (1 + Math.sqrt(5)) / 2;
		double exp = n * Math.log10(phi) - Math.log10(5) / 2;
		int fib = (int) Math.round(Math.pow(10, exp));

		return fib;
	}

    public static void main(String[] strings) throws IOException {
        StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        // Control D to quit.
        while(streamTokenizer.nextToken() != StreamTokenizer.TT_EOF){
            int n = (int)streamTokenizer.nval;
            Fibonacci fibonacci  = new Fibonacci(n);
            fibonacci.find();
            System.out.println(fibonacci.getData()[n]);
        }
    }
}