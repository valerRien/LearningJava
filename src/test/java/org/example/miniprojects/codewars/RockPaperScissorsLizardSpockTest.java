package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class RockPaperScissorsLizardSpockTest {

    @Test
    public void player1Wins() {
        assertEquals("Player 1 Won!", RockPaperScissorsLizardSpock.rpsls("rock", "lizard"));
        assertEquals("Player 1 Won!", RockPaperScissorsLizardSpock.rpsls("paper", "rock"));
        assertEquals("Player 1 Won!", RockPaperScissorsLizardSpock.rpsls("scissors", "lizard"));
        assertEquals("Player 1 Won!", RockPaperScissorsLizardSpock.rpsls("lizard", "paper"));
        assertEquals("Player 1 Won!", RockPaperScissorsLizardSpock.rpsls("spock", "rock"));
    }

    @Test
    public void player2Wins() {
        assertEquals("Player 2 Won!", RockPaperScissorsLizardSpock.rpsls("lizard","scissors"));
        assertEquals("Player 2 Won!", RockPaperScissorsLizardSpock.rpsls("spock","lizard"));
        assertEquals("Player 2 Won!", RockPaperScissorsLizardSpock.rpsls("paper","lizard"));
        assertEquals("Player 2 Won!", RockPaperScissorsLizardSpock.rpsls("scissors","spock"));
        assertEquals("Player 2 Won!", RockPaperScissorsLizardSpock.rpsls("rock","spock"));
    }

    @Test
    public void draws() {
        assertEquals("Draw!", RockPaperScissorsLizardSpock.rpsls("rock", "rock"));
        assertEquals("Draw!", RockPaperScissorsLizardSpock.rpsls("spock", "spock"));
    }
}