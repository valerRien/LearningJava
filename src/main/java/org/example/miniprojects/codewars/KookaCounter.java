package org.example.miniprojects.codewars;

import java.util.Arrays;

public class KookaCounter {
    public static int kookaCounter(final String laughing) {
        if (laughing.length() == 0) {
            return 0;
        }
        String[] split = laughing.split("a");
        if (split.length == 1) {
            return 1;
        }
        int kookaCounter = 1;
        String currentBirdSound = split[0];
        for (int i = 1; i < split.length; i++) {
            if (!currentBirdSound.equals(split[i])) {
                kookaCounter++;
                currentBirdSound = split[i];
            }
        }
        return kookaCounter;
    }
}
