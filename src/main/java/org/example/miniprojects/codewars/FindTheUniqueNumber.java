package org.example.miniprojects.codewars;

public class FindTheUniqueNumber {
    public static double findUniq(double arr[]) {
        int count = 0;
        while (count < arr.length - 1) {
            if (Double.compare(arr[count], arr[count + 1]) == 0) {
                count++;
            } else {
                if (count + 2 < arr.length) {
                    return Double.compare(arr[count], arr[count + 2]) == 0 ? arr[count + 1] : arr[count];
                } else {
                    return arr[count + 1];
                }
            }
        }
        return 0.0;
    }
}
