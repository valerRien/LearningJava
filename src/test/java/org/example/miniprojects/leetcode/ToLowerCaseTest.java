package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ToLowerCaseTest {

    @Test
    public void sampleTest() {
        assertEquals("hello", ToLowerCase.toLowerCase("HellO"));
        assertEquals("hello", ToLowerCase.toLowerCase("heLLO"));
        assertEquals("aazz", ToLowerCase.toLowerCase("aAzZ"));
    }
}