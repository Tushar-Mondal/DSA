package Strings;

import java.util.Arrays;

public class Sudoku_Solver {
    public static void main(String[] args) {
        int[][] board = {
                {5,3,0,0,7,0,0,0,0},
                {6,0,0,1,9,5,0,0,0},
                {0,9,8,0,0,0,0,6,0},
                {8,0,0,0,6,0,0,0,3},
                {4,0,0,8,0,3,0,0,1},
                {7,0,0,0,2,0,0,0,6},
                {0,6,0,0,0,0,2,8,0},
                {0,0,0,4,1,9,0,0,5},
                {0,0,0,0,8,0,0,7,9}
        };
        int[][] x = Sudoku(board);
        for(int[] element : x){
            System.out.println(Arrays.toString(element));
        }
    }
    static int[][] Sudoku(int[][] board){
        int n = board.length;
        int row = 0, col = 0;
        boolean emptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
        }
        for (int number = 1; number < 10; number++) {
            if(isSafe(board, row, col, number)){
                board[row][col] = number;
            }else {
                board[row][col] = 0;
            }
        }
        return board;
    }
    static boolean isSafe(int[][] board, int row, int col, int num){
        for (int i = 0; i < board.length; i++) {
            if(board[row][col] == num){
                return false;
            }
        }
        for(int[] nums : board){
            if(nums[col] == num){
                return false;
            }
        }
        int sqrt = (int) (Math.sqrt(board.length));
        int RowStart = row - row % sqrt;
        int ColStart = col - col % sqrt;
        for (int r = RowStart; r < RowStart + sqrt; r++) {
            for (int c = ColStart; c < ColStart + sqrt; c++) {
                if (board[r][c] == num){
                    return false;
                }
            }
        }
        return true;
    }
}