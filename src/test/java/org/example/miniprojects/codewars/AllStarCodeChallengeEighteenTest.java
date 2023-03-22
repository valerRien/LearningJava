package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class AllStarCodeChallengeEighteenTest {

    @Test
    public void testSomething() {
        assertEquals(1, AllStarCodeChallengeEighteen.strCount("Hello", 'o'));
        assertEquals(2, AllStarCodeChallengeEighteen.strCount("Hello", 'l'));
        assertEquals(0, AllStarCodeChallengeEighteen.strCount("",'z'));
    }
}