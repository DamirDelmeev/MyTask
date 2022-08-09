package com.company.leetCode;

public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println(validPalindrome.isPalindrome("ab_a"));
    }

    public boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder(s.replaceAll("[^\\w]|_", "").toLowerCase()).reverse();
        return s.replaceAll("[^\\w]|_", "").toLowerCase().equals(stringBuilder.toString());
    }
}
/*
* A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
* and removing all non-alphanumeric characters, it reads the same forward and backward.
*  Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.*/