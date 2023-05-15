package org.example.miniprojects.codewars;

public class EncryptThis {
    public static String encryptThis(String text) {
        if (text.isEmpty()) return "";
        StringBuilder encrypt = new StringBuilder();
        //Your message is a string containing space separated words.
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            //The first letter must be converted to its ASCII code.
            int first = words[i].charAt(0);
            encrypt.append(first);
            if (words[i].length() == 2) {
                encrypt.append(words[i].substring(1));
            } else if (words[i].length() > 2) {
                //The second letter must be switched with the last letter
                encrypt.append(words[i].charAt(words[i].length() - 1))
                        .append(words[i], 2, words[i].length() - 1)
                        .append(words[i].charAt(1));
            }
            encrypt.append(" ");
        }
        return encrypt.toString().trim();
    }
}
