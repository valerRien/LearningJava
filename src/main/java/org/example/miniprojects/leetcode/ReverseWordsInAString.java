package org.example.miniprojects.leetcode;

public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            for (int j = split[i].length() - 1; j >= 0 ; j--) {
                sb.append(split[i].charAt(j));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
