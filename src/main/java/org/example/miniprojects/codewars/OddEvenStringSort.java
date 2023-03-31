package org.example.miniprojects.codewars;

public class OddEvenStringSort {
    public static String sortMyString(String s) {
        StringBuilder even = new StringBuilder();
        StringBuilder notEven = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                even.append(String.valueOf(s.charAt(i)));
            } else {
                notEven.append(String.valueOf(s.charAt(i)));
            }
        }

        even.append(" ");
        return even.toString() + notEven.toString();
    }
}
