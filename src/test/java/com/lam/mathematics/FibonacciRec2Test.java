package com.lam.mathematics;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class FibonacciRec2Test {
    @Parameterized.Parameters(name = "{index}: fib({0})={1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, new BigInteger("0")},
                {1, new BigInteger("1")},
                {2, new BigInteger("1")},
                {3, new BigInteger("2")},
                {4, new BigInteger("3")},
                {5, new BigInteger("5")},
                {6, new BigInteger("8")},
                {7, new BigInteger("13") },
                {8, new BigInteger("21") },
                {9, new BigInteger("34") },
                {10, new BigInteger("55") },
                {11, new BigInteger("89") },
                {12, new BigInteger("144") },
                {13, new BigInteger("233") }
        });
    }

    private int input;
    private BigInteger expected;

    public FibonacciRec2Test(int input, BigInteger expected) {
        this.input = input;
        this.expected= expected;
    }

    @Test(timeout = 3000)
    public void test() {
        FibonacciRec2 fibonacci = new FibonacciRec2(100);
        fibonacci.find();
        assertEquals(expected, fibonacci.getData().get(input));
    }

    @Test(timeout = 3000)
    public void testStaticMethod() {
        assertEquals(expected, FibonacciRec2.getElement(input));
    }

}