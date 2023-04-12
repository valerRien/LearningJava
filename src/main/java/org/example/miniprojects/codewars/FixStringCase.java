package org.example.miniprojects.codewars;

public class FixStringCase {
    public static String solve(final String str) {
        if (str.isEmpty()) {
            return "";
        }

        int lower = 0, upper = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                upper++;
            } else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                lower++;
            }
        }

        return lower < upper? str.toUpperCase() : str.toLowerCase();
    }
}
