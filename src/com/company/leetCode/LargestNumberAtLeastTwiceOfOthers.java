package com.company.leetCode;

import java.util.Arrays;

public class LargestNumberAtLeastTwiceOfOthers {
    public static void main(String[] args) {
        LargestNumberAtLeastTwiceOfOthers largestNumberAtLeastTwiceOfOthers = new LargestNumberAtLeastTwiceOfOthers();
        System.out.println(largestNumberAtLeastTwiceOfOthers.dominantIndex(new int[]{24, 6, 0, 7, 3, 4, 5}));
    }

    public int dominantIndex(int[] nums) {
        int[] ints = Arrays.copyOf(nums, nums.length);
        Arrays.sort(ints);
        if (ints[ints.length - 2] * 2 > ints[ints.length - 1]) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == ints[ints.length - 1])
                return i;
        }
        return -1;
    }
}
/*You are given an integer array nums where the largest integer is unique.

Determine whether the largest element in the array is at least twice as much as every other number in the array.
 If it is, return the index of the largest element, or return -1 otherwise.*/