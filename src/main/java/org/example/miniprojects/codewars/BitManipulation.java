package org.example.miniprojects.codewars;

public class BitManipulation {
    public static long eliminateUnsetBits(String number) {
        number = number.replaceAll("0", "");
        if (number.isEmpty()) return 0L;
        return Long.parseLong(number, 2);
    }
}
