package org.example.miniprojects.leetcode;

import java.util.*;

/**
 * A group is considered large if it has 3 or more characters.
 */

public class PositionsOfLargeGroups {
    public static List<List<Integer>> largeGroupPositions(String s) {
        if (s.isEmpty()) {
            return new ArrayList<>();
        }
        List<List<Integer>> resultList = new ArrayList<>();
        char prev = s.charAt(0), innerCount = 0;
        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == prev) {
                innerCount++;
            } else {
                prev = currentChar;
                if (innerCount >= 2) {
                    resultList.add(new ArrayList<>(Arrays.asList(i - 1 - innerCount, i - 1)));
                }
                innerCount = 0;
            }
        }

        if (innerCount >= 2) {
            resultList.add(new ArrayList<>(Arrays.asList(s.length() - 1 - innerCount, s.length() - 1)));
        }

        return resultList;
    }
}
