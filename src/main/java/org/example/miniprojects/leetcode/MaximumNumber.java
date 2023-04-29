package org.example.miniprojects.leetcode;

public class MaximumNumber {
    public static int maximum69Number (int num) {
        String result = String.valueOf(num);
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '6') {
                result = result.substring(0, i) + "9" + result.substring(i + 1);
                break;
            }
        }
        return Integer.parseInt(result);
    }
}
