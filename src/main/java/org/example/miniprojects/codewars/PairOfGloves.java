package org.example.miniprojects.codewars;

import java.util.*;

public class PairOfGloves {
    public static int numberOfPairs(String[] gloves) {
        if (gloves == null || gloves.length == 0) {
            return 0;
        }
        Map<String, Integer> colorAndCount = new HashMap<>();

        for (int i = 0; i < gloves.length; i++) {
            if (!colorAndCount.containsKey(gloves[i])) {
                colorAndCount.put(gloves[i], 1);
            } else {
                colorAndCount.put(gloves[i], colorAndCount.get(gloves[i]) + 1);
            }
        }

        int result = 0;
        for (Integer key : colorAndCount.values()) {
            result += key / 2;
        }
        return result;
    }
}
