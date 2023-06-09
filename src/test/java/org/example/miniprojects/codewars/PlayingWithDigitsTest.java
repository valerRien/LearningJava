package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayingWithDigitsTest {

    @Test
    public void sampleTest() {
        assertEquals(1, PlayingWithDigits.digPow(89, 1));
        assertEquals(-1, PlayingWithDigits.digPow(92, 1));
        assertEquals(51, PlayingWithDigits.digPow(46288, 3));
    }
}