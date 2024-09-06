package Bitwise_Operator;
import java.util.*;
public class XOR_to_Nth_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = in.nextInt();
        int x = XOR(n);
        System.out.printf("The XOR of 0 until %d is %d",n,x);
    }
    static int XOR(int n){
        int rem = n % 4;
        switch (rem){
            case 0 -> {return n;}
            case 1 -> {return 1;}
            case 2 -> {return n + 1;}
            case 3 -> {return 0;}
            default -> {return -1;}
        }
    }
}