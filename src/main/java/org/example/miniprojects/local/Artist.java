package org.example.miniprojects.local;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Artist {

    public static String mostContrastDays(String N, String aN) throws Exception {
        int days = Integer.parseInt(N);
        String[] contrasts = aN.split(" ");
        int[] numbers = new int[contrasts.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(contrasts[i]);
        }
        int day = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, dayTwo = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= max) {
                max = numbers[i];
                day = i + 1;
            }
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] <= min) {
                min = numbers[i];
                dayTwo = i + 1;
            }
        }
        return day + " " + dayTwo;
    }
}
