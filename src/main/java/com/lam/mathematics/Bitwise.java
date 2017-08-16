package com.lam.mathematics;

public class Bitwise {

	public static byte findBit(int n, int position) {
		// Position: Zero based, starting from right.
		byte i =  (byte) ((n >> position) & 1);
		return i;
	}

    public static  int  countBits(int n) {
        // Position: Zero based, starting from right.
        int bits = 0;

        while (n != 0) {
            bits +=  n & 1;
            n = n >>> 1;
        }

        return bits;
    }

    public static void main(String[] s) {
        System.out.println(findBit(13, 0));
        System.out.println(findBit(13, 1));
        System.out.println(findBit(13, 2));
        System.out.println(findBit(13, 3));
        System.out.println(findBit(13, 4));
        System.out.println(countBits(13));
        System.out.println(countBits(31));
        System.out.println(countBits(-1));
    }
}
