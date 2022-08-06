package com.company.leetCode;

import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();
        System.out.println(Arrays.toString(intersectionOfTwoArrays
                .intersect(new int[]{2, 1}, new int[]{1, 2})));
    }


    public int[] intersect(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int counter = 0;
        for (int i = 0, j = 0; i < nums1.length && j < nums2.length; )
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] == nums2[j++]) {
                result[counter++] = nums1[i++];
            }
        return Arrays.copyOf(result, counter);
    }
}
/*
* Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result
*  must appear as many times as it shows in both arrays, and you may return the result in any order.
*
* What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot
* load all elements into the memory at once?*/
