package org.example.miniprojects.leetcode;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        int needleLength = needle.length();
        if (needleLength > haystack.length()) {
            return -1;
        }

        for (int i = 0; i < haystack.length(); i++) {
            int j = 0;
            while (i + j <= haystack.length() - 1 && haystack.charAt(i + j) == needle.charAt(j)){
                j++;
                if (j == needleLength) {
                    return i;
                }
            }
        }

        return -1;
    }
}
