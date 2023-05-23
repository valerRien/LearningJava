package org.example.miniprojects.leetcode;

public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        if (word1 == null || word1.isEmpty()) return word2;
        if (word2 == null || word2.isEmpty()) return word1;

        StringBuilder resultBuilder = new StringBuilder();

        int minLength = Math.min(word1.length(), word2.length());
        for (int i = 0; i < minLength; i++) {
            resultBuilder.append(word1.charAt(i)).append(word2.charAt(i));
        }

        if (minLength < word1.length()) resultBuilder.append(word1.substring(minLength));
        if (minLength < word2.length()) resultBuilder.append(word2.substring(minLength));

        return resultBuilder.toString();
    }
}
