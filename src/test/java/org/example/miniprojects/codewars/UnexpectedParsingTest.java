package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnexpectedParsingTest {

    @Test
    public void test() {
        assertEquals("busy", UnexpectedParsing.getStatus(true).get("status"));
        assertEquals("available", UnexpectedParsing.getStatus(false).get("status"));
    }
}