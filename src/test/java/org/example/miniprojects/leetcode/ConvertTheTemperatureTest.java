package org.example.miniprojects.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertTheTemperatureTest {

    @Test
    void convertTemperature() {
        Assertions.assertArrayEquals(new double[]{309.65000,97.70000}, ConvertTheTemperature.convertTemperature(36.50));
    }

    @Test
    void convertTemperature2() {
        Assertions.assertArrayEquals(new double[]{395.26000,251.79800}, ConvertTheTemperature.convertTemperature(122.11));
    }
}