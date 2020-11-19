/**
 * 
 */
package com.lam.mathematics;

import com.lam.annotation.Note;

import java.util.Arrays;


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

    	boolean[] isPrime = new boolean[this.upTo + 1];
    	Arrays.fill(isPrime, true);
    	
    	isPrime[0] = false;
    	isPrime[1] = false;
    	
//    	int root = (int)Math.sqrt(this.upTo);

		for (int i = 2; i <= this.upTo/i; i++) {
			if (isPrime[i]) {
				for (int j = i; j <= this.upTo/i; j++) {
					isPrime[i*j] = false;
				}
			}
		}

    	int len = 0;
    	for ( int i = 1; i < isPrime.length; i++) {
    		if ( isPrime[i] ) {
    			len++;
    		};
    	};
 
    	array = new long[len];
    	int k = 0;
    	for ( int i = 1; i < isPrime.length; i++) {
    		if ( isPrime[i] ) {
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
