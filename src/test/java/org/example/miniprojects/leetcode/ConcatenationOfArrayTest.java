package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConcatenationOfArrayTest {

    @Test
    public void sampleTest() {
        assertArrayEquals(new int[]{1, 2, 1, 1, 2, 1}, ConcatenationOfArray.getConcatenation(new int[]{1, 2, 1}));
    }

}