package org.example.miniprojects.codewars;

public class KillerGarageDoor {
    public static String run(String events) {
        int isOpening = 0, direction = 1;
        boolean moving = false;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < events.length(); i++) {
            char current = events.charAt(i);

            if (current == 'O') {
                direction *= -1;
            } else if (current == 'P') {
                moving = !moving;
            }
            if (moving) {
                isOpening += direction;
            }
            if (isOpening % 5 == 0) {
                moving = false;
                direction = isOpening == 0 ? 1 : -1;
            }
            result.append(isOpening);
        }
        return result.toString();
    }
}
