package com.lam.mathematics;

import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

/**
 * @author Solution by: L.Azuaje.
 *
 *  Collatz sequence
 *
 * The following iterative sequence is defined for the set of positive
 * integers:
 *
 * n → n/2 (n is even) n → 3n + 1 (n is odd)
 *
 * Using the rule above and starting with 13, we generate the following
 * sequence: 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 *
 * It can be seen that this sequence (starting at 13 and finishing at 1)
 * contains 10 terms. Although it has not been proved yet (Collatz Problem),
 * it is thought that all starting numbers finish at 1.
 */

public class CollatzConjecture {
    private Map<Long, Long> cache;

    public CollatzConjecture() {
        cache = new HashMap<>();
        cache.put(1L, 1L);
    }

    public List<Long> findSequence(long n) {
        List<Long> list = new LinkedList<Long>();

        long m;
        list.add(n);

        while (n != 1) {
            m = n;
            if (  cache.containsKey(m)) {
                list.add( cache.get(m) );
                n = cache.get(m);
            } else {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = 3 * n + 1;
                }
                list.add(n);
                cache.put(m, n);
            }
        }

        return list;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        PrintStream out = System.out;

        CollatzConjecture main = new CollatzConjecture();

        List<Long> list;
        List<Long> list_2;
        List<Long> list_3;

        boolean goOn = true;

        while (goOn) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a == 0) {
                goOn = false;
                break;
            }

            list = main.findSequence(a);
            list_2 = main.findSequence(b);
            list_3 = new ArrayList<>();

            list_3.addAll(list_2);

            list_3.retainAll(list);

            System.out.format("%d needs %d steps, %d needs %d steps, they meet at %d%n", a, list.indexOf(list_3.get(0)), b, list_2.indexOf(list_3.get(0)), list_3.get(0));
        }

        scanner.close();
        out.close();
    }
}
