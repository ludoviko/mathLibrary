package com.lam.mathematics.statistics;

/**
 * Sampling without replacement.
 * <p>
 * Source Computer Science by  Robert Sedgewick.
 */
public class SamplingWithoutReplacement {
    private final int sampleSize;
    private final int[] permutations;

    public SamplingWithoutReplacement(int sampleSize, int range) {
        this.sampleSize = sampleSize;
        this.permutations = new int[range];

        for (int i = 0; i < range; i++) {
            permutations[i] = i;
        }
    }

    /**
     * Do the rearrengements of the first positios up to sampleSize.
     */
    public void calculate() {
        for (int i = 0; i < this.sampleSize; i++) {
            int random = i + (int) (Math.random() * (this.permutations.length - i));
            int x = this.permutations[random];
            this.permutations[random] = this.permutations[i];
            this.permutations[i] = x;
        }
    }

    /**
     * This prints the sample of size sampleSize.
     */
    public void print() {
        for (int i = 0; i < this.sampleSize; i++) {
            System.out.print(this.permutations[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SamplingWithoutReplacement sample = new SamplingWithoutReplacement(6, 16);
        sample.calculate();
        sample.print();
    }
}
