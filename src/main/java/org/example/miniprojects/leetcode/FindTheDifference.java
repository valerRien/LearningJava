package org.example.miniprojects.leetcode;

public class FindTheDifference {
    public static char findTheDifference(String s, String t) {
        char[] charsFromS = s.toCharArray();
        for (int i = 0; i < charsFromS.length; i++) {
            t = t.replaceFirst(String.valueOf(charsFromS[i]), "");
        }
        return t.charAt(0);
    }
}
