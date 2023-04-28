package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class DigitalRootTest {

    @Test
    public void sampleTest() {
        assertEquals(7, DigitalRoot.digital_root(16));
        assertEquals(6, DigitalRoot.digital_root(456));
    }
}