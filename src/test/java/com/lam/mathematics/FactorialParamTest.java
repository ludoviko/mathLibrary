package com.lam.mathematics;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class FactorialParamTest {

    private int input;
    private BigInteger expected;

    public  FactorialParamTest(int input, BigInteger expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = " {index}: Factorial( {0} ) = {1} ")
    public static Collection<Object[]> data() {
        return Arrays.asList( new Object[][] {
                {new Integer(0), new BigInteger("1")},
                {new Integer(1), new BigInteger("1")},
                {new Integer(2), new BigInteger("2")},
                {new Integer(3), new BigInteger("6")},
                {new Integer(4), new BigInteger("24")},
                {new Integer(5), new BigInteger("120")},
                {new Integer(6), new BigInteger("720")},
                {new Integer(7), new BigInteger("5040")},
                {new Integer(8), new BigInteger("40320")},
                {new Integer(9), new BigInteger("362880")},
                {new Integer(10), new BigInteger("3628800")},
//                {new Integer(), new BigInteger("")}
        });
    };

    @Test(timeout=3000)
    public void testFactorial() {
        assertThat(Combinatorics.factorialBI(input), is(expected));
    }
}
