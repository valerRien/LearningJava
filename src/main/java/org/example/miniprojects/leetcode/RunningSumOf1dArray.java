package org.example.miniprojects.leetcode;

public class RunningSumOf1dArray {
    public static int[] runningSum(int[] nums) {
        int sumOfPrevNums = 0, temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = nums[i];
            nums[i] += sumOfPrevNums;
            sumOfPrevNums += temp;
        }

        return nums;
    }
}
