package org.example.miniprojects.codewars;

import java.util.*;

import org.apache.commons.lang3.tuple.Pair;

public class OrderedCountOfCharacters {
    public List<Pair<Character, Integer>> orderedCount(String text) {
        Map<Character, Integer> charsAndItsCount = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (!charsAndItsCount.containsKey(currentChar)) {
                charsAndItsCount.put(currentChar, 1);
            } else {
                int updatedCount = charsAndItsCount.get(currentChar);
                updatedCount++;
                charsAndItsCount.put(currentChar, updatedCount);
            }
        }

        List<Pair<Character, Integer>> resultList = new ArrayList<>();
        Set<Character> alreadyPutted = new HashSet<>();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (!alreadyPutted.contains(currentChar)) {
                resultList.add(Pair.of(currentChar, charsAndItsCount.get(currentChar)));
                alreadyPutted.add(currentChar);
            }
        }

        return resultList;
    }
}
