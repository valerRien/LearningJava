package org.example.miniprojects.leetcode;

public class ComplementOfBaseInteger {
    public static int bitwiseComplement(int n) {
        return Integer.parseInt(complement(Integer.toBinaryString(n)),2);
    }

    private static String complement(String binaryString) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '0') {
                sb.append(1);
            } else {
                sb.append(0);
            }
        }

        return sb.toString();
    }
}
