package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReformatTheStringTest {

    @Test
    public void sampleTest() {
        assertEquals("0a1b2c", ReformatTheString.reformat("a0b1c2"));
        assertEquals("c2o0v1i9d", ReformatTheString.reformat("covid2019"));
    }
}