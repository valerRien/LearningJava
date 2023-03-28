package org.example.miniprojects.leetcode;


public class ReverseInteger {
    public static int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) {
            x = x * (- 1);
            isNegative = true;
        }
        String stringResult = new StringBuilder(String.valueOf(x)).reverse().toString();
        int result = 0;
        try {
            result = Integer.parseInt(stringResult);
            if (isNegative){
                result = result * (-1);
            }
            return result;
        } catch (NumberFormatException e) {
           return result;
        }
    }
}
