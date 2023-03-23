package org.example.miniprojects.leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {

        if (strs[0].equals("")) {
            return "";
        }

        int currentIndex = 0;
        String currentChar = "";
        String result = "";
        boolean flag = true;
        int shortestLength = getShortest(strs);

        while (flag) {
            currentChar += String.valueOf(strs[0].charAt(currentIndex));
            for (String str : strs) {
                if (!str.startsWith(currentChar)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result += String.valueOf(strs[0].charAt(currentIndex));
                if (currentIndex + 1 < shortestLength) {
                    currentIndex++;
                } else {
                    flag = false;
                }
            }
        }

        return result;
    }

    private static int getShortest(String[] strs) {
        int count = strs[0].length();
        for (String str : strs){
            if (str.length() < count) {
                count = str.length();
            }
        }
        return count;
    }
}
