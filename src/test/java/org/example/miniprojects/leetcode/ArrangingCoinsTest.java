package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrangingCoinsTest {

    @Test
    public void sampleTest() {
        assertEquals(2, ArrangingCoins.arrangeCoins(5));
        assertEquals(3, ArrangingCoins.arrangeCoins(8));
        assertEquals(4, ArrangingCoins.arrangeCoins(10));
        assertEquals(4, ArrangingCoins.arrangeCoins(11));
    }

    @Test
    public void sampleTest2() {
        assertEquals(0, ArrangingCoins.arrangeCoins(0));
        assertEquals(1, ArrangingCoins.arrangeCoins(1));
    }
}