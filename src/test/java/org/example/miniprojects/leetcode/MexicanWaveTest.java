package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MexicanWaveTest {

    @Test
    public void sampleTest() {
        assertArrayEquals(new String[]{"Hello", "hEllo", "heLlo", "helLo", "hellO"}, MexicanWave.wave("hello"));
    }

}