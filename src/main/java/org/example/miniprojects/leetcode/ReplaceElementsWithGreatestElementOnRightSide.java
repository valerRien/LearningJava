package org.example.miniprojects.leetcode;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public static int[] replaceElements(int[] arr) {
        if (arr.length == 0) {
            return new int[]{};
        }

        if (arr.length == 1) {
            return new int[]{-1};
        }

        int[] result = new int[arr.length];
        int indexOfMaxValue = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            indexOfMaxValue = findMaxRighter(arr, i);
            while (i < indexOfMaxValue) {
                result[i] = arr[indexOfMaxValue];
                i++;
            }
            i--;
        }
        result[result.length - 1] = -1;
        return result;
    }

    private static int findMaxRighter(int[] arr, int index) {
        int max = Integer.MIN_VALUE, indexOfMaxValue = 0;
        index++;
        for (int i = index; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexOfMaxValue = i;
            }
        }

        return indexOfMaxValue;
    }
}
