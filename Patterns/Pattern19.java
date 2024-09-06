package Patterns;
import java.util.Scanner;
public class Pattern19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size:");
        int n = in.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        int sub = 2*n - 2;
        for (int row = 1; row <= 2*n - 1; row++) {
            int star = row > n ? 2*n - row : row;
            int space = sub;
            for (int col = 1; col <= star; col++) {
                System.out.print("*");
            }
            for (int s = 1 ; s <= space; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= star; col++) {
                System.out.print("*");
            }
            System.out.println();
            if(row < n){
                sub -= 2;
            }else {
                sub += 2;
            }
        }
    }
}