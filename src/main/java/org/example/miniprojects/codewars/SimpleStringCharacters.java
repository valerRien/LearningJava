package org.example.miniprojects.codewars;

public class SimpleStringCharacters {
    public static int[] Solve(String word) {
        int[] result = new int[]{0, 0, 0, 0};
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (currentChar >= 65 && currentChar <= 90) {
                result[0]++; //upper
            } else if (currentChar >= 97 && currentChar <= 122) {
                result[1]++; //lower
            } else if (currentChar >= 48 && currentChar <= 57) {
                result[2]++; //numbers
            } else {
                result[3]++;
            }
        }
        return result;
    }
}
