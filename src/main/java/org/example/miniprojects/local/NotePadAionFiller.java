package org.example.miniprojects.local;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NotePadAionFiller {
    public static final int NOTEPAD_LENGTH = 77;
    public static final String CHARACTER = "-";
    public static String LINE = "";

    static {
        for (int i = 0; i < NOTEPAD_LENGTH; i++) {
            LINE += CHARACTER;
        }
    }

    /**
     * Разобраться с буквами Ш, Ы, Ж и тп - занимают больше симолов
     */
    public static void main(String[] args) {
        String result = "";
        String resultLine;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (!result.equalsIgnoreCase("exit")) {

                result = reader.readLine();

                if (result.equals("линия") || result.equals("line")) {
                    System.out.println(LINE);
                    continue;
                }

                result = result.toUpperCase();
                int length = result.length();

                StringBuilder sb = new StringBuilder();
                int totalLength = NOTEPAD_LENGTH - length - (getHalf(length));
                if (isEven(totalLength)) {
                    fillWithCharacter(sb, getHalf(totalLength));
                } else {
                    fillWithCharacter(sb, getHalf(totalLength) + 1);
                }
                sb.append(result);
                fillWithCharacter(sb, getHalf(totalLength));
                resultLine = sb.toString();

                System.out.println(resultLine);
            }
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("Неверный ввод");
        }
    }

    public static StringBuilder fillWithCharacter(StringBuilder sb, int numberOfCharacterToFill) {
        for (int i = 0; i < numberOfCharacterToFill; i++) {
            sb.append(CHARACTER);
        }
        return sb;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int getHalf(int length) {
        return length / 2;
    }
}