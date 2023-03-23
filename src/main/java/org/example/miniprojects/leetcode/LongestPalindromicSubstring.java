package org.example.miniprojects.leetcode;

import java.util.Comparator;
import java.util.TreeSet;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        String longestPalindrome = "";
        String splitLine;
        for (int i = 0; i < s.length(); i++) {
            int j = s.length() - 1;
            while (i < j) {
                if (s.charAt(i) == s.charAt(j) && longestPalindrome.length() < (j - i + 1)) {
                    splitLine = s.substring(i, j + 1);
                    String reversed = new StringBuilder(splitLine).reverse().toString();
                    if (splitLine.equals(reversed)) {
                        longestPalindrome = splitLine;
                    }
                }
                j--;
            }
        }

        if (longestPalindrome.length() == 0) {
            longestPalindrome = s.substring(0, 1);
        }

        return longestPalindrome;
    }
}
