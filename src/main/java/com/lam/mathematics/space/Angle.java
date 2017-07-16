package com.lam.mathematics.space;

import com.lam.mathematics.Division;

import java.math.BigDecimal;

/**
 * Class to model an angle in radians.
 *
 * The values saved are not greater than 2 pi.
 *
 */
public class Angle {
    private double value;

    public Angle(double value) {
        this.value = value;
        if (Math.abs(this.value) >= 2 * Math.PI) {
            this.value = this.value - 2 * Math.PI * Math.floor(this.value / (2 * Math.PI));
        }
    }

    public double getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Angle{" +
                "value=" + value +
                '}';
    }
// assertEquals(double expected, double actual, double epsilon)
    public static void main(String[] args) {
        Angle a = new Angle(4 * Math.PI + Math.PI/4 );
        System.out.println(a);
    }
}
