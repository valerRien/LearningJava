package org.example.miniprojects.codewars;

import java.util.*;


public class AlphabetWar {
    public static String alphabetWar(String fight) {
        Map<Character, Integer> allChars = new HashMap<>();
        for (int i = 0; i < fight.length(); i++) {
            char currentChar = fight.charAt(i);
            if (!allChars.containsKey(currentChar)) {
                allChars.put(currentChar, 1);
            } else {
                int count = allChars.get(currentChar);
                count++;
                allChars.put(currentChar, count);
            }
        }

        int leftSidePoints = getPoints(allChars, "left");

        int rightSidePoints = getPoints(allChars, "right");

        return leftSidePoints == rightSidePoints ? "Let's fight again!" : leftSidePoints > rightSidePoints ? "Left side wins!" : "Right side wins!";
    }

    private static int getPoints(Map<Character, Integer> allChars, String side){

        int sum = 0;

        if (side.equals("left")) {
            sum += allChars.get('w') == null ? 0 : allChars.get('w') * 4;
            sum += allChars.get('p') == null ? 0 : allChars.get('p') * 3;
            sum += allChars.get('b') == null ? 0 : allChars.get('b') * 2;
            sum += allChars.get('s') == null ? 0 : allChars.get('s');
        }

        if (side.equals("right")) {
            sum += allChars.get('m') == null ? 0 : allChars.get('m') * 4;
            sum += allChars.get('q') == null ? 0 : allChars.get('q') * 3;
            sum += allChars.get('d') == null ? 0 : allChars.get('d') * 2;
            sum += allChars.get('z') == null ? 0 : allChars.get('z');
        }

        return sum;
    }
}
