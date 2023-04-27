package org.example.miniprojects.leetcode;

public class FindNumbersWithEvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int evenLengthCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (String.valueOf(nums[i]).length() % 2 == 0) {
                evenLengthCounter++;
            }
        }

        return evenLengthCounter;
    }
}
