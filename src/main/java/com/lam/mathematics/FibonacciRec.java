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
 * Use of memoization technique.
 */
public class FibonacciRec {
    private BigInteger[] data;
    private int n;

    /**
     * @param n: the parameter for the fibonacci constructor.
     */
    public FibonacciRec(int n) {
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
     * The array of calculated values is set accordingly for memoization.
     */
    private BigInteger calculate(int n) {
        if ( ! this.data[n].equals(new BigInteger("-1"))) {
            return this.data[n];
        }
        this.data[n] = this.calculate(n - 1).add( this.calculate(n - 2));
        return this.data[n];
    }

    /**
     * @return The array of BigIntegers of calculated values from o to n.
     */
    public BigInteger[] getData() {
        return this.data;
    }

    public static void main(String[] strings) throws IOException {
        StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        // Control D to quit.
        while(streamTokenizer.nextToken() != StreamTokenizer.TT_EOF){
            int n = (int)streamTokenizer.nval;
            FibonacciRec fibonacciBI  = new FibonacciRec(n);
            fibonacciBI.find();
            System.out.println(fibonacciBI.getData()[n]);
        }
    }
}

