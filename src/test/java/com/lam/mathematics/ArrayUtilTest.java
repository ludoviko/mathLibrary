package com.lam.mathematics;


import com.lam.mathematics.array.ArrayUtil;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

public class ArrayUtilTest extends TestCase {
	
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

}
