package com.lam.mathematics;


import java.util.Arrays;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.Test;

import com.lam.mathematics.array.ArrayUtil;

public class ArrayUtilTest extends TestCase {
	
	@Test
    public void testGreatest() {
    	Assert.assertEquals(9, ArrayUtil.findGreatest(new int[] {8,9,7}));
    	Assert.assertEquals(9, ArrayUtil.findGreatest(new int[] {9}));
    	Assert.assertEquals(9, ArrayUtil.findGreatest(new int[] {8,8,9,8,9,9}));
    }; 	

	@Test
    public void testAbsGreatest() {
    	Assert.assertEquals(9, ArrayUtil.findAbsGreatest(new int[] {-8,-9,-7}));
    	Assert.assertEquals(9, ArrayUtil.findAbsGreatest(new int[] {-9}));
    	Assert.assertEquals(9, ArrayUtil.findAbsGreatest(new int[] {-8,-8,-9,-8,-9,-9}));
    }; 	

    
	@Test
    public void testGreatestAbsoluteByIndex() {
    	Assert.assertEquals(5, ArrayUtil.findGreatestAbsoluteValueByIndex(new int[] {-2,-3,-5,-8, -13, -33} ));
    	Assert.assertEquals(4, ArrayUtil.findGreatestAbsoluteValueByIndex(new int[] {-2,-3,-5,-8, 97, -13, -33, 9}));
    }; 	

	@Test
    public void testPrefixArray() {
		int[] prefix = ArrayUtil.findPrefixSum(new int[] {1,2,3,4,5});
		int[] expected = {0, 1, 3, 6, 10, 15};

		Assert.assertTrue(Arrays.equals(expected, prefix));
    }; 	

    @Test
    public void testPrefixArrayOverload() {
		int[] prefix = ArrayUtil.findPrefixSum(new int[] {1,2,3,4,5}, 2, 3);
		int[] expected = {0, 3, 7};

		Assert.assertTrue(Arrays.equals(expected, prefix));
    }; 	

    @Test
    public void testPrefixArrayByValue() {
		int[] prefix = ArrayUtil.findPrefixSum(2, new int[] {1,2,3,4,5,2,1,2});
		int[] expected = {0,0,1,1,1,1,2,2,3};

		Assert.assertTrue(Arrays.equals(expected, prefix));
    }; 	

    @Test
    public void testFindHistogram() {
		int[] expected = {0, 4, 1, 1,1,1,0,1,1,1,1,4,0,0,0,0,0};
		int[] history = ArrayUtil.findHistogram(new int[] 
				{ 1, 1, 2, 1, 7, 8, 9, 1, 11, 5, 4, 11, 11, 11, 3, 10});
		Assert.assertTrue(Arrays.equals(expected, history));
    }; 	   

    @Test
    public void testFindHistogramOneElement() {
		int[] expected = {0, 0,0,0,0,1};
		int[] history = ArrayUtil.findHistogram(new int[] { 5 });
		Assert.assertTrue(Arrays.equals(expected, history));
    }; 	   @Test
 
    
    public void testFindHistogramAbs() {
		int[] expected = {0, 4, 1, 1,1,1,0,1,1,1,1,4,0,0,0,0,0};
		int[] history = ArrayUtil.findHistogramAbsoluteValue(new int[] 
				{ 1, -1, 2, 1, 7, 8, 9, 1, 11, 5, 4, -11, -11, -11, 3, -10});
		Assert.assertTrue(Arrays.equals(expected, history));
    }; 	

    
    @Test
    public void testFindAbsCountDistictValues() {
		int[] expected = {0,1,1,1,0,0,0,0,0,0,0,0,0};
		int[] history = ArrayUtil.findAbsDistinctCountValues(-1,1,1,2,3,2,-2,2,3,-3,3,1); 
		Assert.assertTrue(Arrays.equals(expected, history));
    }; 	
 

    @Test
    public void testFindDistinctCountValues() {
		int[] expected = {0,1,1,1,0,0,0,0,0,0,0,0,0};
		int[] history = ArrayUtil.findDistinctCountValues(1,1,1,2,3,2,2,2,3,3,3,1); 
		Assert.assertTrue(Arrays.equals(expected, history));
    }; 	
   
    
    @Test
    public void testEmpty() {
    	try {
    		Assert.assertEquals(9, ArrayUtil.findGreatest(new int[] {}));
    		Assert.fail("El metodo tiene que lanzar una excepcion");
		} catch (RuntimeException e) {
			Assert.assertTrue(true);
		};
    };
    
    
}
