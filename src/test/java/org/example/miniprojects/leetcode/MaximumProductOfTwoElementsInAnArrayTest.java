package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumProductOfTwoElementsInAnArrayTest {

    @Test
    public void sampleTest() {
        assertEquals(36, MaximumProductOfTwoElementsInAnArray.maxProduct(new int[]{10, 2, 5, 2}));
        assertEquals(12, MaximumProductOfTwoElementsInAnArray.maxProduct(new int[]{3, 4, 5, 2}));
        assertEquals(16, MaximumProductOfTwoElementsInAnArray.maxProduct(new int[]{1, 5, 4, 5}));
        assertEquals(12, MaximumProductOfTwoElementsInAnArray.maxProduct(new int[]{3, 7}));
    }

}