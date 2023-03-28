package org.example.miniprojects.leetcode;

public class StringToInteger {
    public static int myAtoi(String s) {
        String numberInStringFormat = "";
        boolean isNegative = false;
        boolean firstNumberFound = false;
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }
        if (!doesStartFromNumber(s)) {
            return 0;
        }
        if (s.matches(".*[+]-.*") || s.matches(".*-[+].*")) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            String currentChar = String.valueOf(s.charAt(i));
            if (!isNegative && !firstNumberFound) {
                if (currentChar.equals("-")) {
                    isNegative = true;
                }
            }
            if (firstNumberFound) {
                if (currentChar.matches("[0-9]")) {
                    numberInStringFormat += currentChar;
                } else {
                    break;
                }
            }
            if (!firstNumberFound && currentChar.matches("[0-9]")) {
                numberInStringFormat += currentChar;
                firstNumberFound = true;
            }
        }
        int result = 0;
        try {
            result = Integer.parseInt(numberInStringFormat);
            if (isNegative) {
                result *= -1;
            }
        } catch (NumberFormatException e) {
            if (isNegative) {
                result = Integer.MIN_VALUE;
            } else {
                result = Integer.MAX_VALUE;
            }
        }
        return result;
    }

    private static boolean doesStartFromNumber(String s) {
        if (s.length() == 1) {
            return s.substring(0, 1).matches("[0-9]");
        } else {
            return s.substring(0, 2).matches("^-*[+]*[0-9]+.*");
        }
    }
}
