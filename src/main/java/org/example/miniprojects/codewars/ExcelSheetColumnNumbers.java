package org.example.miniprojects.codewars;

public class ExcelSheetColumnNumbers {
    public static long titleToNumber(String title) {
        long result = 0L;
        for (int i = 0; i < title.length(); i++) {
            result *= 26;
            result += title.charAt(i) - 64;
        }
        return result;
    }
}
