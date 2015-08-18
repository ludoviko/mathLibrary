/**
 * 
 */
package com.lam.mathematics;

import java.util.Arrays;

import com.lam.annotation.Note;


/**
 * @author lazuajemolle
 *
 */

@Note(note="XXX: Use a map instead of a int[] array")
public class Primes {
    private int upTo;
    private long[] array;  

    public Primes() {
    }

    public long[] getArray() {
        return array;  
    } 

    public void find (int upTo) {
    	this.upTo= upTo;

    	boolean[] primesBool = new boolean[this.upTo + 1];
    	Arrays.fill(primesBool, true);
    	
    	primesBool[0] = false;
    	primesBool[1] = false;
    	
    	int root = (int)Math.sqrt(this.upTo);
    	
    	for (int i = 2; i <=root; i++) {
    		if (primesBool[i]) {
    			for (int j = i*i; j <=this.upTo; j+=i) {
    				primesBool[j] = false;
    			}
    		}
    	};
 
    	int len = 0;
    	for ( int i = 1; i < primesBool.length; i++) {
    		if ( primesBool[i] ) {
    			len++;
    		};
    	};
 
    	array = new long[len];
    	int k = 0;
    	for ( int i = 1; i < primesBool.length; i++) {
    		if ( primesBool[i] ) {
    			array[k++] = i;		
    		};
    	};
    };

    public static void main( String[] args ) {
    	Primes calculate = new Primes();
    	calculate.find(20);
    	long[] array = calculate.getArray();
    	int i = 1;
    	for ( long n : array ) {
          	System.out.println( i++ + " " + n + " ");    
    	}
    	// 10001 104743 
   }    
}
