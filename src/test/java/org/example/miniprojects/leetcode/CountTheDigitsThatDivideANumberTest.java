package org.example.miniprojects.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountTheDigitsThatDivideANumberTest {

    @Test
    void countDigits() {
        Assertions.assertEquals(1, CountTheDigitsThatDivideANumber.countDigits(7));
    }

    @Test
    void countDigitsThreeDigit() {
        Assertions.assertEquals(2, CountTheDigitsThatDivideANumber.countDigits(121));
    }

    @Test
    void countDigitsFourDigit() {
        Assertions.assertEquals(4, CountTheDigitsThatDivideANumber.countDigits(1248));
    }

    @Test
    void zeroTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> CountTheDigitsThatDivideANumber.countDigits(0));
    }

}