package com.lam.mathematics.encryption;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author L.Azuaje.
 *
 *
 *
 */

public class CaesarShiftCipher {
    // English alphabet. Its length is 26 chararter long.
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private String string;
    private String encrypted;
    private int shift;
    private int shiftDecrypt;

    public CaesarShiftCipher(String string, int shift) {
        this.string = string.toLowerCase();
        this.shift = Math.floorMod(shift, ALPHABET.length());
        this.shiftDecrypt = (-1) * this.shift;
        this.encrypted = "";
    }

    public void encrypt() {
        encrypt(this.shift);
    }

    public void decrypt() {
        encrypt(this.shiftDecrypt);
    }

    public void encrypt(int paramShift) {
        StringBuilder encryptedMessage  = new StringBuilder();

        for (int i = 0; i < this.string.length(); i++) {
            if (Character.isLetter(this.string.charAt(i))) {
                int letterPosition = this.string.charAt(i) - 'a';
                int letterPositionEnc  = Math.floorMod((letterPosition + paramShift) ,  ALPHABET.length());
                encryptedMessage.append( ALPHABET.toCharArray()[letterPositionEnc]);
            } else {
                encryptedMessage.append(this.string.charAt(i));

            }
        }
        this.encrypted = encryptedMessage.toString();
    }

    public String getEncrypted() {
        return this.encrypted;
    }

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

        int[] data = scanner.nextIntArray();
        CaesarShiftCipher main = null;

        for (int i = 0; i < data[0]; i++) {
            String string = scanner.next();
            main = new CaesarShiftCipher(string, data[1]);
            main.decrypt();
            out.format("%s ", main.getEncrypted().toUpperCase());
        }

		scanner.reader.close();
		out.close();
	}

	// -----------MyScanner class for faster input----------
	public static class MyScanner {
		BufferedReader reader;

		public MyScanner() {
			this.reader = new BufferedReader(new InputStreamReader(System.in));
		}

		public void close() throws IOException {
			this.reader.close();
		}

		int nextInt() {
			return Integer.parseInt(this.next());
		}

		long nextLong() {
			return Long.parseLong(this.next());
		}

		double nextDouble() {
			return Double.parseDouble(this.next());
		}

		String next() {
			String str = "";
			try {
				str = this.reader.readLine().trim();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		String[] nextStringArray() {
			String[] str = null;
			try {
				str = this.reader.readLine().trim().split(" ");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		int[] nextIntArray() {
			String[] data  = nextStringArray();
			int[] a  = new int[data.length];

			for (int i = 0; i < a.length; i++) {
				a[i] = Integer.parseInt(data[i]);
			}

			return a;
		}

		Integer[] nextIntegerArray() {
			String[] data  = nextStringArray();
			Integer[] a  = new Integer[data.length];

			for (int i = 0; i < a.length; i++) {
				a[i] = Integer.parseInt(data[i]);
			}

			return a;
		}

		long[] nextLongArray() {
			String[] data  = nextStringArray();
			long[] a  = new long[data.length];

			for (int i = 0; i < a.length; i++) {
				a[i] = Long.parseLong(data[i]);
			}

			return a;
		}

          float[] nextFloatArray() {
            String[] data  = nextStringArray();
            float[] a  = new float[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Float.parseFloat(data[i]);
            }

            return a;
        }

        double[] nextDoubleArray() {
            String[] data  = nextStringArray();
            double[] a  = new double[data.length];

            for (int i = 0; i < a.length; i++) {
                a[i] = Double.parseDouble(data[i]);
            }

            return a;
        }
    }
}

