package Recursions.Questions;
import java.util.*;
public class ProductOfDigits_Recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = in.nextInt();
        int y = ProductOfDigits(n);
        System.out.printf("The sum of digits of %d is %d",n,y);
    }
    static int ProductOfDigits(int n){
        if(n  % 10 == n) {
            return n;
        }
        return ((n % 10) * ProductOfDigits(n / 10));
    }
}