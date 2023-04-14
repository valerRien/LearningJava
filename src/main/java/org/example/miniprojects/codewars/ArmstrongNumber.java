package org.example.miniprojects.codewars;

public class ArmstrongNumber {
    public static boolean isNarcissistic(int number) {
        String stringValue = String.valueOf(number);
        int result = 0;
        for (int i = 0; i < stringValue.length(); i++) {
            result += (int) Math.pow(stringValue.charAt(i) - '0', stringValue.length());
            if (result > number) return false;
        }
        return result == number;
    }
}
