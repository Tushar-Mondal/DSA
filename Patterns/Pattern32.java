package Patterns;
import java.util.Scanner;

public class Pattern32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size:");
        int n = in.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 65 + n - row; col <= 65 + n - 1; col++) {
                System.out.print((char) col + " ");
            }
            System.out.println();
        }
    }
}