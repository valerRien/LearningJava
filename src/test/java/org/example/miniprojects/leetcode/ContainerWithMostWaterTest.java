package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerWithMostWaterTest {

    @Test
    public void sampleTest() {
        assertEquals(49, ContainerWithMostWater.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    @Test
    public void sampleTest2() {
        assertEquals(1, ContainerWithMostWater.maxArea(new int[]{1,1}));
    }

    @Test
    public void sampleTest3() {
        assertEquals(1, ContainerWithMostWater.maxArea(new int[]{1,1}));
    }

    @Test
    public void oneHeight() {
        assertEquals(0, ContainerWithMostWater.maxArea(new int[]{1}));
    }

    @Test
    public void empty() {
        assertEquals(0, ContainerWithMostWater.maxArea(new int[]{}));
    }

    @Test
    public void bigBoy() {
        assertEquals(15, ContainerWithMostWater.maxArea(new int[]{5, 2, 10, 5}));
    }
}