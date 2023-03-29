package org.example.miniprojects.codewars;


import java.util.HashMap;
import java.util.Map;

public class TheFirstNonRepeatedCharacterInAString {
    public static Character firstNonRepeated(String source) {
        char[] charsFromWord = source.toCharArray();
        Map<Character, Integer> charsAndItsCount = new HashMap<>();

        for (int i = 0; i < source.length(); i++) {
            char currentChar = source.charAt(i);
            if (!charsAndItsCount.containsKey(currentChar)) {
                charsAndItsCount.put(currentChar, 1);
            } else {
                int updatedValue = charsAndItsCount.get(currentChar);
                updatedValue++;
                charsAndItsCount.put(currentChar, updatedValue);
            }
        }

        for (int i = 0; i < charsFromWord.length; i++) {
            if (charsAndItsCount.get(charsFromWord[i]) == 1) {
                return charsFromWord[i];
            }
        }

        return null;
    }
}
