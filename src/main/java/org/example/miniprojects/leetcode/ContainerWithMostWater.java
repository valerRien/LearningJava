package org.example.miniprojects.leetcode;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        if (height.length < 2) {
            return 0;
        }

        int result = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            int minHeight = Math.min(height[i], height[j]);
            int multiplier = j - i;
            result = Math.max(result, minHeight * multiplier);
            if (height[i] < height[j]) {
                i++;
            } else if (height[i] > height[j]) {
                j--;
            } else {
                i++;
                j--;
            }
        }

        return result;
    }
}
