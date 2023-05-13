package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class RunningSumOf1dArrayTest {

    @Test
    public void sampleTest() {
        assertArrayEquals(new int[]{1, 3, 6, 10}, RunningSumOf1dArray.runningSum(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, RunningSumOf1dArray.runningSum(new int[]{1, 1, 1, 1, 1}));
        assertArrayEquals(new int[]{3, 4, 6, 16, 17}, RunningSumOf1dArray.runningSum(new int[]{3, 1, 2, 10, 1}));
    }

}