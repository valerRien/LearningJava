package org.example.miniprojects.leetcode;

public class HowManyNumbersAreSmallerThanCurrentNumber {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int lessCount = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j == i) {
                    continue;
                }

                if (nums[j] < nums[i]) {
                    lessCount++;
                }
            }
            result[i] = lessCount;
            lessCount = 0;
        }

        return result;
    }
}
