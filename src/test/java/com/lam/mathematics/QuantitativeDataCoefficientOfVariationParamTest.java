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
public class QuantitativeDataCoefficientOfVariationParamTest {
    private double epsilon = 0.001;
    private double[] input;
    private double expected;

    public QuantitativeDataCoefficientOfVariationParamTest(double[] input, double expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = " {index}: Coefficient of variation  Test ( {0} ) = {1} ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new double[]{275, 280.7, 283, 279, 284.2, 280, 282}, 0.9987153},
                {new double[]{7100.5, 7080, 7065.9, 7100, 7096, 7112, 7116.1}, 0.23},
                {new double[]{37, 35.3, 32.7, 34, 36, 36.2, 33.3, 33.8}, 4.164},
                {new double[]{3607, 3600, 3604, 3631, 3606}, 0.303},
                {new double[]{702, 704, 712, 716, 721, 716, 722}, 1.012},
                {new double[]{3370, 3300.5, 3366, 3306.6, 3310, 3336, 3301.3}, 0.8438},
                {new double[]{34.4, 34, 34.7, 34.6, 34, 34.1, 31, 31.3}, 4.1412},
                {new double[]{989.22, 990.6, 992, 996.9, 981.1, 986, 985}, 0.4846},
                {new double[]{10.2, 16.34, 10.33, 10.63, 10.2, 10.44, 16.36, 10.46}, 21.8189},
                {new double[]{3240, 3260, 3250, 3280, 3280, 3300, 3310, 3270}, 0.6819},
//                {new double[] {  }, },
        });
    }

    @Test(timeout = 3000)
    public void test() {
        QuantitativeData quantitativeData = new QuantitativeData(input);
        assertThat(quantitativeData.getCoefficientOfvariation(), IsCloseTo.closeTo(expected, epsilon));
    }

}

