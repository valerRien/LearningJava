package org.example.miniprojects.leetcode.SmallestEven;

public class SmallestEvenMultiple {
    public static int smallestEvenMultiple(int n) {
        if (n == 0) throw new IllegalArgumentException("Division by zero");
        if (n % 2 == 0) return n;
        else return n * 2;
    }
}
