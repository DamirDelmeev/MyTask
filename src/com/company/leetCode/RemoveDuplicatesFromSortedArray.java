package com.company.leetCode;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        System.out.println(removeDuplicatesFromSortedArray.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    public int removeDuplicates(int[] nums) {
        int counter = 1;
        int indexForChange = 0;
        for (; counter < nums.length; ) {
            if (nums[indexForChange] == nums[counter]) {
                counter++;
            } else {
                nums[indexForChange + 1] = nums[counter];
                indexForChange++;
            }
        }
        return indexForChange + 1;
    }
}
/*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique
 element appears only once. The relative order of the elements should be kept the same.
Since it is impossible to change the length of the array in some languages, you must instead have the result be placed
 in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the
 first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
Return k after placing the final result in the first k slots of nums.
Do not allocate extra space for another array.
 You must do this by modifying the input array in-place with O(1) extra memory.

*/