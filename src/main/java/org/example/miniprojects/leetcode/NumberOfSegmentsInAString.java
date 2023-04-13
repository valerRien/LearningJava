package org.example.miniprojects.leetcode;

public class NumberOfSegmentsInAString {
    public static int countSegments(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                while (s.charAt(i) == ' ') {
                    i++;
                }
                count++;
            }
        }
        return count;
    }
}
