package org.example.miniprojects.codewars;

import java.util.*;

public class RemoveConsecutiveDuplicateWords {
    public static String removeConsecutiveDuplicates(String s) {
        if (s.isEmpty()) {
            return "";
        }

        String[] split = s.split(" ");
        List<String> result = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            result.add(split[i]);
            while (i + 1 < split.length && split[i].equals(split[i + 1])) {
                i++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String word : result) {
            sb.append(word).append(" ");
        }
        return sb.toString().trim();
    }
}
