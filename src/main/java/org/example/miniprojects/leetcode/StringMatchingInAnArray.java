package org.example.miniprojects.leetcode;

import java.util.*;

public class StringMatchingInAnArray {
    public static List<String> stringMatching(String[] words) {
        Set<String> uniqueSubs = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i == j){
                    continue;
                }

                if (words[i].length() >= words[j].length() && words[i].contains(words[j])) {
                    uniqueSubs.add(words[j]);
                }
            }
        }

        return new LinkedList<>(uniqueSubs);
    }
}
