package org.example.miniprojects.leetcode;


import java.util.Comparator;
import java.util.TreeSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {

        if (s.isEmpty()) {return 0;}
        TreeSet<String> linesWithoutRepeatingChars = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });

        String line = "";
        for (int i = 0; i < s.length(); i++) {
            String currentChar = String.valueOf(s.charAt(i));
            if (!line.contains(currentChar)) {
                line += currentChar;
            } else {
                linesWithoutRepeatingChars.add(line);
                line = formLine(line, currentChar);
            }
        }
        linesWithoutRepeatingChars.add(line);
        return linesWithoutRepeatingChars.first().length();
    }

    private static String formLine(String line, String currentChar) {
        return line.substring(line.indexOf(currentChar) + 1) + currentChar;
    }
}
