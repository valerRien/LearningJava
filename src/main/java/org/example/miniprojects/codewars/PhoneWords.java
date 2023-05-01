package org.example.miniprojects.codewars;

import java.util.*;

public class PhoneWords {
    static String[] keys = {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static String phoneWords(String str) {
        String result = "";
        for (int i = 0; str != null && i < str.length(); ) {
            int count = 0, currentChar = str.charAt(i);
            String s = keys[currentChar - '0'];
            while (i + count < str.length() && str.charAt(i + count) == currentChar && count < s.length()){
                count++;
            }
            if (!s.isEmpty()){
                result += (char) s.charAt(count - 1);
            }
            i += s.isEmpty() ? 1 : count;
        }
        return result;
    }
}
