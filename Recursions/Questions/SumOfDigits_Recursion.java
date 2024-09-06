package Recursions.Questions;
import java.util.*;
public class SumOfDigits_Recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = in.nextInt();
        int y = SumOfDigits(n);
        System.out.printf("The sum of digits of %d is %d",n,y);
    }
    static int SumOfDigits(int n){
        if(n == 0) {
            return 0;
        }
        return ((n % 10) + SumOfDigits(n / 10));
    }
}