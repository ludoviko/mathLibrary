package com.lam.mathematics;

/**
 * Created by Usuario on 17/04/2017.
 *
 *  THE DIVISION ALGORITHM: Let 'a' be an integer and 'd' a positive integer. Then there
 *  are unique integers q and r, with 0 ≤ r < d, such that a = dq + r.
 *
 * a: is the dividend
 * q: quotient
 * r: remainder
 * d: divisor
 *
 * In other words:
 *
 *  Then there are unique integers
 *  quotient and remainder, with 0 ≤ remainder < divisor,
 *  such that:
 *  dividend = divisor. quotient + remainder .
 *
 *  From Discrete Mathematics, by Kenneth Rosen.
 *
 */
public class Division {
    private long quotient;
    private long remainder;
    private long dividend;
    private long divisor;

    public Division(long dividend, long divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    };

    public void calculate() {
        this.quotient = Math.floorDiv(dividend, divisor);
        this.remainder = Math.floorMod(dividend, divisor);
    }

    public long getRemainder() {
        return this.remainder;
    }

    public long getQuotient() {
        return this.quotient;
    }

    @Override
    public String toString() {
        return "Division{" +
                "quotient=" + quotient +
                ", remainder=" + remainder +
                ", dividend=" + dividend +
                ", divisor=" + divisor +
                '}';
    }

    public static void main(String[] args) {
        Division division = new Division(-1, 11);
        division.calculate();
        System.out.println(division);
    }
 }
