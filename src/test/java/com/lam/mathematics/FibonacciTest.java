package com.lam.mathematics;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static junit.framework.TestCase.assertEquals;


@RunWith(Parameterized.class)
public class FibonacciTest {
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

    public FibonacciTest(int input, BigInteger expected) {
        this.input = input;
        this.expected= expected;
    }

    @Test()
    public void test() {
        Fibonacci fibonacci = new Fibonacci(15);
        fibonacci.find();
        assertEquals(expected, fibonacci.getData().get(input));
    }

    @Test(timeout = 3000)
    public void testStaticMethod() {
        assertEquals(expected, Fibonacci.getElement(input));
    }

    @Test(timeout = 3000)
    public void testNextMethod() {
        Fibonacci fib = new Fibonacci(0);
        assertThat(fib.nextFibonacci(), is(new BigInteger("0")));
        assertThat(fib.nextFibonacci(), is(new BigInteger("1")));
        assertThat(fib.nextFibonacci(), is(new BigInteger("1")));
        assertThat(fib.nextFibonacci(), is(new BigInteger("2")));
        assertThat(fib.nextFibonacci(), is(new BigInteger("3")));
        assertThat(fib.nextFibonacci(), is(new BigInteger("5")));
        assertThat(fib.nextFibonacci(), is(new BigInteger("8")));
        assertThat(fib.nextFibonacci(), is(new BigInteger("13")));
        assertThat(fib.nextFibonacci(), is(new BigInteger("21")));
        assertThat(fib.nextFibonacci(), is(new BigInteger("34")));
        assertThat(fib.nextFibonacci(), is(new BigInteger("55")));
        assertThat(fib.nextFibonacci(), is(new BigInteger("89")));
        assertThat(fib.nextFibonacci(), is(new BigInteger("144")));
        assertThat(fib.nextFibonacci(), is(new BigInteger("233")));
    }
}