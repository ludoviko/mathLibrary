package com.lam.mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Class for calculation the fibonacci number up to a given number.
 * Intermediate -lower- values are saved in a list of Big Integers.
 * Iterative algorithm.
 */
public class Fibonacci {
    private List<BigInteger> data;
    private int n;

    /**
     * @param n: the target fibonacci arguments, it goes from zero to any positive whole number.
     */
    public Fibonacci(int n) {
        this.data = new ArrayList<BigInteger>();
        this.n = n;
    }

    /**
     * This method triggers the search of the fibonacci value for n and lesser values.
     */
    public void find() {
        this.data.clear();
        this.calculate();
    }

    private void calculate() {
        // Calculate the fibonacci numbers using values from zero up to this.n.
        for (int i = 0; i <= this.n; i++) {
            nextFibonacci();
        }
    }

    /**
     * A method for finding the next fibonacci number.
     * It updates the list of fibonacci numbers.
     *
     * @return the last calculated fibonacci number.
     */
    public BigInteger nextFibonacci() {
        if (this.data.size() == 0) {
            // Base case: zero.
            this.data.add(new BigInteger("0"));
        } else if (this.data.size() == 1) {
            // Base case: one.
            this.data.add(new BigInteger("1"));
        } else {
            this.data.add( this.data.get(this.data.size()-1).add(this.data.get(this.data.size()-2)) );
        }
        return this.data.get(this.data.size()-1);
    };

    /**
     * A static utility class for finding the fibonacci number for any value.
     * @param index: the i argument for calculation the fibonacci number using a recursive call.
     * @return The calculated the fibonacci number.
     *
     */
    public static BigInteger getElement(int index) {
        return getElement(index, new BigInteger("0"), new BigInteger("1"));
    }

    private static BigInteger getElement(int index, BigInteger value1, BigInteger value2) {
        return (index == 0) ? value1 : (index > 1) ? getElement(index - 1, value2, value1.add(value2)) : value2;
    }

    /**
     * A static utility class for finding the fibonacci number for any value.
     * @param n: the i argument for calculation the fibonacci number using the Phi formula.
     * @return The calculated the fibonacci number.
     *
     */
 /*
    public static long calculatePhi(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        double exp = n * Math.log10(phi) - Math.log10(5) / 2;
        int fib = (int) Math.round(Math.pow(10, exp));

        return fib;
    }
*/

    /**
     * @return The list of BigIntegers of calculated values from o to n.
     */
    public List<BigInteger>  getData() {
        return this.data;
    }

    public static void main(String[] strings) throws IOException {
        StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        Fibonacci f;

        // Testing instance method.
        // Control D to quit.
        while(streamTokenizer.nextToken() != StreamTokenizer.TT_EOF){
            int n = (int)streamTokenizer.nval;
            f  = new Fibonacci(n);
            f.find();
            System.out.println(f.getData().get(n));
        }
/*
        // Testing static utility method.
        // Control D to quit.
        while(streamTokenizer.nextToken() != StreamTokenizer.TT_EOF){
            int n = (int)streamTokenizer.nval;
            System.out.println(FibonacciRecursive.getElement(n));
        }
*/
    }
}
