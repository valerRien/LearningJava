package org.example.miniprojects.codewars;

public class SimpleMultiplication {
    public static int simpleMultiplication(int n) {
        if (isEven(n)) {
            return n * 8;
        }
        return n * 9;
    }

    private static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
