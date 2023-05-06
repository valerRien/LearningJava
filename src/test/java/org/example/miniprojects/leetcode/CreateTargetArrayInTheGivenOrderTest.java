package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class CreateTargetArrayInTheGivenOrderTest {

    @Test
    public void sampleTest() {
        assertArrayEquals(new int[]{0, 4, 1, 3, 2}, CreateTargetArrayInTheGivenOrder.createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1}));
    }

}