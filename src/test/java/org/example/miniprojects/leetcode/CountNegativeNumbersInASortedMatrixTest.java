package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountNegativeNumbersInASortedMatrixTest {

    @Test
    public void sampleTest() {
        assertEquals(8, CountNegativeNumbersInASortedMatrix.countNegatives(new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}}));
        assertEquals(0, CountNegativeNumbersInASortedMatrix.countNegatives(new int[][]{{3, 2}, {1, 0}}));
    }
}