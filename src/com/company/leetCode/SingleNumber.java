package com.company.leetCode;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public static void main(String[] args) {
        SingleNumber singleNumberObj = new SingleNumber();
        System.out.println(singleNumberObj.singleNumber(new int[]{0, 0, 1, 1, 2, 2, 3, 3, 4}));
    }

    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        return set.stream().findFirst().get();
    }
}
/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.*/