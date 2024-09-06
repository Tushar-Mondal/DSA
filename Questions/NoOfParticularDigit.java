package Questions;
import java.util.*;
public class NoOfParticularDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = in.nextInt();
        System.out.print("Enter the digit U want to count:");
        int digit = in.nextInt();
        int x = helper(n,digit);
        System.out.printf("The no of zero in %d is %d",n,x);
    }
    static int CountNum(int n , int digit , int count){
        if(n == 0){
            return count;
        }
        if((n % 10) == digit){
            return CountNum(n / 10 , digit , count+1);
        }
        return CountNum(n / 10 , digit , count);
    }
    static int helper(int n , int digit){
        return CountNum(n,digit,0);
    }
}