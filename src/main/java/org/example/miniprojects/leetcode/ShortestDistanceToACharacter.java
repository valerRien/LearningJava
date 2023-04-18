package org.example.miniprojects.leetcode;

import java.util.*;

public class ShortestDistanceToACharacter {
    public static int[] shortestToChar(String s, char c) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                indexes.add(i);
            }
        }

        if (indexes.isEmpty()) {
            return new int[]{};
        }

        int[] resultArray = new int[s.length()];
        int listCounter = 0;
        int distance = 0, leftBoard = 0, rightBoard = 0;
        for (int i = 0; i < s.length(); i++) {
            leftBoard = Math.abs(i - indexes.get(listCounter));
            if (listCounter + 1 < indexes.size()) {
                rightBoard = Math.abs(i - indexes.get(listCounter + 1));
                if (rightBoard < leftBoard) {
                    resultArray[i] = rightBoard;
                    listCounter++;
                } else {
                    resultArray[i] = leftBoard;
                }
            } else {
                resultArray[i] = leftBoard;
            }
        }

        return resultArray;
    }
}
