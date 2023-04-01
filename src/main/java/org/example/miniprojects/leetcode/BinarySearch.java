package org.example.miniprojects.leetcode;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int lowest = 0, mid, highest = nums.length - 1;

        while (lowest <= highest) {
            mid = lowest + (highest - lowest) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                highest = mid - 1;
            } else if (nums[mid] < target) {
                lowest = mid + 1;
            }
        }
        return -1;
    }
}
