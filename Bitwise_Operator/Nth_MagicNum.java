package Bitwise_Operator;
import java.util.Scanner;
public class Nth_MagicNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = in.nextInt();
        int x = Magic_num(n);
        System.out.printf("The magical number is %d",x);
    }

    static int Magic_num(int n) {
        int ans = 0;
        int base = 5;
        while (n > 0){
            int last = n & 1;
            ans += last*base;
            base *= 5;
            n >>= 1;
        }
        return ans;
    }
    static boolean isEven(int n){
        return ((n & 1) == 0);
    }
}