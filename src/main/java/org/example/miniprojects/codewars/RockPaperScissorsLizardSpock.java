package org.example.miniprojects.codewars;

import java.util.*;

public class RockPaperScissorsLizardSpock {

    private static Map<String, Set<String>> gameRules = new HashMap<>();

    static {
        gameRules.put("rock", new HashSet<>(Arrays.asList("scissors", "lizard")));
        gameRules.put("lizard", new HashSet<>(Arrays.asList("spock", "paper")));
        gameRules.put("spock", new HashSet<>(Arrays.asList("rock", "scissors")));
        gameRules.put("scissors", new HashSet<>(Arrays.asList("paper", "lizard")));
        gameRules.put("paper", new HashSet<>(Arrays.asList("rock", "spock")));
    }
    public static String rpsls(String player1, String player2){

        if (player1.equals(player2)) {
            return "Draw!";
        }

        if (gameRules.get(player1).contains(player2)) {
            return "Player 1 Won!";
        } else {
            return "Player 2 Won!";
        }
    }
}
