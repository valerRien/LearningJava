package org.example.miniprojects.codewars;

public class LengthAndTwoValues {
    public static String[] alternate(int n, String firstValue, String secondValue) {
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result[i] = firstValue;
            } else {
                result[i] = secondValue;
            }
        }

        return result;
    }
}
