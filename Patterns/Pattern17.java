package Patterns;
import java.util.Scanner;
public class Pattern17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size:");
        int n = in.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        for (int row = 1; row <= 2*n - 1; row++) {
            int space = row > n ? row - n : n - row;
            int star = row > n ? 2*n - row : row;
            for (int s = 1; s <= space; s++) {
                System.out.print(" ");
            }
            for (int col = star; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= star; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}