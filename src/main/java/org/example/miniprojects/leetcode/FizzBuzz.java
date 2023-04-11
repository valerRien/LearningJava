package org.example.miniprojects.leetcode;

import java.util.*;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> resultList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                resultList.add("FizzBuzz");
            } else if (i % 5 == 0) {
                resultList.add("Buzz");
            } else if (i % 3 == 0) {
                resultList.add("Fizz");
            } else {
                resultList.add(String.valueOf(i));
            }
        }

        return resultList;
    }
}
