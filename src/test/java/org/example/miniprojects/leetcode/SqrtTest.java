package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqrtTest {

    @Test
    public void sampleTest() {
        assertEquals(2, Sqrt.mySqrt(4));
        assertEquals(3, Sqrt.mySqrt(9));
        assertEquals(4, Sqrt.mySqrt(16));
    }

    @Test
    public void sampleTest2() {
        assertEquals(2, Sqrt.mySqrt(5));
        assertEquals(3, Sqrt.mySqrt(15));
        assertEquals(4, Sqrt.mySqrt(23));
    }
}