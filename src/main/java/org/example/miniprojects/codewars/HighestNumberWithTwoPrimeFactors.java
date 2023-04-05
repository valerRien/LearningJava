package org.example.miniprojects.codewars;

public class HighestNumberWithTwoPrimeFactors {
    public static long[] highestBiPrimeFac(long p1, long p2, long n) {
        long[] result = new long[3];
        long num = p1 * p2;
        for (int k1 = 1; num <= n; k1++) {
            for (int k2 = 1; num <= n; k2++) {
                num = (long) (Math.pow(p1, k1) * Math.pow(p2, k2));
                if (num > result[0]) {
                    result[0] = num;
                    result[1] = k1;
                    result[2] = k2;
                }
                num *= p2;
            }
            num = (long) (Math.pow(p1, k1 + 1) * p2);
        }
        return result;
    }
}
