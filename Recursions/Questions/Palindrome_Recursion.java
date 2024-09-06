package Recursions.Questions;
import java.util.*;
public class Palindrome_Recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = in.nextInt();
        boolean x = palindrome(n);
        System.out.printf("The number %d is a palindrome: %b",n,x);
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
    static boolean palindrome(int n){
        return n == helper(n);
    }
}