package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class WhatCenturyIsItTest {

    @Test
    public void sampleTest() {
        assertEquals("20th", WhatCenturyIsIt.whatCentury(1999));
        assertEquals("21st", WhatCenturyIsIt.whatCentury(2011));
        assertEquals("22nd", WhatCenturyIsIt.whatCentury(2154));
        assertEquals("23rd", WhatCenturyIsIt.whatCentury(2259));
        assertEquals("20th", WhatCenturyIsIt.whatCentury(2000));
        assertEquals("6th", WhatCenturyIsIt.whatCentury(505));
        assertEquals("5th", WhatCenturyIsIt.whatCentury(500));
        assertEquals("97th", WhatCenturyIsIt.whatCentury(9700));
        assertEquals("11th", WhatCenturyIsIt.whatCentury(1075));
    }
}