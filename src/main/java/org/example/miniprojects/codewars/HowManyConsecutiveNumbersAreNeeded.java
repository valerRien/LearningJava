package org.example.miniprojects.codewars;

import java.util.Arrays;

public class HowManyConsecutiveNumbersAreNeeded {
    public static int consecutive(final int[] arr) {
        if (arr.length == 1 || arr.length == 0) {
            return 0;
        }
        Arrays.sort(arr);
        int result = 0;
        int supCounter;
        for (int i = 0; i < arr.length - 1; i++) {
            supCounter = 1;
            while (arr[i] + supCounter != arr[i + 1]) {
                    result++;
                    supCounter++;
            }
        }
        return result;
    }
}
