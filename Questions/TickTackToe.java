package Questions;


import java.util.Arrays;
import java.util.Scanner;

public class TickTackToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (char[] chars : board) Arrays.fill(chars, ' ');
        char player = 'X';
        boolean gameOver = false;
        int isFull  = 0;
        Scanner in = new Scanner(System.in);
        while (!gameOver){
            printBoard(board);
            System.out.print(STR."Player \{player} Enter: ");
            int i = in.nextInt();
            int j = in.nextInt();
            if(board[i][j] == ' '){
                board[i][j] = player;
                ++isFull;
                gameOver = haveWon(board, player);
                if (gameOver){
                    System.out.println(STR."Player \{player} has won");
                }else {
                    player = (player == 'X') ? 'O' : 'X';
                }
            }else {
                if (isFull == 9){
                    for (char[] chars : board) Arrays.fill(chars, ' ');
                    board[i][j] = player;
                }else {
                    System.out.println("Invalid move. Try again!");
                }
            }
        }
        printBoard(board);
    }

    private static boolean haveWon(char[][] board, char player) {
        for (int row = 0; row < 3; row++) {
            if(board[row][0] == player && board[row][1] == player && board[row][2] == player){
                return true;
            }
        }

        for (int col = 0; col < 3; col++) {
            if(board[0][col] == player && board[1][col] == player && board[2][col] == player){
                return true;
            }
        }

        if (board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }

        return false;
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(STR."\{board[i][j]} ");
            }
            System.out.println();
        }
    }
}