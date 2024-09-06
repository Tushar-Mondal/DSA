package Recursions.Questions;
import java.util.*;
public class SumOfN_Recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the range:");
        int n = in.nextInt();
        int x = Sum(n);
        System.out.printf("The sum of %d to %d is %d",1,n,x);
    }
    static int Sum(int n){
        if(n == 1){
            return 1;
        }
        return n + Sum(n - 1);
    }
}