package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Constraints:
 *
 * 0 <= nums.length <= 100
 * 0 <= nums[i] <= 50
 * 0 <= val <= 100
 */

public class RemoveElementUniqueConditionTest {

    @Test
    public void sampleTest() {
        assertEquals(2, RemoveElementUniqueCondition.removeElement((new int[]{0,1,2,2,2,2}), 2));
        assertEquals(1, RemoveElementUniqueCondition.removeElement((new int[]{0,3}), 3));
    }
}