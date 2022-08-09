package com.company.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ValidAnagram {
    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("anagram", "nagaram"));
    }

    public boolean isAnagram(String s, String t) {
        List<String> listFirst = new ArrayList<>(Arrays.asList(s.split("")));
        List<String> listSecond = new ArrayList<>(Arrays.asList(t.split("")));
        Collections.sort(listFirst);
        Collections.sort(listSecond);
        return listFirst.equals(listSecond);
    }
}
/*Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.
*/