package org.example.miniprojects.leetcode;

public class ToLowerCase {
    public static String toLowerCase(String s) {

       // return s.toLowerCase();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar >= 65 && currentChar <= 90) {
                currentChar += 32;
            }
            result.append(currentChar);
        }

        return result.toString();
    }
}
