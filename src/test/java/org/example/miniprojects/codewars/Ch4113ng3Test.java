package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * each .replaceAll() makes N runs
 */

public class Ch4113ng3Test {

    @Test
    public void sampleTest() {
        assertEquals("Ch4113ng3", Ch4113ng3.nerdify("Challenge"));
        assertEquals("Fund4m3nt41s", Ch4113ng3.nerdify("Fundamentals"));
    }
}