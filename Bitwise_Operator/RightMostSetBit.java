package Bitwise_Operator;
import java.util.Scanner;
public class RightMostSetBit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = in.nextInt();
        int x = FindSetBit(n);
        System.out.printf("The position right most bit is %d",x);
    }
    static int FindSetBit(int n){
        int count = 0;
        int sum = n & NegationOfN(n);
        while (sum != 0){
            sum /= 2;
            count++;
        }
        return count;
    }
    static int NegationOfN(int n){
        return  ~n + 1;//This is called 2's compliment.
        //The negation is also be done as, first we have to find the Right most set bit. After that we have to divide the bits in two part beside the set bit the right ones are called A and the left ones are called B like A1B. Then we have to compliment the A, and then we have to do that into the previous way like (~A)1B.Like that we can also make the number as a Negation.
    }
}