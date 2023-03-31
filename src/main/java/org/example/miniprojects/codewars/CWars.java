package org.example.miniprojects.codewars;

public class CWars {
    public static String initials(String name){
        String[] split = name.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < split.length; i++) {
            sb.append(String.valueOf(split[i].charAt(0)).toUpperCase());
            if ( i != split.length - 1) {
                sb.append(".");
            }
        }

        sb.append(split[split.length - 1].substring(1).toLowerCase());

        return sb.toString();
    }
}
