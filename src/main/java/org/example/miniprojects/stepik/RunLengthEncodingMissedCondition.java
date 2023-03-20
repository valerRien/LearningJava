package org.example.miniprojects.stepik;

import java.util.Scanner;

/**
 * missed condition "This string is !split! into the groups of consecutive identical characters ("series")"
 */
public class RunLengthEncodingMissedCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String result = "";


        for (int i = 0; i < line.length(); i++) {
            if (i + 1 <= line.length() - 1) {
                int count = 1;
                while (i + 1 <= line.length() - 1 & line.charAt(i) == line.charAt(i + 1)) {
                       count++;
                       i++;
                }
                if (count == 1) {
                    result += String.valueOf(line.charAt(i));
                } else {
                    result += count + String.valueOf(line.charAt(i));
                }
            }
        }
        if (line.charAt(line.length() - 1) != line.charAt(line.length() - 2)) {
            result += String.valueOf(line.charAt(line.length() - 1));
        }
        System.out.println(result);
    }
}
