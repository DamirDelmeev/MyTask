package com.company.leetCode;

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        FirstUniqueCharacterInAString firstUniqueCharacterInAString = new FirstUniqueCharacterInAString();
        System.out.println(firstUniqueCharacterInAString.firstUniqChar("eeqqqsesx"));
    }

    public int firstUniqChar(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        for (int i = 0; i < stringBuilder.length(); i++) {
            int firstIndex = stringBuilder.indexOf(String.valueOf(stringBuilder.charAt(i)));
            int lastIndex = stringBuilder.lastIndexOf(String.valueOf(stringBuilder.charAt(i)));
            if (firstIndex == lastIndex) {
                return i;
            }
        }
        return -1;
    }
}
/*Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.*/