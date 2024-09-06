package Strings;
import java.util.*;
public class N_Knights {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the board size:");
        int n = in.nextInt();
        boolean[][] board = new boolean[n][n];
        System.out.println(Knights(board, 0));
    }
    static int Knights(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board, row, col)){
                board[row][col] = true;
                count += Knights(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }
    static void display(boolean[][] board){
        for (boolean[] row : board){
            for (boolean element : row){
                if(element){
                    System.out.print("K ");
                }else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
    static boolean isSafe(boolean[][] board, int row, int col){
        if(isValid(board, row - 2, col + 1)){
           if (board[row - 2][col + 1]){
               return false;
           }
        }
        if(isValid(board, row - 2, col - 1)){
            if (board[row - 2][col - 1]){
                return false;
            }
        }
        if(isValid(board, row + 2, col + 1)){
            if (board[row + 2][col + 1]){
                return false;
            }
        }
        if(isValid(board, row + 2, col - 1)){
            if (board[row + 2][col - 1]){
                return false;
            }
        }
        if(isValid(board, row + 1, col + 2)){
            if (board[row + 1][col + 2]){
                return false;
            }
        }
        if(isValid(board, row - 1, col + 2)){
            if (board[row - 1][col + 2]){
                return false;
            }
        }
        if(isValid(board, row + 1, col - 2)){
            if (board[row + 1][col - 2]){
                return false;
            }
        }
        if(isValid(board, row - 1, col - 2)){
            if (board[row - 1][col - 2]){
                return false;
            }
        }
        return true;
    }
    static boolean isValid(boolean[][] board, int row, int col){
        if(row >= 0 && row < board.length && col >= 0 && col < board.length){
            return true;
        }
        return false;
    }
}