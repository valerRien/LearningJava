package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryToTextTest {

    @Test
    public void sampleTest() {
        assertEquals("Hello", BinaryToText.binaryToText("0100100001100101011011000110110001101111"));
        assertEquals("", BinaryToText.binaryToText(""));
    }

}