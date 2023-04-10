package org.example.miniprojects.codewars;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(long n) {
        int maxPowerInIntegerLimit = (int) Math.pow(2, 30);
        return n > 0 && maxPowerInIntegerLimit % n == 0;
    }
}
