package org.example.miniprojects.leetcode;

public class ReverseOnlyLetters {
    public static String reverseOnlyLetters(String s) {
        if (s.isEmpty()) {
            return "";
        }
        String lettersOnly = s.replaceAll("[^A-Za-z]", "");
        if (lettersOnly.isEmpty()) {
            return s;
        }
        lettersOnly = new StringBuilder(lettersOnly).reverse().toString();
        int lettersOnlyCounter = lettersOnly.length() - 1, resultCounter = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (lettersOnlyCounter >= 0 && s.charAt(i) == lettersOnly.charAt(lettersOnlyCounter)) {
                result.append(lettersOnly.charAt(resultCounter));
                lettersOnlyCounter--;
                resultCounter++;
            } else {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}
