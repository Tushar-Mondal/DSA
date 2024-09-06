package Bitwise_Operator;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = in.nextInt();
        boolean x = isOdd(n);
        System.out.println(STR."Is that number is a odd number: \{x}");
    }
    static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}