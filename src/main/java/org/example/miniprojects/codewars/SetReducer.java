package org.example.miniprojects.codewars;

import java.util.*;

public class SetReducer {
    public static int setReducer(int[] input) {
        while (input.length != 1) {
            input = getReducedArray(input);
        }
        return input[0];
    }

    private static int[] getReducedArray(int[] inputArray) {
        List<Integer> values = new ArrayList<>();
        int value = inputArray[0], raw = 1;
        for (int i = 0; i < inputArray.length; i++) {
            while (i + 1 < inputArray.length && inputArray[i] == inputArray[i + 1]) {
                raw++;
                i++;
            }
            values.add(raw);
            raw = 1;
        }
        int[] reducedArray = new int[values.size()];
        for (int i = 0; i < reducedArray.length; i++) {
            reducedArray[i] = values.get(i);
        }
        return reducedArray;
    }
}
