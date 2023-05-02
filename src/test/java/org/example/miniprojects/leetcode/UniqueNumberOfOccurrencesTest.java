package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueNumberOfOccurrencesTest {

    @Test
    public void sampleTest() {
        assertTrue(UniqueNumberOfOccurrences.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
        assertTrue(UniqueNumberOfOccurrences.uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}));
        assertFalse(UniqueNumberOfOccurrences.uniqueOccurrences(new int[]{1, 2}));
    }
}