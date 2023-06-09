package org.example.miniprojects.codewars;

public class AlternateCase {

    public static String alternateCase(final String string) {
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if (currentChar >= 'A' && currentChar <= 'Z') {
                currentChar += 32;
            } else if (currentChar >= 'a' && currentChar <= 'z') {
                currentChar -= 32;
            }
            resultBuilder.append(currentChar);
        }

        return resultBuilder.toString();
    }

}
