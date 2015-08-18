/**
 * 
 */
package com.lam.mathematics;


import java.math.BigInteger;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;

import com.lam.mathematics.Fibonacci;

/**
 * @author lazuajemolle
 *
 */
public class FibonacciTest extends TestCase {

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }
    
    public void testCalculation() {
    	/**
    	 *  	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 
    	 *  144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 
    	 *  17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040,
    	 *   1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169
    	 */

    	Assert.assertEquals( new BigInteger("0"), Fibonacci.calculate(0));
    	Assert.assertEquals( new BigInteger("1"), Fibonacci.calculate(1));
    	Assert.assertEquals( new BigInteger("1"), Fibonacci.calculate(2));
    	Assert.assertEquals( new BigInteger("2"), Fibonacci.calculate(3));
    	Assert.assertEquals( new BigInteger("3"), Fibonacci.calculate(4));
    	Assert.assertEquals( new BigInteger("5"), Fibonacci.calculate(5));
    	Assert.assertEquals( new BigInteger("8"), Fibonacci.calculate(6));
    	Assert.assertEquals( new BigInteger("13"), Fibonacci.calculate(7));
    	Assert.assertEquals( new BigInteger("21"), Fibonacci.calculate(8));
    	Assert.assertEquals( new BigInteger("34"), Fibonacci.calculate(9));
    	Assert.assertEquals( new BigInteger("55"), Fibonacci.calculate(10));
    	Assert.assertEquals( new BigInteger("89"), Fibonacci.calculate(11));
    };

    public void testCalculationPhi() {
    	/**
    	 *  	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 
    	 *  144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 
    	 *  17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040,
    	 *   1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169
    	 */

    	Assert.assertEquals( 0, Fibonacci.calculatePhi(0));
    	Assert.assertEquals( 1, Fibonacci.calculatePhi(1));
    	Assert.assertEquals( 1, Fibonacci.calculatePhi(2));
    	Assert.assertEquals( 2, Fibonacci.calculatePhi(3));
    	Assert.assertEquals( 3, Fibonacci.calculatePhi(4));
    	Assert.assertEquals( 5, Fibonacci.calculatePhi(5));
    	Assert.assertEquals( 8, Fibonacci.calculatePhi(6));
    	Assert.assertEquals( 13, Fibonacci.calculatePhi(7));
    	Assert.assertEquals( 21, Fibonacci.calculatePhi(8));
    	Assert.assertEquals( 34, Fibonacci.calculatePhi(9));
    	Assert.assertEquals( 55, Fibonacci.calculatePhi(10));
    	Assert.assertEquals( 89, Fibonacci.calculatePhi(11));
    };

}
