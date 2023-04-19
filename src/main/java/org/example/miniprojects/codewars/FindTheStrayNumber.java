package org.example.miniprojects.codewars;

public class FindTheStrayNumber {
    public static int stray(int[] numbers) {
        int same = 0;
        if (numbers[0] == numbers[1]) {
            same = numbers[0];
        } else {
            same = numbers[2];
        }
        for (int number : numbers) {
            if (number != same) {
                return number;
            }
        }
        return 0;
    }
}
