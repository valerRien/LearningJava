package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class BreakCamelCaseTest {

    @Test
    public void sampleTest() {
        assertEquals("camel Casing", BreakCamelCase.camelCase("camelCasing"));
        assertEquals("", BreakCamelCase.camelCase(""));
        assertEquals("java", BreakCamelCase.camelCase("java"));
    }

}