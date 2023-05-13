package org.example.miniprojects.leetcode;

public class MaximumProductOfTwoElementsInAnArray {
    public static int maxProduct(int[] nums) {
        int firstMax = 0, secondMax = 0;
        for (int num : nums) {
            if (num >= secondMax) {
                if (num >= firstMax) {
                    secondMax = firstMax;
                    firstMax = num;
                } else {
                    secondMax = num;
                }
            }
        }

        return (firstMax - 1) * (secondMax - 1);
    }
}
