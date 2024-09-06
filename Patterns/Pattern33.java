package Patterns;
import java.util.Scanner;
public class Pattern33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size:");
        int n = in.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        int i = 97;
        for (int row = 1; row <= n; row++) {
            for (int col = 1 ; col <= row; col++) {
                System.out.print((char) i + " ");
                if(i < 91){
                    i += 33;
                }else {
                    i -= 31;
                }
            }
            System.out.println();
        }
    }
}