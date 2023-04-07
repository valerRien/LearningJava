package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeTheWoofsTest {

    @Test
    public void sampleTest() {
        assertEquals("hi", DecodeTheWoofs.woofDecoder("Woof-woof-woof-woof-woof-woof-woof-woof! Woof-woof-woof-woof-woof-woof-woof-woof-woof!"));
    }

    @Test
    public void sampleTest2() {
        assertEquals("feedme", DecodeTheWoofs.woofDecoder("Woof-woof-woof-woof-woof-woof!Woof-woof-woof-woof-woof! " +
                "Woof-woof-woof-woof-woof! Woof-woof-woof-woof! " +
                "Woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof! " +
                "Woof-woof-woof-woof-woof!"));
    }

    @Test
    public void sampleTest3() {
        assertEquals("just barking!", DecodeTheWoofs.woofDecoder("Woof-woof-woof-woof-woof-woof-woof-" +
                "woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof" +
                "-woof-woof-woof-woof-woof-woof-woof-woof-woof!"));
        assertEquals("nothing to decode!", DecodeTheWoofs.woofDecoder("Shhhh!"));
        assertEquals("a", DecodeTheWoofs.woofDecoder("WoofWoof!"));
        assertEquals("a", DecodeTheWoofs.woofDecoder("Shhhhwoof!"));

        assertEquals("a", DecodeTheWoofs.woofDecoder("Woofshhh! Shhh!"));

        assertEquals("a", DecodeTheWoofs.woofDecoder("Wofowof!"));

        assertEquals("a", DecodeTheWoofs.woofDecoder("khkhkhWbzzzzobzzzOghrrrrfseswsw!"));
    }


}