package org.example.miniprojects.codewars;

public class DetermineOffspringSexBasedOnChromosomes {
    public static String chromosomeCheck(String sperm) {
        if (sperm.contains("Y")) {
            return "Congratulations! You're going to have a son.";
        } else {
            return "Congratulations! You're going to have a daughter.";
        }
    }
}
