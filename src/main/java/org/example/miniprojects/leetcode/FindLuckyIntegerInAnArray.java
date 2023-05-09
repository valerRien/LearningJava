package org.example.miniprojects.leetcode;

import java.util.*;

public class FindLuckyIntegerInAnArray {
    public static int findLucky(int[] arr) {

        Map<Integer, Integer> digitAndItsCount = new HashMap<>();

        for (int digit : arr) {
            if (!digitAndItsCount.containsKey(digit)) {
                digitAndItsCount.put(digit, 1);
            } else {
                digitAndItsCount.put(digit, digitAndItsCount.get(digit) + 1);
            }
        }

        int luckyNumber = -1;
        for (Map.Entry<Integer, Integer> valueAndCount : digitAndItsCount.entrySet()) {
            if (valueAndCount.getKey() == valueAndCount.getValue() && valueAndCount.getKey() > luckyNumber) {
                luckyNumber = valueAndCount.getKey();
            }
        }

        return luckyNumber;
    }
}
