package Recursions.Questions;
import java.util.*;
public class Factorial_Recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = in.nextInt();
        double x = Factorial(n);
        System.out.printf("The factorial of %d is %.0f",n,x);
    }
    static double Factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * Factorial(n - 1);
    }
}