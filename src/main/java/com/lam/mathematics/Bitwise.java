package com.lam.mathematics;

public class Bitwise {

	public static byte findBit(int n, int position) {
		// Position: Zero based.
		byte i =  (byte) ((n >> position) & 1);
		return i;
	}
}
