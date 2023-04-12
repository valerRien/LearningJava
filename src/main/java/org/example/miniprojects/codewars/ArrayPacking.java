package org.example.miniprojects.codewars;

public class ArrayPacking {
    public static long arrayPacking(int[] arr) {
        StringBuilder sb = new StringBuilder();
        String newLine = "";
        for (int i = arr.length - 1; i >= 0 ; i--) {
            newLine = Long.toBinaryString(arr[i]);
            newLine = "0".repeat(8 - newLine.length()) + newLine;
            sb.append(newLine);
        }
        return Long.parseLong(sb.toString(), 2);
    }
}
