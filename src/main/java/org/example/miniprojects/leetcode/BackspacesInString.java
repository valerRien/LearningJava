package org.example.miniprojects.leetcode;

public class BackspacesInString {
    public static String cleanString(String s) {
        StringBuilder result = new StringBuilder();
        char currentChar;
        int sharpCounter = 0;
        for (int i = s.length() - 1; i >= 0 ; i--) {
            currentChar = s.charAt(i);
            if (currentChar == '#') {
                sharpCounter++;
                continue;
            }

            if (sharpCounter > 0) {
                sharpCounter--;
                continue;
            }

            result.append(currentChar);
        }

        return result.reverse().toString();
    }
}
