package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Custom Judge!
 * Constraints:
 *
 * 1 <= nums.length <= 3 * 104
 * -100 <= nums[i] <= 100
 * nums is sorted in non-decreasing order.
 */

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void sampleTest() {
        assertEquals(2, RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{1,2,2}));
    }

    @Test
    public void sampleTest2() {
        assertEquals(5, RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}