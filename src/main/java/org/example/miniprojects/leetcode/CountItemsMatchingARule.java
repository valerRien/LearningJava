package org.example.miniprojects.leetcode;

import java.util.*;

public class CountItemsMatchingARule {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        Map<String, Integer> keys = new HashMap<>();
        keys.put("type", 0);
        keys.put("color", 1);
        keys.put("name", 2);

        int result = 0;
        for (List<String> item : items) {
            if (item.get(keys.get(ruleKey)).equals(ruleValue)) result++;
        }

        return result;
    }
}
