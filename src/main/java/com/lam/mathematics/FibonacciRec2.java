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
 * No memoization algorithm.
 */
public class FibonacciRec2 {
    private List<BigInteger> data;
    private int n;

    /**
     * @param n: the parameter for the fibonacci constructor.
     */
    public FibonacciRec2(int n) {
        this.data = new ArrayList<BigInteger>();
        this.n = n;
        this.data.add(new BigInteger("0"));
        this.data.add(new BigInteger("1"));
    }

    /**
     * This method triggers the search of the fibonacci value for n.
     */
    public void find() {
         this.calculate(this.n, new BigInteger("0"), new BigInteger("1"));
    }

    /**
     * @param index: the i argument for calculation the fibonacci number using a recursive call.
     * @return The calculated the fibonacci number.
     * The list of calculated values is set accordingly with intermediate values.
     */
    private void calculate(int index, BigInteger value1, BigInteger value2) {
        if (index <= 1 ) {
        } else {
            data.add(value1.add(value2));
            this.calculate(index - 1, value2, value1.add(value2));
        }
    }

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
     * @return The list of BigIntegers of calculated values from o to n.
     */
    public List<BigInteger>  getData() {
        return this.data;
    }

    public static void main(String[] strings) throws IOException {
        StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        FibonacciRec2 f;

/*
        // Testing instance method.
        while(streamTokenizer.nextToken() != StreamTokenizer.TT_EOF){
            int n = (int)streamTokenizer.nval;
            f  = new FibonacciRec2(n);
            f.find();
            System.out.println(f.getData().get(n));
        }
*/
        // Control D to quit.
        // Testing static utility method.
        while(streamTokenizer.nextToken() != StreamTokenizer.TT_EOF){
            int n = (int)streamTokenizer.nval;
            System.out.println(FibonacciRec2.getElement(n));
        }
    }
}
