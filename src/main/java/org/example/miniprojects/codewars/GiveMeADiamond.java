package org.example.miniprojects.codewars;

public class GiveMeADiamond {
    public static String print(int n) {
        if (n <= 0 || n % 2 == 0) return null;
        StringBuilder resultBuilder = new StringBuilder();
        int spaces = n / 2, stars = 1;
        for (int i = 1; i <= n / 2; i++) {
            resultBuilder.append(" ".repeat(spaces)).append("*".repeat(stars)).append("\n");
            stars += 2;
            spaces--;
        }
        for (int i = 0; i <= n / 2; i++) {
            resultBuilder.append(" ".repeat(spaces)).append("*".repeat(stars)).append("\n");
            stars -= 2;
            spaces++;
        }
        return resultBuilder.toString();
    }
}
