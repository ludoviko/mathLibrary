package com.lam.mathematics.statistics;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/**
 * Created by Usuario on 07/07/2017.
 */
public class QuantitativeData {
    private double[] data;
    private double median;
    private double mean;
    private double variance;
    private double sampleVariance;
    private double standardDeviation;
    private double unbiasedDeviation;
    private double firstQuartile;
    private double thirdQuartile;
    private double sumDeviations;

    public QuantitativeData(Map<Double, Integer> histogram) throws NoSuchMethodException {
        this(toArray(histogram));
    }

    public QuantitativeData(double... data) {
        this.data = data;
        Arrays.sort(this.data);
        mean();
        this.sumDeviations();
        this.variance();
        this.standardDeviation();
        this.sampleVariance();
        this.unbiasedDeviation();
        this.median = median(this.data);
        this.firstQuartile = firstQuartile(this.data);
        this.thirdQuartile = thirdQuartile(this.data);
    }

    private static double[] toArray(Map<Double, Integer> histogram) {
        Set<Double> keys = histogram.keySet();

        int size = 0;
        for (Double key : keys) {
            size += histogram.get(key);
        }

        double[] array = new double[size];

        int index = 0;
        for (Double key : keys) {
            int frequency = histogram.get(key);
            for (int i = 0; i < frequency; i++) {
                array[index++] = key;
            }
        }

        return array;
    }

    private static double median(double... a) {
        if (a.length % 2 == 1) {
            //It's the middle element.
            return a[a.length / 2];
        } else {
            //It's the mean of the two middle elements.
            return (a[a.length / 2] + a[a.length / 2 - 1]) / 2;
        }
    }

    private static double firstQuartile(double... a) {
        double[] firstHalf = new double[a.length / 2];
        System.arraycopy(a, 0, firstHalf, 0, a.length / 2);
        return median(firstHalf);
    }

    private static double thirdQuartile(double... a) {
        double[] secondHalf = new double[a.length / 2];
        System.arraycopy(a, (a.length + 1) / 2, secondHalf, 0, a.length / 2);
        return median(secondHalf);
    }

    private static void main(String[] args) {
        double[] data = new double[]{2, 3, 3, 4, 4, 4, 4, 5, 5, 6, 7};

        QuantitativeData quantitativeData = new QuantitativeData(data);

        System.out.println("data: " + quantitativeData);
    }

    @Override
    public String toString() {
        return "QuantitativeData{" +
                "data=" + Arrays.toString(data) +
                ", mean=" + mean +
                ", median=" + median +
                ", variance=" + variance +
                ", sampleVariance=" + sampleVariance +
                ", standardDeviation=" + standardDeviation +
                ", unbiasedDeviation=" + unbiasedDeviation +
                ", median=" + median +
                ", firstQuartile=" + firstQuartile +
                ", thirdQuartile=" + thirdQuartile +
                '}';
    }

    public double[] getData() {
        return data;
    }

    public double getMedian() {
        return median;
    }

    public double getMean() {
        return mean;
    }

    public double getFirstQuartile() {
        return firstQuartile;
    }

    public double getThirdQuartile() {
        return thirdQuartile;
    }

    public double getVariance() {
        return variance;
    }

    public double getSampleVariance() {
        return sampleVariance;
    }

    public double getStandardDeviation() {
        return standardDeviation;
    }

    public double getUnbiasedDeviation() {
        return unbiasedDeviation;
    }

    public double getInterQuartileRange() {
        return this.thirdQuartile - this.firstQuartile;
    }

    private void mean() {
        double s = 0;
        for (double i : data) {
            s += i;
        }
        this.mean = s / data.length;
    }

    private void sumDeviations() {
        this.sumDeviations = 0;

        for (double i : this.data) {
            this.sumDeviations += (mean - i) * (mean - i);
        }
    }

    private void variance() {
        this.variance = this.sumDeviations / data.length;
    }

    private void sampleVariance() {
        this.sampleVariance = this.sumDeviations / (data.length - 1);
    }

    // Population standard deviation.
    private void standardDeviation() {
        standardDeviation = Math.sqrt(this.variance);
    }

    // Sample standard deviation.
    private void unbiasedDeviation() {
        unbiasedDeviation = Math.sqrt(sampleVariance);
    }
}


