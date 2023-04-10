package org.example.miniprojects.codewars;

public class KeypadHorror {
    public static String computerToPhone(String number){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            char currentChar = number.charAt(i);
            if (currentChar == '7' | currentChar == '8' | currentChar == '9') {
                currentChar = (char) (currentChar - 6);
            }
            else if (currentChar == '1' | currentChar == '2' | currentChar == '3') {
                currentChar = (char) (currentChar + 6);
            }
            result.append(currentChar);
        }
        return result.toString();
    }
}
