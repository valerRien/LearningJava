package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddBinaryTest {

    private static AddBinary instance = new AddBinary();

    @Test
    public void addBinary() {
        assertEquals("100", instance.addBinary("11", "1"));
    }

    @Test
    public void addBinary2() {
        assertEquals("10101", instance.addBinary("1010", "1011"));
    }
}