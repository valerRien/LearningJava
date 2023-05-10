package org.example.miniprojects.codewars;

import java.util.*;

public class CountCharactersInYourString {
    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> charsAndItsCount = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (!charsAndItsCount.containsKey(currentChar)) {
                charsAndItsCount.put(currentChar, 1);
            } else {
                charsAndItsCount.put(currentChar, charsAndItsCount.get(currentChar) + 1);
            }
        }

        return charsAndItsCount;
    }
}
