package org.example.miniprojects.codewars;

import java.util.HashSet;
import java.util.Set;

public class MultiplesOfThreeOrFive {
    public static int solution(int number) {
        Set<Integer> divide = new HashSet<>();
        fillSet(divide, (number - 1) / 3, 3);
        fillSet(divide, (number - 1) / 5, 5);
        return divide.stream().mapToInt(Integer::intValue).sum();
    }

    private static void fillSet(Set<Integer> divide, int count, int multiply) {
        for (int i = 1; i <= count; i++) {
            divide.add(i * multiply);
        }
    }
}
