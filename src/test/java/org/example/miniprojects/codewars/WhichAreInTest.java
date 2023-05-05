package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class WhichAreInTest {

    @Test
    public void sampleTest() {
        assertArrayEquals(new String[]{"arp", "live", "strong"}, WhichAreIn.inArray(new String[]{"arp", "live", "strong"}, new String[]{"lively", "alive", "harp", "sharp", "armstrong"}));
    }
}