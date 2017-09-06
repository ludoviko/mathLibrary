package com.lam.mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author L.Azuaje.
 *
 * Given summa and
 *
 *  a*a + b*b = c*c;
 *  a + b + c = n;
 *
 *  Find a and b.
 *
 *  Solution:
 *
 *   b = (n . n - 2an)/2(n-a);
 *
 */

public class PythagoreanTriplet {
    private long a;
    private long b;
    private long c;
    private long summa;

    public PythagoreanTriplet(long summa) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        // summa = a + b + c.
        this.summa = summa;
    }

    public long getC() {
        return this.c;
    }

    public long getA() {
        return this.a;
    }

    public long getB() {
        return this.b;
    }

    public void find() {
        // long root = (long)Math.ceil(Math.sqrt(this.summa));
        while ( ++a < summa ) {
            if ( (   summa * summa - 2 * a * summa) % (2*summa - 2*a) == 0 ) {
                b = (long) ((summa * summa - 2 * a * summa) / (2 *summa - 2 *a));
                break;
            }
        }

        if (b == 0) {
            // no solution.
            this.a = -1;
            this.b = -1;
            this.c = -1;
        } else {
            this.c = (long)Math.sqrt(a * a + b * b);
        }
	}

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		PythagoreanTriplet main;
		
		int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            main = new PythagoreanTriplet(scanner.nextInt());
            main.find();
            if (main.getC() == -1) {
                out.format("%d ",  main.getC());
            } else {
                out.format("%d ", main.getC() * main.getC());
            }
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

