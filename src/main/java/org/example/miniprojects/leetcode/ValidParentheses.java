package org.example.miniprojects.leetcode;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> symbolsInOrder = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            switch (currentChar) {
                case '(':
                case '{':
                case '[':
                    symbolsInOrder.push(currentChar);
                    break;
                case ')':
                    if (symbolsInOrder.isEmpty() || symbolsInOrder.pop() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (symbolsInOrder.isEmpty() || symbolsInOrder.pop() != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (symbolsInOrder.isEmpty() || symbolsInOrder.pop() != '{') {
                        return false;
                    }
                    break;
            }

        }

        return symbolsInOrder.isEmpty();
    }
}
