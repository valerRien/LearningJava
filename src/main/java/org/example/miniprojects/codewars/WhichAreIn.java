package org.example.miniprojects.codewars;

import java.util.*;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        Set<String> stringSet = new TreeSet<>();
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array1[j].isEmpty()) {
                    continue;
                }
                if (array2[i].contains(array1[j])) {
                    stringSet.add(array1[j]);
                    array1[j] = "";
                }
            }
        }

        String[] result = new String[stringSet.size()];
        int index = 0;
        for (String word : stringSet) {
            result[index] = word;
            index++;
        }

        return result;
    }
}
