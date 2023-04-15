package org.example.miniprojects.leetcode;

import java.util.*;


public class SelfDividingNumbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> resultList = new ArrayList<>();
        String currentNumber = "";
        boolean shouldBeAdded = false;
        for (int i = left; i <= right; i++) {
            currentNumber = String.valueOf(i);
            for (int j = 0; j < currentNumber.length(); j++) {
                if (currentNumber.charAt(j) == '0') {
                    shouldBeAdded = false;
                    break;
                }
                if (i % (currentNumber.charAt(j) - '0') != 0) {
                    shouldBeAdded = false;
                    break;
                }
                shouldBeAdded = true;
            }
            if (shouldBeAdded) resultList.add(i);
        }
        return resultList;
    }
}
