package org.example.miniprojects.codewars;

public class ValidParentheses {
    public static boolean validParentheses(String parenStr) {
        if (parenStr.isEmpty()) {
            return true;
        }

        int count = 0;
        for (char current : parenStr.toCharArray()) {
            if (current == '(') {
                count++;
            } else if (current == ')') {
                count --;
            }
            if (count < 0) {
                return false;
            }
        }

        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }
}
