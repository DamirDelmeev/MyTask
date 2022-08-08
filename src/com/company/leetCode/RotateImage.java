package com.company.leetCode;

public class RotateImage {
    public static void main(String[] args) {
        RotateImage rotateImage = new RotateImage();
        int[][] ints = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        showMatrix(ints);
        rotateImage.rotate(ints);
        System.out.println("\nResult\n");
        showMatrix(ints);
    }

    public void rotate(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix.length];
        result = new int[matrix.length][result.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                result[j][matrix.length - i - 1] = matrix[i][j];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = result[i][j];
            }
        }
    }

    static void showMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] < 0) {
                    System.out.print(matrix[i][j] + " ");
                } else
                    System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
 DO NOT allocate another 2D matrix and do the rotation.*/