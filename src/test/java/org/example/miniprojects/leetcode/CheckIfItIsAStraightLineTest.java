package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckIfItIsAStraightLineTest {

    @Test
    public void sampleTest() {
        assertTrue(CheckIfItIsAStraightLine.checkStraightLine(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}}));
        assertFalse(CheckIfItIsAStraightLine.checkStraightLine(new int[][]{{1, 1}, {2, 2}, {3, 4}, {4, 5}}));
        assertTrue(CheckIfItIsAStraightLine.checkStraightLine(new int[][]{{0, 0}, {0, 1}, {0, -1}}));
        assertTrue(CheckIfItIsAStraightLine.checkStraightLine(new int[][]{{2, 1}, {4, 2}, {6, 3}}));
    }
}