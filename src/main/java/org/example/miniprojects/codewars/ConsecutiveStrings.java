package org.example.miniprojects.codewars;

/**
 * consecutive strings : follow one after another without an interruption
 */

public class ConsecutiveStrings {
    public static String longestConsec(String[] strarr, int k) {
        if (k <= 0 || strarr.length == 0 || k > strarr.length) {
            return "";
        }

        int lengthSum = 0, kClone = 0, index = 0, maxLength = 0;
        for (int i = 0; i < strarr.length - k + 1; i++) {
            while (kClone != k) {
                lengthSum += strarr[i + kClone].length();
                kClone++;
            }
            if (lengthSum > maxLength) {
                maxLength = lengthSum;
                index = i;
            }
            lengthSum = 0;
            kClone = 0;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = index; i < index + k; i++) {
            sb.append(strarr[i]);
        }

        return sb.toString();
    }
}
