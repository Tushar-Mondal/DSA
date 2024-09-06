package Bitwise_Operator;
import java.util.*;
public class No_Of_Set_Bit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = in.nextInt();
        int x = No_of_SetBit(n);
        System.out.printf("The no of set bit is %d",x);
    }
    static int No_of_SetBit(int n){
        int count = 0;
        while (n != 0){
            n = n & (n - 1);
//            n -= n & -n; We also can do that.
            count++;
        }
        return count;
    }
}