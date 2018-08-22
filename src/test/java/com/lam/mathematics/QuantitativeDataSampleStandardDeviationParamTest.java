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
public class QuantitativeDataSampleStandardDeviationParamTest {
    private double epsilon = 0.000001;
    private double[] input;
    private double expected;

    public QuantitativeDataSampleStandardDeviationParamTest(double[] input, double expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = " {index}: QuantitativeData Test Standard Deviation ( {0} ) = {1} ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new double[]{34.4, 34, 34.7, 34.6, 34, 34.1, 31, 31.3}, 1.48366101},
                {new double[]{3240, 3260, 3250, 3280, 3280, 3300, 3310, 3270}, 23.8671920},
//                {new double[] {  }, },
        });
    }

    @Test(timeout = 3000)
    public void test() {
        QuantitativeData quantitativeData = new QuantitativeData(input);
        assertThat(quantitativeData.getUnbiasedDeviation(), IsCloseTo.closeTo(expected, epsilon));
//        Assert.assertEquals(expected,  quantitativeData.getVariance(),  epsilon );
    }
}

