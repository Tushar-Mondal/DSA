package Patterns;
import java.util.Scanner;
public class Pattern20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size:");
        int n = in.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < n; col++) {
                if(col == 1 || col == n-1 || row == 1 || row == n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}