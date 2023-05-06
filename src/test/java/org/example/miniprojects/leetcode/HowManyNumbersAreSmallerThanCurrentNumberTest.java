package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;


/**
 *Constraints:
 * 2 <= nums.length <= 500
 * 0 <= nums[i] <= 100
 */
public class HowManyNumbersAreSmallerThanCurrentNumberTest {

    @Test
    public void sampleTest() {
        assertArrayEquals(new int[]{4, 0, 1, 1, 3}, HowManyNumbersAreSmallerThanCurrentNumber.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3}));
        assertArrayEquals(new int[]{2, 1, 0, 3}, HowManyNumbersAreSmallerThanCurrentNumber.smallerNumbersThanCurrent(new int[]{6, 5, 4, 8}));
        assertArrayEquals(new int[]{0, 0, 0, 0}, HowManyNumbersAreSmallerThanCurrentNumber.smallerNumbersThanCurrent(new int[]{7, 7, 7, 7}));
    }
}