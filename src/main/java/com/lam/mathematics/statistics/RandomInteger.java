package com.lam.mathematics.statistics;

/**
 * Creater a random long integer from a to b, inclusive [a, b].
 */
public class RandomInteger {
    private long from;
    private long upTo;

    public RandomInteger(long from, long upTo) {
        if (from > upTo) {
            throw new RuntimeException("from-parameter must be less than upTo-parameter ");
        }
        this.from = from;
        this.upTo = upTo;
    }

    public static void main(String[] args) {
        RandomInteger randomInteger = new RandomInteger(7, 42);

        for (int i = 0; i < 100; i++) {
            System.out.println(randomInteger.next());
        }
    }

    public long getFrom() {
        return from;
    }

    public void setFrom(long from) {
        this.from = from;
    }

    public long getUpTo() {
        return upTo;
    }

    public void setUpTo(long upTo) {
        this.upTo = upTo;
    }

    /**
     * @return get next random long integer from the interval  [from, upTo].
     */
    public long next() {
        long next = (int) (Math.random() * (this.upTo + 1 - this.from)) + this.from;

        return next;
    }
}
