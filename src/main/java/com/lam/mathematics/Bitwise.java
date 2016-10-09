package com.lam.mathematics;

public class Bitwise {

	public static byte findBit(int n, int position) {
		// Position: Zero based, starting from right.
		byte i =  (byte) ((n >> position) & 1);
		return i;
	}

    public static void main(String[] s) {
        System.out.println(findBit(13, 0));
        System.out.println(findBit(13, 1));
        System.out.println(findBit(13, 2));
        System.out.println(findBit(13, 3));
        System.out.println(findBit(13, 4));
    }
}
