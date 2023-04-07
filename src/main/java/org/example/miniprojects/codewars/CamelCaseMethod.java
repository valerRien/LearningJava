package org.example.miniprojects.codewars;

public class CamelCaseMethod {
    public static String camelCase(String str) {
        if (str.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String[] split = str.split(" ");
        for (String s : split) {
            if (!s.isEmpty()) {
                sb.append(s.substring(0, 1).toUpperCase()).append(s.substring(1));
            }
        }
        return sb.toString();
    }
}
