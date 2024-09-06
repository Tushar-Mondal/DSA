package Recursions.Questions;
import java.util.*;
public class Fibonacci_Recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the position:");
        int position = in.nextInt();
        double y = fibonacciFormula(position);
        System.out.println("The fibonacci number is: "+y);
        double x = fibonacci(position);
        System.out.println("The fibonacci number is: "+x);
    }
    static double fibonacciFormula(int position){
        return (((Math.pow(((1 + Math.sqrt(5))/2),position) - Math.pow(((1 - Math.sqrt(5))/2),position))) / Math.sqrt(5));
    }
    static double fibonacci(int position){
        if(position < 2){
            return position;
        } else {
            double x = fibonacci(position - 1) + fibonacci(position - 2);
            return x;
        }
    }
}