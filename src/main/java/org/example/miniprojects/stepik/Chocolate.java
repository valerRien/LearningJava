package org.example.miniprojects.stepik;


import java.util.Scanner;

public class Chocolate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int piecesInOneLine = scanner.nextInt();

        int totalSegments = length * width;
        if (piecesInOneLine <= totalSegments && (piecesInOneLine % length == 0 || piecesInOneLine % width == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
