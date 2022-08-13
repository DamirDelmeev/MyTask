package com.company.leetCode;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString reverseStringObj = new ReverseString();
        reverseStringObj.reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
    }

    public void reverseString(char[] s) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(s));
        stringBuilder.reverse();
        for (int i = 0; i < stringBuilder.length(); i++) {
            s[i] = stringBuilder.charAt(i);
        }
        System.out.println(s);
    }
}
/*Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.*/