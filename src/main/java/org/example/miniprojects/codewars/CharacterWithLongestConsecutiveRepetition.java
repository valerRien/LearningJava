package org.example.miniprojects.codewars;

public class CharacterWithLongestConsecutiveRepetition {
    public static Object[] longestRepetition(String s) {

        if (s.isEmpty()) return new Object[]{"", 0};

        int currentRow = 1, maxRow = 1;
        char currentChar = s.charAt(0), highestOccurrenceChar = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (currentChar == s.charAt(i)) {
                currentRow++;
            } else {
                currentRow = 1;
            }
            if (currentRow > maxRow) {
                maxRow = currentRow;
                highestOccurrenceChar = currentChar;
            }
            currentChar = s.charAt(i);
        }
        return new Object[]{String.valueOf(highestOccurrenceChar), maxRow};
    }
}
