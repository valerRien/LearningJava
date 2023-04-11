package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LetterCombinationsOfAPhoneNumberTest {

    @Test
    public void sampleTest() {
        assertEquals("[ad, ae, af, bd, be, bf, cd, ce, cf]", LetterCombinationsOfAPhoneNumber.letterCombinations("23").toString());
    }
}