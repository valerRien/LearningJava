package org.example.miniprojects.leetcode;

import java.util.*;

public class KidsWithTheGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> resultList = new ArrayList<>();

        int max = -1;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) max = candies[i];
        }

        for (int i = 0; i < candies.length; i++) {
            resultList.add(candies[i] + extraCandies >= max);
        }

        return resultList;
    }
}
