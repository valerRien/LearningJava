package org.example.miniprojects.codewars;

public class CountingSheep {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (boolean isPresent : arrayOfSheeps) {
            if (isPresent) {
                count++;
            }
        }
        return count;
    }
}
