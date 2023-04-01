package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */

public class ValidParenthesesTest {

    @Test
    public void sampleTest() {
        assertTrue(ValidParentheses.isValid("()"));
        assertTrue(ValidParentheses.isValid("{}"));
        assertTrue(ValidParentheses.isValid("[]"));
    }

    @Test
    public void sampleTest2() {
        assertTrue(ValidParentheses.isValid("(){}"));
        assertTrue(ValidParentheses.isValid("{}()"));
        assertTrue(ValidParentheses.isValid("[]{}"));
    }

    @Test
    public void sampleTest3() {
        assertTrue(ValidParentheses.isValid("({})"));
        assertTrue(ValidParentheses.isValid("{[]}"));
        assertTrue(ValidParentheses.isValid("[()]"));
    }

    @Test
    public void falseTest() {
        assertFalse(ValidParentheses.isValid("({}))"));
        assertFalse(ValidParentheses.isValid("{(}"));
        assertFalse(ValidParentheses.isValid("[]{"));
    }
}