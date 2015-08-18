package com.lam.mathematics;

import junit.framework.TestCase;

public class CheckIsPrimeTest extends TestCase {

    @Override
	protected void setUp() throws Exception {
        super.setUp();
    }

    /**
     * @throws java.lang.Exception
     */
    @Override
	protected void tearDown() throws Exception {
        super.tearDown();
    };
	

    public void testCheckIsRunTimeException() {
    	try {
    	  CheckIsPrimeTest.assertTrue(CheckIsPrime.go(0));
    	  CheckIsPrimeTest.fail("Failed to throw IllegalArgumentException");
    	} catch (IllegalArgumentException IE) {
    	};
     	try {
      	  CheckIsPrimeTest.assertTrue(CheckIsPrime.go(-10));
      	  CheckIsPrimeTest.fail("Failed to throw IllegalArgumentException");
      	} catch (IllegalArgumentException IE) {
      	};
      };
    
    public void testCheckIsPrimeTrue() {
    	CheckIsPrimeTest.assertTrue(CheckIsPrime.go(2));
    	CheckIsPrimeTest.assertTrue(CheckIsPrime.go(3));
    	CheckIsPrimeTest.assertTrue(CheckIsPrime.go(5));
    	CheckIsPrimeTest.assertTrue(CheckIsPrime.go(7));
    	CheckIsPrimeTest.assertTrue(CheckIsPrime.go(29));
    	CheckIsPrimeTest.assertTrue(CheckIsPrime.go(104743));
    	CheckIsPrimeTest.assertTrue(CheckIsPrime.go(1963459));
    	CheckIsPrimeTest.assertTrue(CheckIsPrime.go(1998181));
    };
	
    public void testIsPrimeFalse() {
    	CheckIsPrimeTest.assertFalse(CheckIsPrime.go(1));
    	CheckIsPrimeTest.assertFalse(CheckIsPrime.go(4));
    	CheckIsPrimeTest.assertFalse(CheckIsPrime.go(25));
    	CheckIsPrimeTest.assertFalse(CheckIsPrime.go(81));
    };
    
    
}
