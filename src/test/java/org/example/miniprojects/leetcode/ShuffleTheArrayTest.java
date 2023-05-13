package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShuffleTheArrayTest {

    @Test
    public void sampleTest() {
        assertArrayEquals(new int[]{2, 3, 5, 4, 1, 7}, ShuffleTheArray.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3));
        assertArrayEquals(new int[]{1, 2, 1, 2}, ShuffleTheArray.shuffle(new int[]{1, 1, 2, 2}, 2));
    }

}