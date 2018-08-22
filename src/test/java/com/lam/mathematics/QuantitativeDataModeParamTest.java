package com.lam.mathematics;

import com.lam.mathematics.statistics.QuantitativeData;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class QuantitativeDataModeParamTest {
    private double epsilon = 0.000001;
    private double[] input;
    private double expected;

    public QuantitativeDataModeParamTest(double[] input, double expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = " {index}: QuantitativeData Mode Test ( {0} ) = {1} ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new double[]{326, 314, 325, 315,
                        315, 307, 318, 318, 320, 312, 325, 321, 312,
                        320, 312, 325, 326, 325}, 325},
                {new double[]{35, 37, 28, 42, 32, 42, 35, 45, 28, 43,
                        37, 43, 27, 41, 27, 45, 31, 42, 28, 45}, 28},
                {new double[]{35, 37, 28, 42, 32, 42, 35, 45, 28, 43,
                        37, 43, 27, 41, 27, 45, 31, 42, 28, 45}, 42},
                {new double[]{35, 37, 28, 42, 32, 42, 35, 45, 28, 43,
                        37, 43, 27, 41, 27, 45, 31, 42, 28, 45}, 45},
                {new double[]{123, 167, 150, 167, 152, 128, 129, 150, 140, 121}, 150},
                {new double[]{123, 167, 150, 167, 152, 128, 129, 150, 140, 121}, 167},
                {new double[]{12, 23, 41, 23, 61, 130, 210, 130, 592, 130, 12}, 130},
                {new double[]{23.43, 32.52, 23.92, 32.25, 23.43, 29.55, 28.30, 23.34}, 23.43},
                {new double[]{1.0 / 2, 4d / 9, 3d / 7, 2d / 5, 21d / 23, 16d / 27, 2d / 4}, 0.5},
                {new double[]{0.57, 23d / 100, 0.44, 17d / 100, 52d / 100, 0.23, 0.44, 45d / 100}, 0.23},
                {new double[]{0.57, 23d / 100, 0.44, 17d / 100, 52d / 100, 0.23, 0.44, 45d / 100}, 0.44},
                {new double[]{12, 1.2, 0.012, 102, 120, 0.012, 0.12, 1.2}, 1.2},
                {new double[]{12, 1.2, 0.012, 102, 120, 0.012, 0.12, 1.2}, 0.012},
//                {new double[] {  }, },
        });
    }

    @Test(timeout = 3000)
    public void test() {
        QuantitativeData quantitativeData = new QuantitativeData(input);
        Assert.assertTrue(quantitativeData.getMode().containsKey(expected));
    }

    @Test(timeout = 3000)
    public void testEmptyMap() {
        QuantitativeData quantitativeData = new QuantitativeData(2120, 3040, 2180, 1892, 923, 9231, 8231);
        Assert.assertTrue(quantitativeData.getMode().isEmpty());
    }
}

