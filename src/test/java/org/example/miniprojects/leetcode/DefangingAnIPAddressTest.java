package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class DefangingAnIPAddressTest {

    @Test
    public void sampleTest() {
        assertEquals("1[.]1[.]1[.]1", DefangingAnIPAddress.defangIPaddr("1.1.1.1"));
        assertEquals("255[.]100[.]50[.]0", DefangingAnIPAddress.defangIPaddr("255.100.50.0"));
    }
}