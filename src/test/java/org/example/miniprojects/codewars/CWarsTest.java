package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class CWarsTest {

    @Test
    public void sampleTest() {
        assertEquals("C.Wars", CWars.initials("code wars"));
    }

    @Test
    public void fenceTest() {
        assertEquals("C.Wars", CWars.initials("code wArS"));
    }

    @Test
    public void longerNameTest() {
        assertEquals("B.H.Obama", CWars.initials("barrack hussain Obama"));
    }
}