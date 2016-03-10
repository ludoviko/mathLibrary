package com.lam.mathematics;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

/**
 * Created by UC187029 on 11/03/2016.
 */
public class FibonacciModuleTest {
    FibonacciModule fibonacciModule;

    @Before
    public void setUp() {
        fibonacciModule = new FibonacciModule(new BigInteger("2015"), 3);
    }

    @After
    public void tearDown()  {
        fibonacciModule = null;
    }

    @Test
    public void testAssertDataMatch() {
          Assert.assertThat("Should be the same.", fibonacciModule.find(), CoreMatchers.is(new BigInteger("1")));
    }
}
