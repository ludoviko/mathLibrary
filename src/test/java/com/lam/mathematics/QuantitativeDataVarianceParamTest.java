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
public class QuantitativeDataVarianceParamTest {
    private double epsilon = 0.000001;
    private double[] input;
    private double expected;

    public QuantitativeDataVarianceParamTest(double[] input, double expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = " {index}: QuantitativeData Test Variance ( {0} ) = {1} ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new double[]{1, 2, 3, 4, 5, 6, 7, 9}, 6.234375},
                {new double[]{4, 50, 63, 2, 82, 99}, 1335.666666666666},
                {new double[]{3, 26, 5, 1, 1}, 90.56},
                {new double[]{22, 21, 13, 19, 16, 18}, 9.1388888},
                {new double[]{8, 11, 17, 7, 19}, 23.04},
                {new double[]{15, 17, 19, 21, 23, 25, 27, 29}, 21},
                {new double[]{0.25, 0.35, 0.45, 0.55, 0.26, 0.75}, 0.03079166},
                {new double[]{13, 14, 15, 16, 17, 18, 19, 20, 21}, 20.0 / 3},
//                {new double[] {  }, },
        });
    }

    ;

    @Test(timeout = 3000)
    public void tesVariance() {
        QuantitativeData quantitativeData = new QuantitativeData(input);
        assertThat(quantitativeData.getVariance(), IsCloseTo.closeTo(expected, epsilon));
//        Assert.assertEquals(expected,  quantitativeData.getVariance(),  epsilon );
    }
}

