package com.lam.mathematics;


public class MorthThue {
    public MorthThue() {
    }

    // Replacing each 0 by 01 and each 1 by 10;
    public static String find(int n) {
        StringBuilder sequence = new StringBuilder();
        sequence.append("0");
        StringBuilder aux = new StringBuilder();

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < sequence.length(); j++) {
                if (sequence.charAt(j) == '0') {
                    aux.append("01");
                } else {
                    aux.append("10");
                }
            }
            sequence.append(aux);
            aux = new StringBuilder();
        }

        return sequence.toString();
    }


    // Using binary complement.
    public static String find2(int n) {
        StringBuilder sequence = new StringBuilder();
        sequence.append("0");

        StringBuilder complement = new StringBuilder();

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < sequence.length(); j++) {
                if (sequence.charAt(j) == '0') {
                    complement.append("1");
                } else {
                    complement.append("0");
                }
            }
            sequence.append(complement);
            complement = new StringBuilder();
        }

        return sequence.toString();
    }


    // Using the complement of the sum of the binary digits of the whole numbers from 0 to n-1 term.
    public static String find3(int n) {
        StringBuilder sequence = new StringBuilder();

        int upTo = (int) Math.pow(2, n - 1);

        for (int i = 0; i < upTo; i++) {
            sequence.append(findSumDigitsInBase2(i) % 2);
        }

        return sequence.toString();
    }

    private static int findSumDigitsInBase2(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 2;
            n /= 2;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(MorthThue.find(1));
        System.out.println(MorthThue.find(2));
        System.out.println(MorthThue.find(3));
        System.out.println(MorthThue.find(4));
        System.out.println(MorthThue.find(5));

        System.out.println(MorthThue.find2(1));
        System.out.println(MorthThue.find2(2));
        System.out.println(MorthThue.find2(3));
        System.out.println(MorthThue.find2(4));
        System.out.println(MorthThue.find2(5));

        System.out.println(MorthThue.find3(1));
        System.out.println(MorthThue.find3(2));
        System.out.println(MorthThue.find3(3));
        System.out.println(MorthThue.find3(4));
        System.out.println(MorthThue.find3(5));

        System.out.println(findSumDigitsInBase2(15));

        //        System.out.println(MorthThue.find(4));
    }

}

