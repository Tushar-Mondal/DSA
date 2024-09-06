package Patterns;
import java.util.Scanner;
public class Pattern28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size:");
        int n = in.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        for (int row = 1; row <= 2 * n; row++) {
            int totalColsInRow = row > n ? 2*n - row : row;
            int totalSpace = n - totalColsInRow;
            for (int s = 1; s <= totalSpace; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}