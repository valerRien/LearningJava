package org.example.miniprojects.codewars;

public class SpecialMultiples {
    public static int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};

    public static long countSpecMult(long n, long mxval) {

        int nod = 1;
        for (int i = 0; i < n; i++)
            nod *= primes[i];

        return mxval / nod;
    }
}
