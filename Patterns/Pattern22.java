package Patterns;
import java.util.Scanner;
public class Pattern22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size:");
        int n = in.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        int i;
        for (int row = 1; row <= n; row++) {
            i = row % 2;
            for (int col = 1; col <= row; col++) {
                System.out.print(i + " ");
                if (i == 1) {
                    i = 0;
                } else {
                    i = 1;
                }
            }
            System.out.println();
        }
    }
}