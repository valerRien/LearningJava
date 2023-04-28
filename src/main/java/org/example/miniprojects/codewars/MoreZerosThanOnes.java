package org.example.miniprojects.codewars;

import java.util.*;

public class MoreZerosThanOnes {
    public static char[] moreZeros(String s) {
        String charValue = "";
        int zeros = 0, ones = 0;
        Set<Character> included = new HashSet<>();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            charValue = Integer.toBinaryString(s.charAt(i));
            for (int j = 0; j < charValue.length(); j++) {
                if (charValue.charAt(j) == '1') {
                    ones++;
                } else {
                    zeros++;
                }
            }
            if (zeros > ones && !included.contains(s.charAt(i))) {
                list.add(s.charAt(i));
                included.add(s.charAt(i));
            }
            zeros = 0; ones = 0;
        }

        char[] result = new char[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
