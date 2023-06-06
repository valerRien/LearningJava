package org.example.miniprojects.leetcode;

public class NumberOfCommonFactors {
    public static int commonFactors(int a, int b) {
        if (a == 0 && b == 0) throw new IllegalArgumentException();
        return getNumberOfNODs(a, b, (int) Math.max(a, b));
    }

    private static int getNumberOfNODs(int a, int b, int max) {
        int countOfNODs = 0;
        for (int i = 1; i <= max; i++) {
            if (a % i == 0 && b % i == 0) countOfNODs++;
        }
        return countOfNODs;
    }
}
