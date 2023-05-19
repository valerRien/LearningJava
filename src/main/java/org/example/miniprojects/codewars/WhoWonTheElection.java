package org.example.miniprojects.codewars;

import java.util.*;

public class WhoWonTheElection {
    public static String getWinner(final List<String> listOfBallots) {
        Map<String, Integer> namesAndVotes = new HashMap<>();

        for (int i = 0; i < listOfBallots.size(); i++) {
            if (!namesAndVotes.containsKey(listOfBallots.get(i))) {
                namesAndVotes.put(listOfBallots.get(i), 1);
            } else {
                namesAndVotes.put(listOfBallots.get(i), namesAndVotes.get(listOfBallots.get(i)) + 1);
            }
        }

        String result = null;
        int votes = 0;
        for (Map.Entry<String, Integer> pair : namesAndVotes.entrySet()) {
            if (pair.getValue() > votes) {
                result = pair.getKey();
                votes = pair.getValue();
            }
        }

        if (votes <= listOfBallots.size() / 2) return null;
        else return result;
    }
}
