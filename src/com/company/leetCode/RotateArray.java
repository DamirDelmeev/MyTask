package com.company.leetCode;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
                25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45};
        rotateArray.rotate(array, 36);
        System.out.println(Arrays.toString(array));
    }

    public void rotate(int[] nums, int k) {
        if (nums.length > 1) {
            extracted(nums, k, 0, nums[0], 0, 0);
        }
    }

    private static void extracted(int[] nums, int k, int begin, int memory, int counterOfRec, int lvlCounter) {
        if (k > nums.length) {
            k = k - nums.length;
        }
        if (counterOfRec < nums.length) {
            if (counterOfRec != 0 && begin == lvlCounter) {
                lvlCounter++;
                begin = lvlCounter;
                memory = nums[lvlCounter];
            }
            int i = begin + k < nums.length ? begin + k : Math.abs(begin + k - nums.length);
            int memoryOut = nums[i];
            nums[i] = memory;
            counterOfRec++;
            extracted(nums, k, i, memoryOut, counterOfRec, lvlCounter);
        }
    }
}
/*Given an array, rotate the array to the right by k steps, where k is non-negative.
 * The actual trick comes when trying to solve this problem without using any additional memory.*/