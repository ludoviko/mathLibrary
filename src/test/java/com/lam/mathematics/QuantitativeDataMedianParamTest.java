package com.lam.mathematics;

import com.lam.mathematics.statistics.QuantitativeData;
import org.hamcrest.number.IsCloseTo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class QuantitativeDataMedianParamTest {
    private double epsilon = 0.000001;
    private double[] input;
    private double expected;

    public QuantitativeDataMedianParamTest(double[] input, double expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = " {index}: QuantitativeData Median Test ( {0} ) = {1} ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new double[]{326, 314, 325, 315,
                        315, 307, 318, 318, 320, 312, 325, 321, 322,
                        320, 312, 325, 326, 325}, 320},
                {new double[]{35, 37, 28, 42, 32, 42, 35, 45, 28, 43,
                        37, 43, 27, 41, 27, 45, 31, 42, 28, 45}, 37},
                {new double[]{123, 167, 150, 132, 152, 128, 129, 160, 140, 121}, 136},
                {new double[]{2120, 3040, 2180, 1892, 923, 9231, 8231}, 2180},
                {new double[]{1, 23, 41, 23, 61, 130, 210, 109, 592, 203, 12}, 61},
                {new double[]{23.43, 32.52, 23.92, 32.25, 23.43, 29.55, 28.30, 31.54}, 28.925},
                {new double[]{1.0 / 2, 4d / 9, 3d / 7, 2d / 5, 21d / 23, 16d / 27, 2d / 4}, 0.5},
                {new double[]{0.57, 23d / 100, 0.05, 17d / 100, 52d / 100, 0.42, 0.44, 45d / 100}, 0.43},
//                {new double[] {  }, },
        });
    }

    @Test(timeout = 3000)
    public void test() {
        QuantitativeData quantitativeData = new QuantitativeData(input);
        assertThat(quantitativeData.getMedian(), IsCloseTo.closeTo(expected, epsilon));
    }
}

