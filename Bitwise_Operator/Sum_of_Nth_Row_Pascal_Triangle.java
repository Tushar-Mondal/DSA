package Bitwise_Operator;
import java.util.Scanner;
public class Sum_of_Nth_Row_Pascal_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size:");
        int size = in.nextInt();
        int ans = 1 << (size - 1);
        System.out.printf("The sum of the Nth row is %d",ans);
    }
}