package Bitwise_Operator;
import java.util.Scanner;
public class Pow_Of_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = in.nextInt();
        boolean ans;
        if(n == 0){
            ans = false;
        }else {
            ans = (n & (n - 1)) == 0;
        }
        System.out.println("Isn't that number is a power of 2: " + ans);
    }
}