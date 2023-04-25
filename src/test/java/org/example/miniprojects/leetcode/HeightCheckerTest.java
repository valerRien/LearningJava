package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeightCheckerTest {

    @Test
    public void sampleTest() {
        assertEquals(3, HeightChecker.heightChecker(new int[]{1, 1, 4, 2, 1, 3}));
        assertEquals(5, HeightChecker.heightChecker(new int[]{5, 1, 2, 3, 4}));
        assertEquals(0, HeightChecker.heightChecker(new int[]{1, 2, 3, 4, 5}));
    }
}