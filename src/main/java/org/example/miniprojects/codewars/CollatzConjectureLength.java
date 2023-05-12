package org.example.miniprojects.codewars;

import java.util.*;

public class CollatzConjectureLength {
    public static long conjecture(long x) {
        List<Long> variations = new ArrayList<>();
        variations.add(x);
        while (x != 1) {
            x = x % 2 == 0? x / 2 : x * 3 + 1;
            variations.add(x);
        }

        return variations.size();
    }
}
