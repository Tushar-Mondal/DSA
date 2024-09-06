package Patterns;
import java.util.Scanner;
public class Pattern12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size:");
        int n = in.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        for (int row = 1; row <= 2*n; row++) {
            int space = row > n ? 2*n - row : row-1;
            int star = row > n ? row-n : n-row+1;
            for (int s = 1; s <= space; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= star; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}