package org.example.miniprojects.codewars;

public class Ch4113ng3 {
    public static String nerdify(String txt){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < txt.length(); i++) {
            char currentChar = txt.charAt(i);
            if (currentChar == 'A' || currentChar == 'a') {
                sb.append('4');
            } else if (currentChar == 'e' || currentChar == 'E') {
                sb.append('3');
            } else if (currentChar == 'l') {
                sb.append('1');
            } else {
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }
}
