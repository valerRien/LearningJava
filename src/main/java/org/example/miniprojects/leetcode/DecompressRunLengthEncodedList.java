package org.example.miniprojects.leetcode;

import java.util.*;

public class DecompressRunLengthEncodedList {
    public static int[] decompressRLElist(int[] nums) {
        List<Integer> decompressed = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i = i + 2) {
            for (int j = nums[i]; j > 0; j--) {
                decompressed.add(nums[i + 1]);
            }
        }

        int[] result = new int[decompressed.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = decompressed.get(i);
        }
        return result;
    }
}
