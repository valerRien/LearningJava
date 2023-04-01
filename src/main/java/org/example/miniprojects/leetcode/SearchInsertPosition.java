package org.example.miniprojects.leetcode;

import java.util.Arrays;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
       int lowestIndex = 0, mid;
       int highestIndex = nums.length - 1;

       while (lowestIndex <= highestIndex) {
           mid = lowestIndex + (highestIndex - lowestIndex) / 2;
           if (nums[mid] < target) {
               lowestIndex = mid + 1;
           } else if (nums[mid] > target) {
               highestIndex = mid - 1;
           } else if (nums[mid] == target) {
               return mid;
           }
       }

       return lowestIndex;
    }
}
