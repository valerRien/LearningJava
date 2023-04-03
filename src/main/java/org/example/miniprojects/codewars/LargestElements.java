package org.example.miniprojects.codewars;

import java.util.Arrays;

public class LargestElements {
    public static int[] largest(int n, int[] arr) {
        if (n > arr.length || n == 0) {
            return new int[]{};
        }

        Arrays.sort(arr);
        int[] result = new int[n];
        int innerCounter = 0;
        for (int i = arr.length - n; i < arr.length; i++) {
            result[innerCounter] = arr[i];
            innerCounter++;
        }
        return result;
    }
}
