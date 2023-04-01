package org.example.miniprojects.leetcode;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int answer = 0, current = 0, previous = 0;

        for (int j = s.length() - 1; j >= 0; j--) {
            switch (s.charAt(j)) {
                case 'M' -> current = 1000;
                case 'D' -> current = 500;
                case 'C' -> current = 100;
                case 'L' -> current = 50;
                case 'X' -> current = 10;
                case 'V' -> current = 5;
                case 'I' -> current = 1;
            }
            if (current < previous) {
                answer -= current;
            } else {
                answer += current;
            }
            previous = current;
        }
        return answer;
    }
}
