package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoinsTest {

    @Test
    public void sampleTest() {
        assertEquals(-1, Coins.coins(1, 1));
        assertEquals(1, Coins.coins(2, 3));
        assertEquals(-1, Coins.coins(2, 2));
    }
}