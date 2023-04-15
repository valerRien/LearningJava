package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SelfDividingNumbersTest {

    @Test
    public void sampleTest() {
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]", SelfDividingNumbers.selfDividingNumbers(1, 22).toString());
    }

    @Test
    public void sampleTest2() {
        assertEquals("[48, 55, 66, 77]", SelfDividingNumbers.selfDividingNumbers(47, 85).toString());
    }
}