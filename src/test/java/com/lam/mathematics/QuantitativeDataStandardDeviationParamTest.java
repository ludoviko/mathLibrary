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
public class QuantitativeDataStandardDeviationParamTest {
    private double epsilon = 0.000001;
    private double[] input;
    private double expected;

    public QuantitativeDataStandardDeviationParamTest(double[] input, double expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = " {index}: QuantitativeData Test Standard Deviation ( {0} ) = {1} ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new double[]{265, 280.7, 293, 279, 314.2, 300, 289}, 14.717822},
                {new double[]{7200, 7020, 7165.9, 7100, 7196, 7112, 7116.1}, 58.6296122},
                {new double[]{27, 20.3, 30.7, 40, 46, 36, 40, 33}, 7.652246},
                {new double[]{3607, 3600, 3600, 3631, 3600.6}, 11.93623},
                {new double[]{700, 700, 712, 736, 741, 716, 782}, 27.006424},
                {new double[]{3370, 3300.5, 3366, 3306.6, 3310, 3336, 3301.3}, 28.078003},
//                {new double[] {  }, },
        });
    }

    @Test(timeout = 3000)
    public void test() {
        QuantitativeData quantitativeData = new QuantitativeData(input);
        assertThat(quantitativeData.getStandardDeviation(), IsCloseTo.closeTo(expected, epsilon));
//        Assert.assertEquals(expected,  quantitativeData.getVariance(),  epsilon );
    }
}

