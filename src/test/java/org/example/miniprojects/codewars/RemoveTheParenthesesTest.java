package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveTheParenthesesTest {

    @Test
    public void sampleTest() {
        assertEquals("exampleexample", RemoveTheParentheses.removeParentheses("example(unwanted thing)example"));
    }

    @Test
    public void sampleTest2() {
        assertEquals("a", RemoveTheParentheses.removeParentheses("a(b(c))"));
    }

    @Test
    public void sampleTest3() {
        assertEquals("  ", RemoveTheParentheses.removeParentheses("(first group) (second group) (third group)"));
    }

    @Test
    public void sampleTest4() {
        assertEquals("example  example", RemoveTheParentheses.removeParentheses("example (unwanted thing) example"));
    }

    @Test
    public void sampleTest5() {
        assertEquals("hello example  something", RemoveTheParentheses.removeParentheses("hello example (words(more words) here) something"));
    }

    @Test
    public void sampleTest6() {
        assertEquals("a e", RemoveTheParentheses.removeParentheses("a (bc d)e"));
    }


}