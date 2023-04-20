package org.example.miniprojects.leetcode;

public class SortArrayByParity {
    public static int[] sortArrayByParityII(int[] nums) {

        int tempIndex = 0, tempValue = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 != nums[i] % 2) {
                tempIndex = i;
                while (i % 2 != nums[tempIndex] % 2) {
                    tempIndex++;
                }
                tempValue = nums[i];
                nums[i] = nums[tempIndex];
                nums[tempIndex] = tempValue;
            }
        }

        return nums;
    }
}
