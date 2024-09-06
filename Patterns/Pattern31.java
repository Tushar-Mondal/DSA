package Patterns;
import java.util.Scanner;
public class Pattern31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size:");
        int n = in.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        for (int row = 1; row < 2*n; row++) {
            for (int col = 1; col < 2*n; col++) {
                int element = Math.min(Math.min(row , col) , Math.min(2*n - row , 2*n - col));
                System.out.print(n - element + 1 + " ");
            }
            System.out.println();
        }
    }
}