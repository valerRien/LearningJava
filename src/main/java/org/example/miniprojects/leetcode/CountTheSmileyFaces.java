package org.example.miniprojects.leetcode;

import java.util.*;

public class CountTheSmileyFaces {
    public static int countSmileys(List<String> arr) {
        int resultCount = 0;
        for (String smile : arr) {
            if (smile.matches("^[:;][-~]?[)D]$")) {
                resultCount++;
            }
        }
        return resultCount;
    }
}
