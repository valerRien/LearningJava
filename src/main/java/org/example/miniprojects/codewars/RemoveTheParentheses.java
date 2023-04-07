package org.example.miniprojects.codewars;

import java.util.ArrayList;
import java.util.List;

public class RemoveTheParentheses {
    public static String removeParentheses(final String str) {
        StringBuilder editingString = new StringBuilder();
        int bracketCounter = 0;
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == '(') {
                bracketCounter++;
            }
            if (bracketCounter == 0) {
                editingString.append(currentChar);
            }
            if (currentChar == ')') {
                bracketCounter--;
            }
        }
        return editingString.toString();
    }
}
