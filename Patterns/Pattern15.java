package Patterns;
import java.util.Scanner;
public class Pattern15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size:");
        int n = in.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        int sub = 2;
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalSpace = row > n ? row - n : n - row;
            int totalColsInRow = row > n ? 2*n - 1 - sub: 2*row - 1;
            for (int s = 1; s <= totalSpace; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColsInRow; col++) {
                if(col == 1 || col == totalColsInRow){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if(row > n){
                sub += 2;
            }
        }
    }
}