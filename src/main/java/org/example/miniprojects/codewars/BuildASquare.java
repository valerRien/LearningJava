package org.example.miniprojects.codewars;

public class BuildASquare {
    public static final String generateShape(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append("+".repeat(n));
            if (i != n - 1) sb.append("\n");
        }

        return sb.toString();
    }
}
