package com.lam.mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.math.BigInteger;

/**
 * Class for finding the Fibonacci (n) mod (m) of big numbers using the Pisano period.
 */
public class FibonacciModule {
    private BigInteger n;
    private BigInteger module;


    /**
     *
      * @param n: The target value for which the fibonacci number must be searched.
     * @param module: the module value.
     */
    public FibonacciModule(BigInteger n, int module) {
        assert  module > 0;
        this.n = n;
        this.module = new BigInteger("" + module);
    }

    private int findPisanoPeriod() {
        PisanoPeriod pisanoPeriod = new PisanoPeriod(this.module);
        return pisanoPeriod.findPeriod();
    }

    /**
     *
      * @return the result of the operation as a BigInteger.
     */
    public BigInteger find() {
        int period = findPisanoPeriod();

        BigInteger remainder = this.n.mod(new BigInteger("" + period));

        Fibonacci fibonacci = new Fibonacci();
        fibonacci.find(new Integer (remainder.toString()));

        return fibonacci.getData().get(new Integer ( remainder.toString() )).mod(this.module);
    }

    public static void main(String[] strings) throws IOException {
        StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        FibonacciModule fibonacciModule;
        String n;
        int mod;
        // Testing instance method.
        // Control D to quit.
        // Expected arguments at line:
        // n m
        // where n is the target number and m is the module.

        while(streamTokenizer.nextToken() != StreamTokenizer.TT_EOF){
            n = "" + (int)streamTokenizer.nval;
            if (streamTokenizer.nextToken() != StreamTokenizer.TT_EOF){
                mod = (int) streamTokenizer.nval;
                fibonacciModule = new FibonacciModule(new BigInteger(n), mod);
                System.out.println(fibonacciModule.find());
            } else {
                break;
            }
        }

    }
}
