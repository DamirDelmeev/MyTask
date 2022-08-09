package com.company.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ValidSudoku {
    public static void main(String[] args) {
        ValidSudoku validSudokuObj = new ValidSudoku();
        char[][] array = {
                {'8', '1', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '5', '.', '.', '.', '.', '6', '.'},
                {'.', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(validSudokuObj.isValidSudoku(array));
    }

    public boolean isValidSudoku(char[][] board) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        for (int k = 0; k < board.length; k++) {
            HashSet<Character> cube = new HashSet<Character>();
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    if (i != j) {
                        if (board[k][i] == board[k][j] && list.contains(Character.getNumericValue(board[k][i]))
                                || board[i][k] == board[j][k] && list.contains(Character.getNumericValue(board[i][k]))) {
                            return false;
                        }
                    }
                }
                int indexRow = 3 * (k / 3);
                int indexCol = 3 * (k % 3);
                if (list.contains(Character.getNumericValue(board[indexRow + i / 3][indexCol + i % 3])) && !cube.add(board[indexRow + i / 3][indexCol + i % 3])) {
                    return false;
                }
            }
        }
        return true;
    }
}
/*
* Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.*/