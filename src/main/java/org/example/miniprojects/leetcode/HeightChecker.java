package org.example.miniprojects.leetcode;

import java.util.Arrays;

public class HeightChecker {
    public static int heightChecker(int[] heights) {
        int[] sortedHeights = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sortedHeights);

        int countOfWrongIndexes = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sortedHeights[i]) {
                countOfWrongIndexes++;
            }
        }
        return countOfWrongIndexes;
    }
}
