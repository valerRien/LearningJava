package org.example.miniprojects.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DecodeTheMessageTest {

    @Test
    public void decodeSampleTest() {
        Assertions.assertEquals("this is a secret", DecodeTheMessage.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }

    @Test
    public void decodeSampleTest2() {
        Assertions.assertEquals("the five boxing wizards jump quickly", DecodeTheMessage.decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
    }


    @Test
    public void emptyTest() {
        Assertions.assertEquals("", DecodeTheMessage.decodeMessage("", ""));
    }

    @Test
    public void spacesTest() {
        Assertions.assertEquals(" ", DecodeTheMessage.decodeMessage(" ", " "));
    }
}