package org.example.miniprojects.codewars;

public class SpeedLimit {
    public static int speedLimit(final int speed, final int[] signals) {

        int sumOfBills = 0;
        for (int limit : signals) {
            int overLimit = limit - speed;
            if (overLimit < 0) {
                overLimit = Math.abs(overLimit);
                int bill = overLimit < 10? 0 : overLimit <= 19? 100 : overLimit <= 29? 250 : 500;
                sumOfBills += bill;
            }
        }
        return sumOfBills;
    }

}
