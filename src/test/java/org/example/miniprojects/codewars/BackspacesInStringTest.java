package org.example.miniprojects.codewars;

import org.example.miniprojects.codewars.BackspacesInString;
import org.junit.Test;

import static org.junit.Assert.*;

public class BackspacesInStringTest {

    @Test
    public void sampleTest() {
        assertEquals("ac", BackspacesInString.cleanString("abc#D##c"));
        assertEquals("a", BackspacesInString.cleanString("abc#D##c#"));
        assertEquals("aebf", BackspacesInString.cleanString("aec#D#c#bc#f"));
        assertEquals("", BackspacesInString.cleanString("abc##d######"));
        assertEquals("", BackspacesInString.cleanString("#######"));
        assertEquals("", BackspacesInString.cleanString(""));
    }
}