package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class CamelCaseMethodTest {

    @Test
    public void sampleTest() {
        assertEquals("TestCase", CamelCaseMethod.camelCase("test case"));
    }

    @Test
    public void testThreeWords() {
        assertEquals("CamelCaseMethod", CamelCaseMethod.camelCase("camel case method"));
    }

    @Test
    public void testSingleLetter() {
        assertEquals("Z", CamelCaseMethod.camelCase("z"));
    }

    @Test
    public void testTrailingSpace() {
        assertEquals("SayHello", CamelCaseMethod.camelCase("say hello "));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", CamelCaseMethod.camelCase(""));
    }
}