package org.example.miniprojects.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FlippingAnImageTest {

    @Test
    public void sampleTest() {
        assertEquals(
                Arrays.deepToString(new int[][]{{1,0,0},{0,1,0},{1,1,1}}),
                Arrays.deepToString(FlippingAnImage.flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}})));
    }

    @Test
    public void sampleTest2() {
        assertEquals(
                Arrays.deepToString(new int[][]{{1,1,0,0},{0,1,1,0},{0,0,0,1},{1,0,1,0}}),
                Arrays.deepToString(FlippingAnImage.flipAndInvertImage(new int[][]{{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}})));
    }
}