package org.example.miniprojects.codewars;

public class Covfefe {
    public static String covfefe(String tweet) {
        if (!tweet.contains("coverage")) {
            return tweet + " covfefe";
        }
        return tweet.replaceAll("coverage", "covfefe");
    }
}
