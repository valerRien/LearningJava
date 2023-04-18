package org.example.miniprojects.leetcode;

import java.util.*;

public class MostCommonWord {
    public static String mostCommonWord(String paragraph, String[] banned) {
        String[] split = paragraph.split("\\W");
        String currentWord = "";
        Map<String, Integer> wordsAndItsCount = new HashMap<>();
        int max = 0; String result = "";

        for (int i = 0; i < split.length; i++) {
            currentWord = split[i].toLowerCase().replaceAll(" ", "");
            if (currentWord.isEmpty()) continue;
            if (wordsAndItsCount.containsKey(currentWord)) {
                wordsAndItsCount.put(currentWord, wordsAndItsCount.get(currentWord) + 1);
            } else {
                wordsAndItsCount.put(currentWord, 1);
            }
        }

        for (String ban:banned) {
            wordsAndItsCount.put(ban, 0);
        }

        for (Map.Entry<String, Integer> entry : wordsAndItsCount.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }

        return result;
    }
}
