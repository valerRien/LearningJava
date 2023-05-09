package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindLuckyIntegerInAnArrayTest {

    @Test
    public void sampleTest() {
        assertEquals(2, FindLuckyIntegerInAnArray.findLucky(new int[]{2, 2, 3, 4}));
        assertEquals(3, FindLuckyIntegerInAnArray.findLucky(new int[]{1, 2, 2, 3, 3, 3}));
        assertEquals(-1, FindLuckyIntegerInAnArray.findLucky(new int[]{2, 2, 2, 3, 3}));
    }

}