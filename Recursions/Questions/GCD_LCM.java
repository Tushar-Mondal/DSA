package Recursions.Questions;
import java.util.*;
public class GCD_LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a = in.nextInt();
        System.out.print("Enter the value of b:");
        int b = in.nextInt();
        int x = gcd(a,b);
        int y = lcm(a,b);
        System.out.printf("The GCD of %d and %d is %d\n",a,b,x);
        System.out.printf("The lcm of %d and %d is %d",a,b,y);
    }
    static int gcd(int a , int b){
        if(a == 0){
            return b;
        }
        return gcd(b % a , a);
    }
    static int lcm(int a , int b){
        return (a * b) / gcd(a , b);
    }
}