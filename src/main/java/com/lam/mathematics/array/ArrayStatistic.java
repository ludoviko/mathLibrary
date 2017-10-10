package com.lam.mathematics.array;

/**
 * Created by Usuario on 05/09/2017.
 */
public class ArrayStatistic {
    public static double arithmeticMean(double... array) {
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }


    public static double standardDeviation(double... array) {
        double mean = arithmeticMean(array);

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += (mean - array[i])*(mean - array[i]);
        }

        sum = sum / array.length;
        return Math.sqrt(sum);
    }

    public static void main(String[]  args) {
        double[] data = {35, 50, 50, 50, 56, 60, 60, 75, 250};
        System.out.println(standardDeviation(data));
    }

}
