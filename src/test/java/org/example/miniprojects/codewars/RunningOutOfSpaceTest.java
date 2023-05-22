package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class RunningOutOfSpaceTest {

    @Test
    public void sampleTest() {
        assertArrayEquals(new String[]{"i", "ihave", "ihaveno", "ihavenospace"}, RunningOutOfSpace.spacey(new String[]{"i", "have", "no", "space"}));
    }

}