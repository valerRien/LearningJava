package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class PositionsOfLargeGroupsTest {

    @Test
    public void sampleTest() {
        assertEquals("[[3, 6]]", PositionsOfLargeGroups.largeGroupPositions("abbxxxxzzy").toString());
        assertEquals("[[3, 5], [6, 9], [12, 14]]", PositionsOfLargeGroups.largeGroupPositions("abcdddeeeeaabbbcd").toString());
        assertEquals("[[0, 2]]", PositionsOfLargeGroups.largeGroupPositions("aaa").toString());
        assertEquals("[[0, 2], [3, 5]]", PositionsOfLargeGroups.largeGroupPositions("aaabbb").toString());
    }

    @Test
    public void emptyTest() {
        assertEquals("[]", PositionsOfLargeGroups.largeGroupPositions("abz").toString());
    }
}