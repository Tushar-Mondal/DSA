package Bitwise_Operator;
import java.util.*;
public class XOR_AllNo_AandB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first num:");
        int f = in.nextInt();
        System.out.print("Enter the last num:");
        int l = in.nextInt();
        int x = XOR(l) ^ XOR(f - 1);//Don't give the first num as 0;
        System.out.printf("The XOR from %d to %d is %d",f,l,x);
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