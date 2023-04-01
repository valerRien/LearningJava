package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInsertPositionTest {

    private static SearchInsertPosition instance = new SearchInsertPosition();

    @Test
    public void sampleTest() {
        assertEquals(2, instance.searchInsert((new int[]{1,3,5,6}), 5));
        assertEquals(4, instance.searchInsert((new int[]{1,3,5,6}), 7));
    }
}