package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class BackwardsReadPrimesTest {

    @Test
    public void sampleTest() {
        assertEquals("13 17 31 37 71 73 79 97", BackwardsReadPrimes.backwardsPrime(1, 100));
        assertEquals("9923 9931 9941 9967", BackwardsReadPrimes.backwardsPrime(9900, 10000));
    }

}