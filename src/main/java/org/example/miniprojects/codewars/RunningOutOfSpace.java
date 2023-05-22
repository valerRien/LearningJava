package org.example.miniprojects.codewars;

public class RunningOutOfSpace {
    public static String[] spacey(String[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            array[i] = sb.append(array[i]).toString();
        }
        return array;
    }
}
