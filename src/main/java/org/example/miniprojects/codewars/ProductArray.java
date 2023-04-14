package org.example.miniprojects.codewars;

import java.util.Arrays;

public class ProductArray {
    public static long[] productArray(int[] numbers) {
        long allArrMultiply = 1;
        for (int number : numbers) {
            allArrMultiply *= number;
        }
        long[] result = new long[numbers.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = allArrMultiply / numbers[i];
        }
        return result;
    }
}
