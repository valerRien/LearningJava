package org.example.miniprojects.codewars;

public class FindTheIndexOfTheSecondOccurrenceOfALetterInAString {
    public static int secondSymbol(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                count++;
                if (count == 2) {
                    return i;
                }
            }
        }
        return -1;
    }
}
