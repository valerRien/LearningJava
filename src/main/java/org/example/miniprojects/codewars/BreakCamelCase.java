package org.example.miniprojects.codewars;

public class BreakCamelCase {
    public static String camelCase(String input) {
        StringBuilder resultBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar >= 'A' && currentChar <= 'Z') {
                resultBuilder.append(" ");
            }
            resultBuilder.append(currentChar);
        }

        return resultBuilder.toString();
    }
}
