package org.example.miniprojects.leetcode;

import java.util.*;

public class DecryptStringFromAlphabetToIntegerMapping {
    public static String freqAlphabets(String s) {
        List<String> listOfSplit = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0 ; i--) {
            if (s.charAt(i) == '#') {
                listOfSplit.add(s.substring(i - 2, i));
                i = i - 2;
            } else {
                listOfSplit.add(String.valueOf(s.charAt(i)));
            }
        }

        for (String str : listOfSplit) {
            sb.append(Character.valueOf((char) (Integer.parseInt(str) + 96)));
        }

        return sb.reverse().toString();
    }
}
