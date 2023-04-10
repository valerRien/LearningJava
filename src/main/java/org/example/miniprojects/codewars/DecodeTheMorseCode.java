package org.example.miniprojects.codewars;


import java.util.*;

public class DecodeTheMorseCode {

    public static final String MORSE_WORD_DELIMITER = "   ";
    public static final String MORSE_LETTER_DELIMITER = " ";
    public static final String WORD_DELIMITER = " ";

    public static String decode(String morseCode) {
        StringBuilder decodeBuilder = new StringBuilder();
        String[] morseWords = morseCode.split(MORSE_WORD_DELIMITER);
        for (String morseWord : morseWords) {
            if (decodeBuilder.length() > 0) {
                decodeBuilder.append(WORD_DELIMITER);
            }
            String[] morseLetters = morseWord.split(MORSE_LETTER_DELIMITER);
            for (String morseLetter : morseLetters) {
                String letter = MorseCode.get(morseLetter);
                if (letter != null) {
                    decodeBuilder.append(letter);
                }
            }
        }
        return decodeBuilder.toString();
    }

    //logic from import MorseCode class
    public static class MorseCode{
        public static String get(String str){
            return null;
        }
    }
}
