package Patterns;
import java.util.Scanner;
public class Pattern21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size:");
        int n = in.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        int i = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if(row < n){
                    System.out.print(i + "  ");
                }else {
                    System.out.print(i + " ");
                }
                i++;
            }
            System.out.println();
        }
    }
}