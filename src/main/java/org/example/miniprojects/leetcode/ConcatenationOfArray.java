package org.example.miniprojects.leetcode;

public class ConcatenationOfArray {
    public static int[] getConcatenation(int[] nums) {

        int[] result = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[i + nums.length] = nums[i];
        }

        return result;
    }
}
