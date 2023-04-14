package org.example.miniprojects.codewars;

public class WhatCenturyIsIt {
    public static String whatCentury(int year) {
        int century = year / 100;
        if (year % 100 != 0) {
            century++;
        }
        String result = String.valueOf(century);
        if (result.charAt(0) == '1' && result.length() > 1) {
            result += "th";
            return result;
        }
        switch (result.charAt(result.length() - 1)) {
            case '1' -> result += "st";
            case '2' -> result += "nd";
            case '3' -> result += "rd";
            default -> result += "th";
        }
        return result;
    }
}
