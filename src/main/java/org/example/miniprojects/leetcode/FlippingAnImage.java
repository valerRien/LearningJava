package org.example.miniprojects.leetcode;

public class FlippingAnImage {
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            image[i] = getInts(image[i]);
        }

        return image;
    }

    private static int[] getInts(int[] ints) {
        int[] result = new int[ints.length];
        int temp = 0;
        int i = 0, j = ints.length - 1;

        while (i <= j) {
            temp = ints[i];
            result[i] = ints[j]== 0? 1 : 0;
            result[j] = temp == 0? 1 : 0;
            i++;
            j--;
        }

        return result;
    }
}
