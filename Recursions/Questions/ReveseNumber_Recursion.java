package Recursions.Questions;
import java.util.*;
public class ReveseNumber_Recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = in.nextInt();
        double x = helper(n);
        System.out.printf("The reverse of digits of %d is %.0f",n,x);
    }
    static double ReverseNum(int n , int digits){
        if((n / 10) == n){
            return n;
        }
        return ((n % 10) * Math.pow(10 , digits - 1)) + ReverseNum(n / 10 , digits - 1);
    }
    static int helper(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return (int) ReverseNum(n , digits);
    }
}