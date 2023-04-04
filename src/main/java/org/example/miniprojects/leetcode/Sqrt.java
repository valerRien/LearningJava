package org.example.miniprojects.leetcode;

public class Sqrt {
    public static int mySqrt(int x) {
        if (x == 0) return 0;
        int lower = 1, higher = x, lowerValueThanNext = 0, middleValue;
        while (lower <= higher) {
            middleValue = lower + (higher - lower) / 2;
            if (x / middleValue == middleValue) {
                return middleValue;
            } else if (x / middleValue < middleValue) {
                higher = middleValue - 1;
            } else {
                lower = middleValue + 1;
                lowerValueThanNext = middleValue;
            }
        }
        return lowerValueThanNext;
    }
}
