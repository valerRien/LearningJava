package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfASequenceTest {

    @Test
    public void sampleTest() {
        assertEquals(2, SumOfASequence.sequenceSum(2, 2, 2));
        assertEquals(12, SumOfASequence.sequenceSum(2, 6, 2));
        assertEquals(15, SumOfASequence.sequenceSum(1, 5, 1));
    }

    @Test
    public void overEndStepsTest() {
        assertEquals(5, SumOfASequence.sequenceSum(1, 5, 3));
    }

    @Test
    public void startGreaterEndTest() {
        assertEquals(0, SumOfASequence.sequenceSum(5, 1, 3));
    }

}