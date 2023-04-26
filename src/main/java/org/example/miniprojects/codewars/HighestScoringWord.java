package org.example.miniprojects.codewars;

public class HighestScoringWord {
    public static String high(String s) {
        String[] words = s.split(" ");

        int sum = 0, highest = 0;
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            for (char c : words[i].toCharArray()) {
                sum += (int) c - 96;
            }

            if (sum > highest) {
                index = i;
                highest = sum;
            }

            sum = 0;
        }

        return words[index];
    }
}
