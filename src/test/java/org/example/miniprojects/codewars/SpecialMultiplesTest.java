package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class SpecialMultiplesTest {

    @Test
    public void sampleTest() {
        assertEquals(6, SpecialMultiples.countSpecMult(3, 200));
        assertEquals(16, SpecialMultiples.countSpecMult(2, 100));
        assertEquals(0, SpecialMultiples.countSpecMult(4, 100));
    }

}