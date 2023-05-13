package org.example.miniprojects.leetcode;

public class ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int resultIndex = 0;
        for (int i = 0; i < nums.length - n; i++) {
            result[resultIndex] = nums[i];
            result[++resultIndex] = nums[i + n];
            ++resultIndex;
        }
        return result;
    }
}
