package org.example.miniprojects.codewars;

public class KillerGarageDoor {
    public static String run(String events) {
        char currentEvent;
        int count = 0;
        boolean isOpening = false, shouldBeOpened = false, pause = false;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < events.length(); i++) {
            currentEvent = events.charAt(i);

            if (currentEvent == '.') {
                if (isOpening && count < 5 && !pause &&!shouldBeOpened) {
                    count++;
                } else if ((!isOpening || shouldBeOpened) && count > 0 &&!pause) {
                    count--;
                }
                result.append(count);
            }

            if (currentEvent == 'P') {
                if (pause == true) {
                    pause = false;
                    result.append(count);
                    continue;
                }
                if (count == 5) {
                    count--;
                    isOpening = false;
                } else if (count == 0) {
                    count++;
                    isOpening = true;
                } else {
                    pause = true;
                }

                result.append(count);
            }

            if (currentEvent == 'O') {
                shouldBeOpened = true;
                count--;
                result.append(count);
            }

        }

        return result.toString();
    }
}
