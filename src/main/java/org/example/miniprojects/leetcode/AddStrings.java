package org.example.miniprojects.leetcode;

public class AddStrings {
    public static String addStrings(String num1, String num2) {
        int nextDigit = 0, currentDigit, num1Length = num1.length() - 1, num2Length = num2.length() - 1;
        StringBuilder sb = new StringBuilder();

        while (true) {
            currentDigit = nextDigit;
            if (num1Length >= 0) {
                currentDigit += num1.charAt(num1Length--) - '0';
            }
            if (num2Length >= 0) {
                currentDigit += num2.charAt(num2Length--) - '0';
            }
            sb.append(currentDigit % 10);
            nextDigit = currentDigit / 10;
            if (num1Length < 0 && num2Length < 0) break;
        }

        if (nextDigit != 0) {
            sb.append(nextDigit);
        }

        return sb.reverse().toString();
    }
}
