package org.example.miniprojects.codewars;

public class CyclopsNumbers {
    public static boolean cyclops(long n) {
        String binaryValue = Long.toBinaryString(n);
        if (binaryValue.length() % 2 == 0 | hasMoreThenOneZero(binaryValue)) {
            return false;
        }

        return binaryValue.charAt(binaryValue.length() / 2) == '0';
    }

    private static boolean hasMoreThenOneZero(String binaryValue) {
        int counter = 0;
        for (char c : binaryValue.toCharArray()) {
            if (c == '0') {
                counter++;
                if (counter > 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
