package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheWeakestRowsInAMatrixTest {

    private TheWeakestRowsInAMatrix instance = new TheWeakestRowsInAMatrix();

    @Test
    public void sampleTest() {
        assertArrayEquals(new int[]{2, 0, 3}, instance.kWeakestRows(new int[][]{
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}}, 3));
    }
}