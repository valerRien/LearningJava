package org.example.miniprojects.codewars;

public class GreetMe {
    public static String greet(String name){
        if (name.isEmpty()) {
            return "Hello !";
        }
        String nameNormalize = String.valueOf(name.charAt(0)).toUpperCase() + name.substring(1).toLowerCase();
        return "Hello " + nameNormalize + "!";
    }
}
