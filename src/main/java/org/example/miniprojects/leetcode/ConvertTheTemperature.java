package org.example.miniprojects.leetcode;

import java.math.BigDecimal;

public class ConvertTheTemperature {

    public static double[] convertTemperature(double celsius) {
        double[] result = new double[2];
        result[0] = Double.sum(celsius, 273.15D);
        result[1] = Double.sum(celsius * 1.80, 32.00D);

        return result;
    }

}
