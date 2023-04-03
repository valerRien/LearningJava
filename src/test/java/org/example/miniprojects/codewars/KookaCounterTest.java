package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class KookaCounterTest {

    @Test
    public void sampleTest() {
        assertEquals(1, KookaCounter.kookaCounter("ha"));
        assertEquals(1, KookaCounter.kookaCounter("haha"));
        assertEquals(3, KookaCounter.kookaCounter("haHaha"));
        assertEquals(2, KookaCounter.kookaCounter("hahaHa"));
    }

    @Test
    public void noSound(){
        assertEquals(0, KookaCounter.kookaCounter(""));
    }
}