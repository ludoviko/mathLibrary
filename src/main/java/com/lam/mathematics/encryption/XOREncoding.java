package com.lam.mathematics.encryption;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class XOREncoding {
	private String password;
	private String pathToDataIn;
	private String pathToDataOut;

	public XOREncoding(String password, String pathToDataIn,
			String pathToDataOut) {
		this.password = password;
		this.pathToDataIn = pathToDataIn;
		this.pathToDataOut = pathToDataOut;
	}

	public StringBuilder encode() {
		int character;
		StringBuilder builder = new StringBuilder();
		int j = 0;

		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(
					new FileWriter(this.pathToDataOut)));

			BufferedReader reader = new BufferedReader(new FileReader(
					pathToDataIn));

			while ((character = reader.read()) != -1) {
				builder.append( (char) ( (char) character ^ password.charAt(j)));
				out.print((char) ( (char) character ^ password.charAt(j)));
//				System.out.print((char) ( (char) character ^ password.charAt(j)));
				j++;
				if (j == password.length()) {
					j = 0;
				}
			}

			out.close();
			reader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return builder;
	}

	public StringBuilder decode() {
		return this.encode();
	}
	
	public static void main(String[] args) {
		String pensamiento = "";
//        XOREncoding encoding = new XOREncoding(pensamiento, 
//        		"c:/eclipse/workspace/AlgorithmsAndCoding/source/com/lam/coder/usaco/logIn/usacoUser", 
//        		"c:/eclipse/workspace/MathLibrary/src/com/lam/mathematics/dataOut/usacoUser.xyz");
//        encoding.encode();

//        XOREncoding encoding = new XOREncoding(pensamiento, 
//        		"c:/eclipse/workspace/MathLibrary/src/com/lam/mathematics/dataOut/usacoUser.xyz", 
//        		"c:/eclipse/workspace/MathLibrary/src/com/lam/mathematics/dataOut/usacoUser");
//        encoding.encode();

	}
}
