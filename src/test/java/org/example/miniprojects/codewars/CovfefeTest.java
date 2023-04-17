package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class CovfefeTest {

    @Test
    public void sampleTest() {
        assertEquals("one covfefe", Covfefe.covfefe("one coverage"));
        assertEquals("one covfefe", Covfefe.covfefe("one"));
    }
}