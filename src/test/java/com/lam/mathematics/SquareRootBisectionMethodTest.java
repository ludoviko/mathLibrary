package com.lam.mathematics;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import org.hamcrest.number.IsCloseTo;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


@RunWith(Parameterized.class)

public class SquareRootBisectionMethodTest {
    private double input;
    private double expected;

    public SquareRootBisectionMethodTest(double input, double expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = " {index}: SquareRootBisectionMethod( {0} ) = {1} ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 0},
                {0.25, 0.5},
                {1, 1.0},
                {4, 2.0},
                {9, 3.0},
                {16, 4.0},
                {25, 5},
                {100, 10.0},
                {49, 7.0}
        });
    }

    @Test(timeout = 3000)
    public void testConversion() {
        assertThat(SquareRootBisectionMethod.find(input),is(new IsCloseTo(expected, SquareRootBisectionMethod.PRECISION)));
    }
}
