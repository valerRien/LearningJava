package org.example.miniprojects.leetcode;

import java.util.*;

public class CountTheNumberOfConsistentStrings {
    public static int countConsistentStrings(String allowed, String[] words) {
        Set<Character> symbols = new HashSet<>();
        int resultCount = 0;

        for (int i = 0; i < allowed.length(); i++) {
            symbols.add(allowed.charAt(i));
        }

        for (String word:words) {
            boolean contain = true;
            for (int i = 0; i < word.length(); i++) {
                if (!symbols.contains(word.charAt(i))) {
                    contain = false;
                    break;
                }
            }
            if (contain) resultCount++;
        }

        return resultCount;
    }
}
