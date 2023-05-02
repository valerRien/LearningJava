package org.example.miniprojects.leetcode;

public class SignOfTheProductOfAnArray {
    public static int arraySign(int[] nums) {
        int countNegative = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                countNegative++;
                continue;
            }
            if (nums[i] == 0) {
                return 0;
            }
        }

        return countNegative % 2 == 0 ? 1 : -1;
    }
}
