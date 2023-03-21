package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MissingNumberTest {

    @Test
    public void sampleTest() {
        assertEquals(2, MissingNumber.missingNumber(new int[]{3, 0 , 1}));
    }

    @Test
    public void zeroOutputTest() {
        assertEquals(0, MissingNumber.missingNumber(new int[]{1}));
    }


}