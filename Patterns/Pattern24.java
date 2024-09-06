package Patterns;
import java.util.Scanner;
public class Pattern24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size:");
        int n = in.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        int sub = 2*n - 2;
        for (int row = 1; row <= 2*n; row++) {
            int star = row > n ? 2*n - row + 1: row;
            int space = sub;
            for (int col = 1; col <= star; col++) {
                if(col == 1 || col == star) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            for (int s = 1 ; s <= space; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= star; col++) {
                if(col == 1 || col == star) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if(row < n){
                sub -= 2;
            }else if(row > n){
                sub += 2;
            }
        }
    }
}