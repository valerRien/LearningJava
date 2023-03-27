package org.example.miniprojects.codewars;

public class IndexedCapitalization {
    public static String capitalize(String s, int[] ind){
        char[] chars = s.toCharArray();
        for (int i = 0; i < ind.length; i++) {
            if (ind[i] < chars.length) {
                chars[ind[i]] = (char) (chars[ind[i]] - 32);
            }
        }

        return new String(chars);
    }
}
