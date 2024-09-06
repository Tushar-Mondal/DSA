package Bitwise_Operator;
import java.util.*;
public class Calculate_A_Pow_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base:");
        int base = in.nextInt();
        System.out.print("Enter the pow:");
        int pow = in.nextInt();
        int x = A_Pow_B(base , pow);
        System.out.println(x);
    }
    static int A_Pow_B(int base , int pow){
        int ans = 1;
        while (pow != 0){
            if((pow & 1) != 0){
                ans *= base;
            }
            pow >>= 1;
            base *= base;
        }
        return ans;
    }
}