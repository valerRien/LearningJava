package org.example.miniprojects.codewars;

import java.util.*;

public class MexicanWave {
    public static String[] wave(String str) {
        List<String> resultList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar >= 97 && currentChar <= 122) {
                currentChar -= 32;
                sb.append(str, 0, i);
                sb.append(currentChar);
                if (i + 1 < str.length()) {
                    sb.append(str.substring(i + 1));
                }
                resultList.add(sb.toString());
                sb.setLength(0);
            }
        }
        return resultList.toArray(new String[0]);
    }
}
