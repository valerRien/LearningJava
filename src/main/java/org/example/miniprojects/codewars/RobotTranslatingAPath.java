package org.example.miniprojects.codewars;

public class RobotTranslatingAPath {
    public static String walk(String path) {
        if (path.isEmpty()) {
            return "Paused";
        }
        StringBuilder result = new StringBuilder();
        int rowCharsCounter = 0;
        for (int i = 0; i < path.length(); i++) {
            char currentChar = path.charAt(i);
            while (i < path.length() && path.charAt(i) == currentChar) {
                rowCharsCounter++;
                i++;
            }
            i--;

            result.append(getNavigation(currentChar, rowCharsCounter)).append("\n");
            rowCharsCounter = 0;
        }

        return result.toString().trim();
    }

    private static String getNavigation(char c, int rowCharsCounter) {
        StringBuilder builder = new StringBuilder();
        String direction = "";
        switch (c) {
            case '^':
                direction = "up";
                break;
            case '>':
                direction = "right";
                break;
            case '<':
                direction = "left";
                break;
            case 'v':
                direction = "down";
                break;
        }
        builder.append("Take ").append(rowCharsCounter).append(rowCharsCounter > 1 ? " steps " : " step ").append(direction);
        return builder.toString();
    }
}
