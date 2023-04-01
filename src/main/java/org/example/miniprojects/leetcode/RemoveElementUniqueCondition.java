package org.example.miniprojects.leetcode;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementUniqueCondition {
    public int removeElement(int[] nums, int val) {
        /*
        ---------if no condition with custom judgement------------------
        nums = Arrays.stream(nums).filter(x -> x != val).toArray();
        return nums.length;
        */
        List<Integer> listOfNotVal = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                listOfNotVal.add(nums[i]);
            }
        }
        for (int i = 0; i < listOfNotVal.size(); i++) {
            nums[i] = listOfNotVal.get(i);
        }

        return listOfNotVal.size();
    }
}
