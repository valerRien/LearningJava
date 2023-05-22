package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class BuildASquareTest {

    @Test
    public void sampleTest() {
        assertEquals("+++\n+++\n+++", BuildASquare.generateShape(3));
    }

}