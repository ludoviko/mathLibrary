package com.lam.mathematics.statistics;

/**
 * Calculating correlation coefficient r:
 * r({xi, yi}) = 1/(n-1) * Sum ((xi-x_mean)/SDx * (yi-y_mean)/SDy))
 * <p>
 * r({xi, yi}) = 1/(n-1) * Sum (Zxi * Zyi)
 * <p>
 * <p>
 * Where
 * Sdx: sample standard deviation for the set x.
 * Sdy: sample standard deviation for the set t.
 *
 * r lies in the interval [-1, 1] .
 * *
 * <p>
 * º
 */
public class CorrelatiionCoefficient {

    private double[] xData;
    private double[] yData;
    private double R;

    CorrelatiionCoefficient(double[] xData, double[] yData) {
        this.xData = xData;
        this.yData = yData;
        this.R = 0;
    }

    public void calculate() {
        QuantitativeData quantitativeDataX = new QuantitativeData(xData);
        QuantitativeData quantitativeDataY = new QuantitativeData(yData);

        System.out.println(quantitativeDataX);
        System.out.println(quantitativeDataY);

        for (int i = 0; i < this.xData.length; i++) {
            this.R += quantitativeDataX.z(xData[i]) * quantitativeDataY.z(yData[i]);
        }

        this.R = this.R / (xData.length - 1);
    }

    public static void main(String[] args) {
        CorrelatiionCoefficient cc = new CorrelatiionCoefficient(new double[]{1, 2, 2, 3}, new double[]{1, 2, 3, 6});

        cc.calculate();
        // 0.9449111825230679
        // 0.9449111825230679

        System.out.println(cc.R);
    }

}
