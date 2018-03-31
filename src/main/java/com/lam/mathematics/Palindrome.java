package com.lam.mathematics;

/**
 * Palindrome for integers.
 */
public class Palindrome {

    public static boolean isPalindrome(char[] array) {
        boolean result = true;

        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] == array[array.length - 1 - i]) {
            } else {
                result = false;
                break;
            }
        }

        return result;
    }

    public static boolean isPalindrome(Integer[] array) {
        boolean result = true;

        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] == array[array.length - 1 - i]) {
            } else {
                result = false;
                break;
            }
        }

        return result;
    }
}
