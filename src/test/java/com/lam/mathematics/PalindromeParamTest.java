package com.lam.mathematics;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * PalindromeParamTest
 */

@RunWith(Parameterized.class)
public class PalindromeParamTest {

    private Integer[] input;
    private boolean expected;

    public PalindromeParamTest(Integer[] input, boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = " {index}: Palindrome ( {0} ) = {1} ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Integer[]{0}, Boolean.TRUE},
                {new Integer[]{1}, Boolean.TRUE},
                {new Integer[]{0, 1}, Boolean.FALSE},
                {new Integer[]{1, 0}, Boolean.FALSE},
                {new Integer[]{1, 2}, Boolean.FALSE},
                {new Integer[]{1, 2, 3}, Boolean.FALSE},
                {new Integer[]{1, 2, 3, 4}, Boolean.FALSE},
                {new Integer[]{1, 2, 3, 4, 5}, Boolean.FALSE},
                {new Integer[]{1, 2, 3, 4, 5, 6}, Boolean.FALSE},
                {new Integer[]{1, 2, 3, 4, 5, 6, 7}, Boolean.FALSE},
                {new Integer[]{1, 2, 3, 4, 5, 6, 7, 8}, Boolean.FALSE},
                {new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, Boolean.FALSE},
                {new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, Boolean.FALSE},
                {new Integer[]{1, 2}, Boolean.FALSE},

                {new Integer[]{1, 1}, Boolean.TRUE},
                {new Integer[]{1, 0, 1}, Boolean.TRUE},
                {new Integer[]{1, 2, 1}, Boolean.TRUE},
                {new Integer[]{1, 2, 3, 2, 1}, Boolean.TRUE},
                {new Integer[]{1, 2, 3, 4, 3, 2, 1}, Boolean.TRUE},
                {new Integer[]{1, 2, 3, 4, 5, 4, 3, 2, 1}, Boolean.TRUE},
                {new Integer[]{1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1}, Boolean.TRUE},
                {new Integer[]{1, 2, 3, 4, 5, 6, 7, 6, 5, 4, 3, 2, 1}, Boolean.TRUE},
                {new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 1}, Boolean.TRUE},
                {new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2, 1}, Boolean.TRUE},
                {new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, Boolean.TRUE},
                {new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 8, 7, 6, 5, 4, 3, 2, 1}, Boolean.TRUE},

        });
    }

    ;

    @Test(timeout = 3000)
    public void testIsPalindrome() {
        assertThat(Palindrome.isPalindrome(input), is(expected));
    }
}
