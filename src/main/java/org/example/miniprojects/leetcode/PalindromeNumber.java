package org.example.miniprojects.leetcode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        return String.valueOf(x).equals(new StringBuilder(String.valueOf(x)).reverse().toString());
    }
}
