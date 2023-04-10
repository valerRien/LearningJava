package org.example.miniprojects.codewars;

public class DotCalculator {
    public static String calc(String txt){
        if (txt.isEmpty()) {
            return "";
        }
        String[] split = txt.split(" ");
        int times = 0;
        switch (split[1]) {
            case "+":
                times = split[0].length() + split[2].length();
                break;
            case "-":
                times = split[0].length() - split[2].length();
                break;
            case "*":
                times = split[0].length() * split[2].length();
                break;
            case "//":
                times = split[0].length() / split[2].length();
                break;
        }
        return ".".repeat(times);
    }
}
