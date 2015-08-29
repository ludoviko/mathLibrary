package com.lam.mathematics;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import com.lam.utilIo.ReadData;


/***
 * 
 * @author Ludoviko Azuaje
 * 
 *         Champernowne's constant Problem 40
 * 
 *         An irrational decimal fraction is created by concatenating the
 *         positive integers:
 * 
 *         0.123456789101112131415161718192021...
 * 
 *         It can be seen that the 12th digit of the fractional part is 1.
 * 
 *         If dn represents the nth digit of the fractional part, find the value
 *         of the following expression.
 * 
 *         d1 × d10 × d100 × d1000 × d10000 × d100000 × d1000000
 * 
 */

public class ChampernownesConstant {
	private int upToFractionalPosition;
	private StringBuilder champernownes;
	public static final String PathToFile = "./src/main/resources/dataOut/champernownesNumber";
	public ChampernownesConstant() {
	}

	public void setUpToFractionalPosition(int upToFractionalPosition) {
		this.upToFractionalPosition = upToFractionalPosition + 2;
		this.champernownes = new StringBuilder(this.upToFractionalPosition);
	}

	public ChampernownesConstant(int upToFractionalPosition) {
		this(upToFractionalPosition, false);
	}

	public ChampernownesConstant(int upToFractionalPosition, boolean loadData) {
		// The 0 and the dot (0.) add two positions to the string
		this.upToFractionalPosition = upToFractionalPosition + 2;
		this.champernownes = new StringBuilder(this.upToFractionalPosition);
		if (loadData) {
			this.loadData(PathToFile);
		}
	}

    public ChampernownesConstant(int upToFractionalPosition, String  pathToFile) {
        // The 0 and the dot (0.) add two positions to the string
        this.upToFractionalPosition = upToFractionalPosition + 2;
        this.champernownes = new StringBuilder(this.upToFractionalPosition);
            this.loadData(pathToFile);
    }


    public void setChampernownes() {
		this.champernownes.append("0.");
		int i = 1;
		while (this.champernownes.length() < this.upToFractionalPosition) {
			this.champernownes.append(i++);
			// System.out.println(champernownes.length());
		}
		this.champernownes = new StringBuilder(this.champernownes.toString()
				.substring(0, this.upToFractionalPosition));
	}

	public void saveChampernownes() {
		OutputStreamWriter writer = null;
		try {
			writer = new OutputStreamWriter(new BufferedOutputStream(
					new FileOutputStream(PathToFile)), "utf-8");

			for (int i = 0; i < this.champernownes.length(); i++) {
				writer.write(this.champernownes.charAt(i));
			}
			writer.close();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void loadData(String pathToFile) {
		ReadData data = new ReadData(new File(pathToFile));
		data.loadData();
		this.champernownes = new StringBuilder(data.getList().get(0));
	}

	public StringBuilder getChampernownes() {
		return this.champernownes;
	}

	public static void main(String[] args) {
		int size = 1000000;
		ChampernownesConstant champer = new ChampernownesConstant(size);
		// 0.12345678910
		champer.setChampernownes();
		champer.saveChampernownes();
	}
}
