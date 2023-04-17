package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleStringCharactersTest {

    @Test
    public void sampleTest() {
        assertArrayEquals(new int[]{1,18,3,2}, SimpleStringCharacters.Solve("Codewars@codewars123.com"));
        assertArrayEquals(new int[]{8,6,3,2}, SimpleStringCharacters.Solve("CbgA5<1d-tOwUZTS8yQ"));
        assertArrayEquals(new int[]{9,9,6,9}, SimpleStringCharacters.Solve("P*K4%>mQUDaG$h=cx2?.Czt7!Zn16p@5H"));
        assertArrayEquals(new int[]{15,8,6,9}, SimpleStringCharacters.Solve("RYT'>s&gO-.CM9AKeH?,5317tWGpS<*x2ukXZD"));
        assertArrayEquals(new int[]{10,7,3,6}, SimpleStringCharacters.Solve("$Cnl)Sr<7bBW-&qLHI!mY41ODe"));
        assertArrayEquals(new int[]{7,13,4,10}, SimpleStringCharacters.Solve("@mw>0=QD-iAx!rp9TaG?o&M%l$34L.nbft"));
    }
}