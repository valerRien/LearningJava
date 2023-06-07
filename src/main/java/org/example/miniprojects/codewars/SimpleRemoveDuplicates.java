package org.example.miniprojects.codewars;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SimpleRemoveDuplicates {
    public static int [] solve(int [] arr){
        Set<Integer> unique = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();
        fillResultListAndUnique(arr, unique, resultList);
        return makeIntArrayFromList(resultList);
    }

    private static int[] makeIntArrayFromList(List<Integer> resultList) {
        int[] result = new int[resultList.size()];
        int resultIndex = 0;
        for (int i = resultList.size() - 1; i >= 0; i--) {
            result[resultIndex] = resultList.get(i);
            resultIndex++;
        }
        return result;
    }

    private static void fillResultListAndUnique(int[] arr, Set<Integer> unique, List<Integer> resultList) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!unique.contains(arr[i])) {
                unique.add(arr[i]);
                resultList.add(arr[i]);
            }
        }
    }
}