package org.example.miniprojects.codewars;

public class BuildTower {
    public static String[] towerBuilder(int nFloors) {
        String[] tower = new String[nFloors];

        if (nFloors == 0) {
            return tower;
        }

        StringBuilder sb = new StringBuilder();
        int maxLength = nFloors * 2 - 1;
        int starsLength, spacesLength, indexCounter = 0;

        for (int i = 1; i <= maxLength; i += 2) {
            starsLength = i;
            spacesLength = maxLength - starsLength;
            sb.append(" ".repeat(spacesLength / 2));
            sb.append("*".repeat(starsLength));
            sb.append(" ".repeat(spacesLength / 2));
            tower[indexCounter] = sb.toString();
            indexCounter++;
            sb.delete(0, sb.length());
        }

        return tower;
    }
}
