package com.lam.mathematics;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)

public class PisanoPeriodTest {
    private int input;
    private int expected;

    public PisanoPeriodTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = " {index}: PisanoPeriod({0}) = {1} ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                { 1, 1 },
                { 2, 3 },
                { 3, 8 },
                { 4, 6 },
                { 5, 20 },
                { 6, 24 },
                { 7, 16 },
                { 8, 12 },
                { 9, 24 },
                { 10, 60 },
                { 11, 10 },
                { 12, 24 }
         });
    }

    @Test(timeout = 3000)
    public void testPisanoPeriod()  {
        PisanoPeriod pisanoPeriod = new PisanoPeriod(input);
        assertThat(pisanoPeriod.findPeriod(), is(expected));
    }
}
