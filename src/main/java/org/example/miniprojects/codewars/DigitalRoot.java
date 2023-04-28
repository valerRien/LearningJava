package org.example.miniprojects.codewars;

public class DigitalRoot {
    public static int digital_root(int n) {
        if (n >= 0 && n <= 9) {
            return n;
        }
        while (n / 10 != 0) {
            n = getRoot(n);
        }

        return n;
    }

    private static int getRoot(int n) {
        int sum = 0;
        String nValue = String.valueOf(n);
        for (int i = 0; i < nValue.length(); i++) {
            sum += nValue.charAt(i) - '0';
        }
        return sum;
    }
}

