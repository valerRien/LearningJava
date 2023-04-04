package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberTest {

    @Test
    public void sampleTest() {
        assertEquals(0, SingleNumber.singleNumber(new int[]{}));
        assertEquals(2, SingleNumber.singleNumber(new int[]{1,1,2,3,3}));
    }
}