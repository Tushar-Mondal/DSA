package Bitwise_Operator;
import java.util.Scanner;
public class ResetIthBit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = in.nextInt();
        System.out.print("Enter the position:");
        int p = in.nextInt();
        int x = ResetBit(n,p);
        System.out.printf("The changed number is %d",x);
        }
        static int ResetBit(int n,int p){
            return n & (~(1 << p-1));
        }
}