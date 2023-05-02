package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SignOfTheProductOfAnArrayTest {

    @Test
    public void sampleTest() {
        assertEquals(1, SignOfTheProductOfAnArray.arraySign(new int[]{-1, -2, -3, -4, 3, 2, 1}));
        assertEquals(0, SignOfTheProductOfAnArray.arraySign(new int[]{-1, -2, -3, 0, 3, 2, 1}));
        assertEquals(-1, SignOfTheProductOfAnArray.arraySign(new int[]{-1, -2, -3, 3, 2, 1}));
    }
}