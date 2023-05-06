package org.example.miniprojects.leetcode;

import java.util.ArrayList;

public class CreateTargetArrayInTheGivenOrder {
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < index.length; i++) {
            resultList.add(index[i], nums[i]);
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
