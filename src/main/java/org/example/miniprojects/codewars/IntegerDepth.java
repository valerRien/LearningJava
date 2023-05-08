package org.example.miniprojects.codewars;

import java.util.*;

public class IntegerDepth {
    public static int computeDepth(int n) {
        Set<Integer> digits = new HashSet<>();
        int currentNValue = 1, multiplier = 0;
        String nString;

        while (digits.size() != 10) {
            multiplier++;
            currentNValue = n * multiplier;
            nString = String.valueOf(currentNValue);

            for (int i = 0; i < nString.length(); i++) {
                int currentDigit = nString.charAt(i) - '0';
                digits.add(currentDigit);
            }
        }

        return multiplier;
    }
}
