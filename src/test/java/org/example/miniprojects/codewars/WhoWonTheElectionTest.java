package org.example.miniprojects.codewars;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class WhoWonTheElectionTest {

    @Test
    public void sampleTest() {
        assertEquals("A", WhoWonTheElection.getWinner(List.of("A")));
        assertEquals("A", WhoWonTheElection.getWinner(List.of("A", "A", "A", "B", "B", "B", "A")));
    }

}