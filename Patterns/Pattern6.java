package Patterns;
import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size:");
        int n = in.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        for (int row = 0; row < n; row++) {
            int totalSpace = n - row;
            for (int s = 0; s <= n; s++) {
                if(s < totalSpace){
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}