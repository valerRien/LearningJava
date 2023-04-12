package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class FixStringCaseTest {

    @Test
    public void sampleTest() {
        assertEquals("code", FixStringCase.solve("code"));
        assertEquals("CODE", FixStringCase.solve("CODe"));
        assertEquals("code", FixStringCase.solve("COde"));
        assertEquals("code", FixStringCase.solve("Code"));
        assertEquals("", FixStringCase.solve(""));
    }
}