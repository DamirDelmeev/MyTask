package com.company.leetCode;

import java.util.Arrays;

public class PivotIndex {
    public static void main(String[] args) {
        PivotIndex pivotIndex = new PivotIndex();
        System.out.println(pivotIndex.pivotIndex(new int[]{0, 2, 3, 4, 5}));
    }

    public int pivotIndex(int[] array) {
        int sum = Arrays.stream(array).sum();
        for (int i = 0; i < array.length; i++) {
            int leftPivot1 = findLeftPivot(array, i);
            int rightPivot1 = sum - leftPivot1 - array[i];
            if (leftPivot1 - rightPivot1 == 0) {
                return i;
            }
        }
        return -1;
    }

    private int findLeftPivot(int[] array, int index) {
        int[] ints = Arrays.copyOfRange(array, 0, index);
        return Arrays.stream(ints).sum();
    }
}
/*Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal
to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements
to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.*/