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
public class QuantitativeDataSampleVarianceParamTest {
    private double epsilon = 0.000001;
    private double[] input;
    private double expected;

    public QuantitativeDataSampleVarianceParamTest(double[] input, double expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = " {index}: QuantitativeData Test Sample Variance ( {0} ) = {1} ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new double[]{8, 13, 5, 10}, 11.3333333},
                {new double[]{4, 3, 5, 15, 5}, 23.8},
                {new double[]{1, 2, 5, 1}, 3.583333},
                {new double[]{10, 6, 3, 4}, 9.583333},
                {new double[]{15, 17, 19, 21, 23, 25, 27, 29}, 24},
//                {new double[] {  }, },
        });
    }

    ;

    @Test(timeout = 3000)
    public void tesSampleVariance() {
        QuantitativeData quantitativeData = new QuantitativeData(input);
        assertThat(quantitativeData.getSampleVariance(), IsCloseTo.closeTo(expected, epsilon));
    }
}

