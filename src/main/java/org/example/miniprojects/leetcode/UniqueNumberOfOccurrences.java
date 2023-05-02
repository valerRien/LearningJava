package org.example.miniprojects.leetcode;

import java.util.*;

public class UniqueNumberOfOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> valueAndItsOccurrences = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!valueAndItsOccurrences.containsKey(arr[i])) {
                valueAndItsOccurrences.put(arr[i], 1);
            } else {
                valueAndItsOccurrences.put(arr[i], valueAndItsOccurrences.get(arr[i]) + 1);
            }
        }
        Set<Integer> unique = new HashSet<>(valueAndItsOccurrences.values());

        return unique.size() == valueAndItsOccurrences.size();
    }
}
