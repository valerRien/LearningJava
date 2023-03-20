package org.example.miniprojects.stepik;

import java.util.Scanner;

public class RunLengthEncoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String result = "";

        String[] split = line.split(" ");
        for (String sameSymbols : split) {
            String count = sameSymbols.length() == 1? "" : String.valueOf(sameSymbols.length());
            result += count + String.valueOf(sameSymbols.charAt(0));
        }

        System.out.println(result);
    }
}
