package org.example.miniprojects.leetcode;

public class GoalParserInterpretation {
    public static String interpret(String command) {
        return command.replaceAll("\\(\\)", "o").replaceAll("\\(al\\)", "al");
    }
}
