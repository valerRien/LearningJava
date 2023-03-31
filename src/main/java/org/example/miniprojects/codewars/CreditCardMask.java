package org.example.miniprojects.codewars;

public class CreditCardMask {
    public static String maskify(String str) {
        if (str.length() < 5) {
            return str;
        }

        String result = "#".repeat(str.length() - 4);
        result += str.substring(str.length() - 4);
        return result;
    }
}
