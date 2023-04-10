package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class KeypadHorrorTest {

    @Test
    public void sampleTest() {
        assertEquals("0123456789", KeypadHorror.computerToPhone("0789456123"));
        assertEquals("000", KeypadHorror.computerToPhone("000"));
        assertEquals("34567", KeypadHorror.computerToPhone("94561"));
        assertEquals("", KeypadHorror.computerToPhone(""));
    }
}