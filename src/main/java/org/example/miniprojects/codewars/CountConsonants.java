package org.example.miniprojects.codewars;

import java.util.Arrays;
import java.util.List;

public class CountConsonants {
    public static int getCount(String str) {
        List<Character> list = Arrays.asList('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z');
        int result = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (list.contains(str.charAt(i))) {
                result++;
            }
        }
        return result;
    }
}
