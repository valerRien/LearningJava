package org.example.miniprojects.leetcode;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {
    public static List<String> letterCombinations(String digits) {
        LinkedList<String> representations = new LinkedList<>();

        if (digits.isEmpty()) {
            return representations;
        }

        String[] phoneButtons = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        representations.add("");
        for (int i = 0; i < digits.length(); i++) {
            int x = digits.charAt(i) - '0';
            while (representations.peek().length() == i) {
                String firstFromList = representations.remove();
                for (char current : phoneButtons[x].toCharArray())
                    representations.add(firstFromList + current);
            }
        }
        return representations;
    }
}
