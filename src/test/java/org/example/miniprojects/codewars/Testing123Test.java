package org.example.miniprojects.codewars;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Testing123Test {

    @Test
    public void sampleTest() {
        assertEquals("[1: a, 2: b, 3: c]", Testing123.number(Arrays.asList("a", "b", "c")).toString());
    }

    @Test
    public void emptyTest() {
        assertEquals("[]", Testing123.number(Arrays.asList()).toString());
    }

}