package org.example.miniprojects.leetcode;

public class CheckIfTwoStringArraysAreEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return buildString(word1).equals(buildString(word2));
    }

    private static String buildString(String word[]) {
        StringBuilder wordBuilder = new StringBuilder();
        for (String s : word) {
            wordBuilder.append(s);
        }
        return wordBuilder.toString();
    }
}
