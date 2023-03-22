package org.example.miniprojects.codewars;

import java.util.HashMap;

public class UnexpectedParsing {
    public static HashMap <String, String> getStatus(boolean isBusy) {
        HashMap<String, String> status = new HashMap<>();

        if (isBusy) {
            status.put("status", "busy");
        } else {
            status.put("status", "available");
        }

        return status;
    }
}
