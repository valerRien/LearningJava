package org.example.miniprojects.leetcode;

public class FindTheDifference {
    public static char findTheDifference(String s, String t) {
        char result = 0;
        for (char charS : s.toCharArray()) result = (char) (result ^ charS);
        for (char charT : t.toCharArray()) result = (char) (result ^ charT);
        return result;
    }
}
