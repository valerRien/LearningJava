package org.example.miniprojects.codewars;

public class FindTheParityOutlier {
    public static int find(int[] integers) {
        boolean isEven = Math.abs(integers[0] % 2) + Math.abs(integers[1] % 2) + Math.abs(integers[2] % 2) <= 1;
        for (int integer : integers) {
            if (isEven & integer % 2 != 0) {
                return integer;
            }

            if (!isEven & integer % 2 == 0) {
                return integer;
            }
        }

        return 0;
    }
}
