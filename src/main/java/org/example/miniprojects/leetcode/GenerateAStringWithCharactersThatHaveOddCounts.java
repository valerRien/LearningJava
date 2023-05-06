package org.example.miniprojects.leetcode;

import java.util.*;

public class GenerateAStringWithCharactersThatHaveOddCounts {
    public static String generateTheString(int n) {
        StringBuilder resultBuilder = new StringBuilder();
        List<Integer> counts = getCounts(n);
        List<Character> chars = getChars(counts.size());
        for (int i = 0; i < counts.size(); i++) {
            resultBuilder.append(String.valueOf(chars.get(i)).repeat(counts.get(i)));
        }

        return resultBuilder.toString();
    }

    private static List<Character> getChars(int size) {
        List<Character> chars = new ArrayList<>();
        Set<Character> used = new HashSet<>();
        char charToAdd;
        while (chars.size() != size) {
            charToAdd = (char) ((int) (Math.random() * 26) + 97);
            if (!used.contains(charToAdd)) {
                used.add(charToAdd);
                chars.add(charToAdd);
            }
        }
        return chars;
    }

    private static List<Integer> getCounts(int n) {
        List<Integer> counts = new ArrayList<>();
        int count;
        while (n != 1) {
            count = (int) (Math.random() * n);
            if (count % 2 != 0) {
                counts.add(count);
                n -= count;
            }
        }

        counts.add(1);
        return counts;
    }
}
