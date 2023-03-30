package org.example.miniprojects.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PlusOneTest {

    private static PlusOne instance = new PlusOne();

    @Test
    public void plusOne() {
        assertEquals(Arrays.toString(new int[]{1,0}), Arrays.toString(instance.plusOne(new int[]{9})));
    }

    @Test
    public void plusOne2() {
        assertEquals(Arrays.toString(new int[]{1}), Arrays.toString(instance.plusOne(new int[]{0})));
    }

    @Test
    public void plusOne3() {
        assertEquals(Arrays.toString(new int[]{1,2,3}), Arrays.toString(instance.plusOne(new int[]{1,2,2})));
    }
}