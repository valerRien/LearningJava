package org.example.miniprojects.leetcode;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        int maxPowerInIntegerLimit = (int) Math.pow(2, 30);
        return n > 0 && maxPowerInIntegerLimit % n == 0;
    }
}
