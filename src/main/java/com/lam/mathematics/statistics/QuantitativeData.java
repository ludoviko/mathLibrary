package com.lam.mathematics.statistics;

import java.util.*;

/**
 * Created by Usuario on 07/07/2017.
 */
public class QuantitativeData {
    public static final double MILD_FACTOR_OUTLIER = 1.5;
    public static final double EXTREME_FACTOR_OUTLIER = 3;
    private double[] data;
    private double median;
    private double meanAbsoluteDeviation;
    private double mean;
    private double variance;
    private double sampleVariance;
    private double standardDeviation;
    private double unbiasedDeviation;
    private double firstQuartile;
    private double thirdQuartile;
    private double sumDeviations;
    private double coefficientOfvariation;
    private Map<Double, Integer> mode;

    public QuantitativeData(Map<Double, Integer> histogram) {
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
        this.meanAbsoluteDeviation();
        this.median = median(this.data);
        this.firstQuartile = firstQuartile(this.data);
        this.thirdQuartile = thirdQuartile(this.data);
        this.mode();
        this.coefficientOfVariation();
    }

    /**
     * A commonly used rule says that a data point is an outlier if it is more than 1.5 * IQR above the third quartile
     * or below the first quartile. Said differently, low outliers are below Q1-1.5 * IQR
     * ​and high outliers are above Q1-1.5 * IQR
     */
    public List<Double> findLowOutliers() {
        List<Double> oultiers = new ArrayList<Double>();

        for (double element : data) {
            if (element < this.firstQuartile - 1.5 * this.getInterQuartileRange()) {
                oultiers.add(element);
            }
        }
        return oultiers;
    }

    /**
     * A commonly used rule says that a data point is an outlier if it is more than 1.5 * IQR above the third quartile
     * or below the first quartile. Said differently, low outliers are below Q1-1.5 * IQR
     * ​and high outliers are above Q1-1.5 * IQR
     * ​
     */
    public List<Double> findHighOutliers() {
        List<Double> oultiers = new ArrayList<Double>();

        for (double element : data) {
            if (element > this.thirdQuartile + 1.5 * this.getInterQuartileRange()) {
                oultiers.add(element);
            }
        }
        return oultiers;
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

    public double getCoefficientOfvariation() {
        return coefficientOfvariation;
    }

    public double getMeanAbsoluteDeviation() {
        return this.meanAbsoluteDeviation;
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

        for (double each : this.data) {
            this.sumDeviations += (mean - each) * (mean - each);
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

    private void mode() {
        this.mode = new HashMap<Double, Integer>();
        Map<Double, Integer> auxMap = new HashMap<Double, Integer>();

        for (double element : this.data) {
            auxMap.put(element, auxMap.getOrDefault(element, 0) + 1);
        }

        Set<Map.Entry<Double, Integer>> entries = auxMap.entrySet();

        Collection<Integer> values = auxMap.values();
        Integer max = 1;
        for (Integer value : values) {
            if (value > max) {
                max = value;
            }
        }

        if (max > 1) {
            for (Map.Entry<Double, Integer> entry : entries) {
                if (entry.getValue() == max) {
                    this.mode.put(entry.getKey(), max);
                }
            }
        } else {
        }
    }

    public Map<Double, Integer> getMode() {
        return mode;
    }

    /**
     * By finding the square root of the variance (the standard deviation),
     * and dividing the standard deviation by the mean,
     * you can find the coefficient of variation.
     * Comparing the coefficients of variation allows you to directly compare the
     * data clustering of each set, since a higher CV% means the data is more spread out.
     */
    private void coefficientOfVariation() {
        this.coefficientOfvariation = (100 * this.standardDeviation) / this.getMean();
    }

    public void meanAbsoluteDeviation() {
        this.meanAbsoluteDeviation = 0;

        for (double each : this.data) {
            this.meanAbsoluteDeviation += Math.abs(mean - each);
        }

        this.meanAbsoluteDeviation = this.meanAbsoluteDeviation / this.data.length;
    }


    @Override
    public String toString() {
        return "QuantitativeData{" +
                "data=" + Arrays.toString(data) +
                ", median=" + median +
                ", mean=" + mean +
                ", variance=" + variance +
                ", sampleVariance=" + sampleVariance +
                ", standardDeviation=" + standardDeviation +
                ", unbiasedDeviation=" + unbiasedDeviation +
                ", meanAbsoluteDeviation=" + meanAbsoluteDeviation +
                ", firstQuartile=" + firstQuartile +
                ", thirdQuartile=" + thirdQuartile +
                ", inter quartile range=" + this.getInterQuartileRange() +
                ", sumDeviations=" + sumDeviations +
                ", coefficientOfvariation=" + coefficientOfvariation +
                ", mode=" + mode +
                '}';
    }

    public static void main(String[] args) {
        Map<Double, Integer> map = new HashMap<Double, Integer>();

        map.put(60d, 35);
        map.put(61d, 33);
        map.put(62d, 45);
        map.put(63d, 4);
        map.put(64d, 3);
        map.put(65d, 4);
        map.put(66d, 7);
        map.put(67d, 4);

//        QuantitativeData quantitativeData = new QuantitativeData(map);

        double[] data = new double[]{5, 4, 6, 39};

        QuantitativeData quantitativeData = new QuantitativeData(data);

        System.out.println("data: " + quantitativeData);
        System.out.println("Low outliers: " + quantitativeData.findLowOutliers());
        System.out.println("High outliers: " + quantitativeData.findHighOutliers());
    }

}


