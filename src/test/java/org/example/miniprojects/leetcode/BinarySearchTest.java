package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void searchTest() {
        assertEquals(4, BinarySearch.search((new int[]{-1,0,3,5,9,12}), 9));
        assertEquals(-1, BinarySearch.search((new int[]{-1,0,3,5,9,12}), 2));
    }
}