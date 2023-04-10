package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeTheMorseCodeTest {

    @Test
    public void sampleTest() {
        assertEquals("HEY JUDE",DecodeTheMorseCode.decode(".... . -.--   .--- ..- -.. ."));
    }
}