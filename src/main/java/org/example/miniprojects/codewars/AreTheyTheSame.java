package org.example.miniprojects.codewars;

import java.util.*;

public class AreTheyTheSame {
    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length) return false;

        int[] aPow = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            aPow[i] = a[i] * a[i];
        }

        Arrays.sort(aPow);
        Arrays.sort(b);

        return Arrays.equals(aPow, b);
    }
}
