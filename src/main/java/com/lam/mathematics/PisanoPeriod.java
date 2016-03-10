package com.lam.mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Class for finding the Pisano period.
 *
 * In number theory, the nth Pisano period, written ?(n),
 * is the period with which the sequence of Fibonacci numbers taken modulo n repeats.
 * Pisano periods are named after Leonardo Pisano, better known as Fibonacci.
 * The existence of periodic functions in Fibonacci numbers was noted by Joseph Louis Lagrange in 1774.
 */
public class PisanoPeriod {
    private BigInteger module;

    /**
     * Constructor.
     * @param module: The module.
     */
    public PisanoPeriod(int module) {
        assert  module > 0;
        this.module = new BigInteger("" + module);
    }

    public PisanoPeriod(BigInteger module) {
        assert ! module.equals(BigInteger.ZERO);
        this.module = module;
    }

    /**
     * This method finds the length of the Pisano period for this.module.
     * @return
     */
    public int findPeriod() {
        Fibonacci fibonacci = new Fibonacci();
        BigInteger element = BigInteger.ZERO;
        List<BigInteger> sequence = new ArrayList<BigInteger>();

        // Border case for module one.
        if ( this.module.equals(BigInteger.ONE) ) {
            return 1;
        }

        for (int i = 0; ; i++) {
            element = fibonacci.nextFibonacci().mod(this.module);
            sequence.add(element);
            if ( i > 2 ) {
                // Look for Pisano property.
                if ( sequence.get(i).equals( BigInteger.ONE) && sequence.get(i-1).equals( BigInteger.ZERO)  ) {
                    break;
                }
            }
        }

        return sequence.size() - 2;
    }

    public static void main(String[] strings) throws IOException {
        StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PisanoPeriod pisanoPeriod;

        // Testing instance method.
        // Control D to quit.
        while(streamTokenizer.nextToken() != StreamTokenizer.TT_EOF){
            int n = (int)streamTokenizer.nval;
            pisanoPeriod = new PisanoPeriod(n);
            System.out.println(pisanoPeriod.findPeriod());
        }
    }
}
