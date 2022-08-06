package com.company.leetCode;

public class MoveZeroes {
    public static void main(String[] args) {
        MoveZeroes moveZeroesObj = new MoveZeroes();
        moveZeroesObj.moveZeroes(new int[]{0, 2, 0, 1});
    }

    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && i + 1 < nums.length) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
            }
        }
    }
}
/*Given an integer array nums,
move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.*/