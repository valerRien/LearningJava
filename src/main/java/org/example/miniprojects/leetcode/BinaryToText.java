package org.example.miniprojects.leetcode;


/**
 * The input string will always be a valid binary string.
 */
public class BinaryToText {
    public static String binaryToText(String binary) {
        if (binary.isEmpty()) return "";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < binary.length(); i += 8) {
            char letterCode = (char) Integer.parseInt(binary.substring(i, i + 8), 2);
            sb.append(letterCode);
        }

        return sb.toString();
    }
}
