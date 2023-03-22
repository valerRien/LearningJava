package org.example.miniprojects.codewars;

import java.util.Arrays;

public class AllStarCodeChallengeEighteen {
    public static int strCount(String str, char letter) {
        char[] chars = str.toCharArray();
        int count = 0;
        for (char c : chars) {
            if (c == letter) {
                count++;
            }
        }
        return count;
    }
}
