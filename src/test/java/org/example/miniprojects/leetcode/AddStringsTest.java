package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddStringsTest {

    @Test
    public void sampleTest() {
        assertEquals(134, Integer.parseInt(AddStrings.addStrings("11", "123")));
    }

    @Test
    public void sampleTest2() {
        assertEquals(533, Integer.parseInt(AddStrings.addStrings("456", "77")));
    }

    @Test
    public void emptyTest() {
        assertEquals(0, Integer.parseInt(AddStrings.addStrings("0", "0")));
    }

    @Test
    public void emptyTest3() {
        assertEquals(1111111111, Integer.parseInt(AddStrings.addStrings("1", "1".repeat(9) + "0")));
    }
}