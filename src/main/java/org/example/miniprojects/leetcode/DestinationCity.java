package org.example.miniprojects.leetcode;

import java.util.*;

public class DestinationCity {
    public static String destCity(List<List<String>> paths) {
        Map<String, String> startAndFinish = new HashMap<>();

        for (List<String> path : paths) {
            startAndFinish.put(path.get(0), path.get(1));
        }

        for (String destination : startAndFinish.values()) {
            if (startAndFinish.get(destination) == null ) {
                return destination;
            }
        }

        return "";
    }
}
