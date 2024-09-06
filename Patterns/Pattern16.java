package Patterns;
import java.util.Scanner;
public class Pattern16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size:");
        int n = in.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        int mul = 1;
        for (int row = 1; row <= n; row++) {
            for (int sp = 1; sp <= n - row; sp++) {
                System.out.print("  ");
            }
            int cmul = mul;
            while (cmul != 0){
                System.out.print(cmul % 10 + "   ");
                cmul /= 10;
            }
            System.out.println();
            mul *= 11;
        }
    }
}