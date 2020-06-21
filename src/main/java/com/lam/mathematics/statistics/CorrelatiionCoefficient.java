package com.lam.mathematics.statistics;

/**
 * Calculating correlation coefficient r:
 * r({xi, yi}) = 1/(n-1) * Sum ((xi-x_mean)/SDx * (yi-y_mean)/SDy))
 * <p>
 * r({xi, yi}) = 1/(n-1) * Sum (Zxi * Zyi)
 * <p>
 * <p>
 * Where
 * SDx: sample standard deviation for the set x.
 * SDy: sample standard deviation for the set y.
 *
 * r lies in the interval [-1, 1] .
 *
 * Strong positive linear relationships have values of r closer to 1.
 * Strong negative linear relationships have values of r closer to -1.
 * Weaker relationships have values of r closer to 000.
 *
 *   Equation of a regression line
 *   y = mx + b
 *   m = R SDy/SDy
 *
 * <p>
 * º
 */
public class CorrelatiionCoefficient {

    private double[] xData;
    private double[] yData;
    private double R;
    // Equation of a regression line
    // y = mx + b
    private double m;
    private double b;

    QuantitativeData quantitativeDataX;
    QuantitativeData quantitativeDataY;

    CorrelatiionCoefficient(double[] xData, double[] yData) {
        this.xData = xData;
        this.yData = yData;
        this.R = 0;
        quantitativeDataX = new QuantitativeData(xData);
        quantitativeDataY = new QuantitativeData(yData);
        System.out.println(quantitativeDataX);
        System.out.println(quantitativeDataY);
    }

    public void calculate() {
        for (int i = 0; i < this.xData.length; i++) {
            this.R += quantitativeDataX.z(xData[i]) * quantitativeDataY.z(yData[i]);
        }

        this.R = this.R / (xData.length - 1);

        this.m = this.R * this.quantitativeDataY.getUnbiasedDeviation() / this.quantitativeDataX.getUnbiasedDeviation();

        // mean of X and mean of y are points of the regression line.
        this.b = this.quantitativeDataY.getMean() - this.quantitativeDataX.getMean() * this.m;
    }


    /**
     * @param x value
     * @return y prediction based on regression line.
     */
    public double prediction(double x) {
        // y = mx + b
        return this.m * x + this.b;
    }

    @Override
    public String toString() {
        return "CorrelatiionCoefficient{" +
                "R=" + R +
                ", m=" + m +
                ", b=" + b +
                " y = mx + b = " + this.m + "x " + this.b + '}';
    }

    public static void main(String[] args) {
        CorrelatiionCoefficient cc = new CorrelatiionCoefficient(new double[]{1, 2, 2, 3}, new double[]{1, 2, 3, 6});

        cc.calculate();
        // 0.9449111825230679
        // 0.9449111825230679

        System.out.println(cc);
    }

}
