package org.example.miniprojects.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FindFirstAndLastPositionOfElementInSortedArrayTest {

    @Test
    public void sampleTest() {
        assertEquals("[3, 4]", Arrays.toString(FindFirstAndLastPositionOfElementInSortedArray.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
    }

    @Test
    public void sampleTest2() {
        assertEquals("[3, 5]", Arrays.toString(FindFirstAndLastPositionOfElementInSortedArray.searchRange(new int[]{5, 7, 7, 8, 8, 8, 10}, 8)));
    }
}