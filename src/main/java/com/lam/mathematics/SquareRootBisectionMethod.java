package com.lam.mathematics;

/**
 * Class for finding the square root of a number using the bisection method with a given precision.
 *
 * It can find the square root of any number between zero and n,
 *
 */
public class SquareRootBisectionMethod {
    public static final double POWER_10 = Math.pow(10, 15);
    public static final double PRECISION = 1.0 / POWER_10;

    public static double find(double n) {
        double up;

        if (n > 1) {
            up = n;
        } else {
            up = 1;
        }

        double down = 0;
        double midPoint = 0;

        while (Math.abs(midPoint * midPoint - n) >= PRECISION) {
            midPoint = (up + down)/2;

            if (midPoint * midPoint > n) {
                up = midPoint;
            } else {
                down = midPoint;
            }
        }

        return midPoint;
    }

    public static void main(String[] args) {
        System.out.println(find(0.25));
        System.out.println(find(0));
    }
}
