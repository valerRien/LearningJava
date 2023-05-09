package org.example.miniprojects.leetcode;

import java.util.*;

public class ReformatTheString {
    public static String reformat(String s) {
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> letters = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 96 && s.charAt(i) < 123) {
                letters.add(s.charAt(i));
            } else {
                digits.add(s.charAt(i));
            }
        }

        if (Math.abs(digits.size() - letters.size()) > 1) {
            return "";
        }

        StringBuilder resultBuilder = new StringBuilder();
        int sbSize = digits.size() + letters.size();
        int size = Math.min(digits.size(), letters.size());
        for (int i = 0; i < size; i++) {
            resultBuilder.append(digits.get(i)).append(letters.get(i));
        }

        if (digits.size() != letters.size()) {
            if (digits.size() < letters.size()) {
                resultBuilder.reverse().append(letters.get(letters.size() - 1));
            } else {
                resultBuilder.append(digits.get(digits.size() - 1));
            }
        }

        return resultBuilder.toString();
    }
}
