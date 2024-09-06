package Bitwise_Operator;
import java.util.Scanner;
public class FindIthNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = in.nextInt();
        System.out.print("Enter the position of the bit:");
        int p = in.nextInt();
        int x = FindDigit(n,p);
        System.out.printf("The digit is %d",x);
    }
    static int FindDigit(int n,int p){
        if ((n & (1 << (p-1))) == (1 << (p-1))){
            return 1;
        }
        return 0;
    }
}