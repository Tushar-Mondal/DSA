package Patterns;
import java.util.Scanner;
public class Pattern9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size:");
        int n = in.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        for (int row = 1; row <= n; row++) {
            for (int s = 1; s <= row-1; s++) {
                System.out.print(" ");
            }
            for (int col = row; col <= 2*n - row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}