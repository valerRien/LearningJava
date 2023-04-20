package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseOnlyLettersTest {

    @Test
    public void sampleTest() {
        assertEquals("a-b!c", ReverseOnlyLetters.reverseOnlyLetters("c-b!a"));
        assertEquals("j-Ih-gfE-dCba", ReverseOnlyLetters.reverseOnlyLetters("a-bC-dEf-ghIj"));
        assertEquals("dc-ba", ReverseOnlyLetters.reverseOnlyLetters( "ab-cd"));
    }

    @Test
    public void notSampleTest() {
        assertEquals("-!", ReverseOnlyLetters.reverseOnlyLetters("-!"));

    }
}