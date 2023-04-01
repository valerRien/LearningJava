package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Constraints:
 *
 * 0 <= nums.length <= 100
 * 0 <= nums[i] <= 50
 * 0 <= val <= 100
 *
 * Custom Judge:
 *
 * The judge will test your solution with the following code:
 *
 * int[] nums = [...]; // Input array
 * int val = ...; // Value to remove
 * int[] expectedNums = [...]; // The expected answer with correct length.
 *                             // It is sorted with no values equaling val.
 *
 * int k = removeElement(nums, val); // Calls your implementation
 *
 * assert k == expectedNums.length;
 * sort(nums, 0, k); // Sort the first k elements of nums
 * for (int i = 0; i < actualLength; i++) {
 *     assert nums[i] == expectedNums[i];
 */

public class RemoveElementUniqueConditionTest {

    @Test
    public void sampleTest() {
        assertEquals(2, RemoveElementUniqueCondition.removeElement((new int[]{0,1,2,2,2,2}), 2));
        assertEquals(1, RemoveElementUniqueCondition.removeElement((new int[]{0,3}), 3));
    }
}