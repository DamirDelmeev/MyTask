package com.company.leetCode;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
    longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"});
    }
    public String longestCommonPrefix(String[] strs) {
            if (strs.length < 1 || strs == null) {
                return "";
            }
            if (strs.length == 1) {
                return strs[0];
            }
            int shortest = 0;
            int length = strs[0].length();
            for (int i = 1; i < strs.length; i++) {
                int curLen = strs[i].length();
                if (curLen < length) {
                    length = curLen;
                    shortest = i;
                }
            }
            String substring = strs[shortest];
            for (int i = 0; i < strs.length; i++) {
                while (strs[i].indexOf(substring) != 0) {
                    substring = substring.substring(0, substring.length()-1);
                }
            }
            return substring;
    }
}
/*Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".*/