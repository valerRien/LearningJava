package org.example.miniprojects.codewars;

public class InsertDashes {
    public static String insertDash(int num) {
        char[] chars = (String.valueOf(num)).toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append(chars[0] - '0');
        for (int i = 0; i < chars.length - 1; i++) {
                int currentChar = chars[i] - '0';
                int nextChar = chars[i + 1] - '0';
                if (currentChar % 2 == 1 && nextChar % 2 == 1) {
                    sb.append("-");
                }
                sb.append(nextChar);
        }
        return sb.toString();
    }
}
