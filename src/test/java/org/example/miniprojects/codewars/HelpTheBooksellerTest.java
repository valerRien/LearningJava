package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelpTheBooksellerTest {

    @Test
    public void sampleTest() {
        assertEquals("(A : 200) - (B : 1140)",
                HelpTheBookseller.stockSummary(new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"},
                        new String[]{"A", "B"}));
    }

}