package org.example.miniprojects.codewars;

import java.util.*;

public class Testing123 {
    public static List<String> number(List<String> lines) {
        List<String> resultList = new LinkedList<>();
        for (int i = 0; i < lines.size(); i++) {
            resultList.add(i + 1 + ": " + lines.get(i));
        }
        return resultList;
    }
}
