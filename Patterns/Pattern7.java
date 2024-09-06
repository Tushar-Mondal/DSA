package Patterns;
import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size:");
        int n = in.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        for (int row = 0; row < n; row++) {
            int star = n - row;
            for (int s = 0; s < row; s++) {
                System.out.print("  ");
            }
            for (int col = 0; col < star; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}