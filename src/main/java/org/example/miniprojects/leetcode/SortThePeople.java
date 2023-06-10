package org.example.miniprojects.leetcode;

import java.util.*;

public class SortThePeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, List<String>> heightsAndNames = getTable(names, heights);
        //keys sorted in reverse order
        Set<Integer> reversedSortedHeights = new TreeSet<>(Collections.reverseOrder());
        reversedSortedHeights.addAll(heightsAndNames.keySet());
        return sortNamesByHeight(reversedSortedHeights, heightsAndNames);
    }

    private static String[] sortNamesByHeight(Set<Integer> reversedSortedHeights, Map<Integer, List<String>> heightsAndNames) {
        List<String> sorted = new ArrayList<>();
        //get names from table using height (sorted) as a key
        for (Integer height : reversedSortedHeights) {
            sorted.addAll(heightsAndNames.get(height));
        }
        return sorted.toArray(new String[0]);
    }

    private static Map<Integer, List<String>> getTable(String[] names, int[] heights) {
        Map<Integer, List<String>> links = new HashMap<>();
        for (int i = 0; i < heights.length; i++) {
            //if list is empty - form it and put K + V
            if (links.get(heights[i]) == null) links.put(heights[i], new ArrayList<>(Collections.singleton(names[i])));
                //if key is exist - add name with same height in a list
            else links.get(heights[i]).add(names[i]);
        }
        return links;
    }
}
