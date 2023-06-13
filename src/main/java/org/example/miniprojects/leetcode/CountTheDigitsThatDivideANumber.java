package org.example.miniprojects.leetcode;

public class CountTheDigitsThatDivideANumber {
    public static int countDigits(int num) {
        if (num == 0) throw new IllegalArgumentException("Div by zero");
        int count = 0;
        String valueOfNum = String.valueOf(num);

        for (int i = 0; i < valueOfNum.length(); i++) {
            int digit = valueOfNum.charAt(i) - '0';
            if (num % digit == 0) count++;
        }

        return count;
    }
}
