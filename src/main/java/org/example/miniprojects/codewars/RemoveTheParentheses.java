package org.example.miniprojects.codewars;

import java.util.ArrayList;
import java.util.List;

public class RemoveTheParentheses {
    public static String removeParentheses(final String str) {
        List<String> toCutStrings = new ArrayList<>();
        int bracketCounter = 0, startIndex = 0, endIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == '(') {
                startIndex = i;
                bracketCounter ++;
                while (bracketCounter != 0 && i < str.length()) {
                    i++;
                    currentChar = str.charAt(i);
                    if (currentChar == ')') {
                        bracketCounter--;
                        if (bracketCounter == 0) {
                            endIndex = i + 1;
                            toCutStrings.add(str.substring(startIndex, endIndex));
                        }
                    } else if (currentChar == '(') {
                        bracketCounter++;
                    }

                }
            }
        }
        String editingStr = str;
        for (String s:toCutStrings) {
            editingStr = editingStr.replace(s, "");
        }
        return editingStr;
    }
}
