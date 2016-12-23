package com.lam.mathematics;

import java.math.BigInteger;

public class Combinatorics {

    @Deprecated
    public static long factorial(long n) {
        long factorial = 1;
        if (n == 0 || n == 1) {
            return 1;
        }
        for (long i = n; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    public static BigInteger factorialBI(int n) {
        assert n >= 0;

        BigInteger[] table = new BigInteger[(int) (n + 1)];

        table[0] = BigInteger.ONE;
        if (n > 0) {
            table[1] = BigInteger.ONE;
        }

        for (int i = 2; i <= n; i++) {
            table[i] = new BigInteger(i + "").multiply(table[i-1]);
        }

        return table[n];
    }

    // Permutations are arrangements.
    public static long permutations(int n, int m) {
        checkArgument(n, m);

        long factorial = 1;
        for (long i = n; i > n - m; i--) {
            factorial *= i;
        }
        return factorial;
    }

    public static BigInteger permutationsBI(int n, int m) {
        checkArgument(n, m);

        BigInteger big = new BigInteger("1");

        for (long i = n; i > n - m; i--) {
            big = big.multiply(new BigInteger(i + ""));
        }
        return big;
    }

    //	n! / (r!(n−r)!)
    public static long combinations(int n, int m) {
        checkArgument(n, m);

        long permutation = permutations(n, m);
        long factorial_m = factorial(m);

        return permutation / factorial_m;
    }

    public static BigInteger combinationsBI(int n, int m) {
        checkArgument(n, m);

        BigInteger permutation = permutationsBI(n, m);
        BigInteger factorial_m = factorialBI(m);

        return permutation.divide(factorial_m);
    }

    private static void checkArgument(int n, int m) {
        if (n < 0 || m < 0 || n - m < 0) {
            throw new IllegalArgumentException("n and m must be greater than 0 and n >= m. ");
        }
    }

    private static void checkArgumentZero(int n, int m) {
        if (n <= 0 || m <= 0 || n - m < 0) {
            throw new IllegalArgumentException("n and m must be greater than 0 and n >= m. ");
        }
    }

}
