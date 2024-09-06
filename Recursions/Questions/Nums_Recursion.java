package Recursions.Questions;
import java.util.Scanner;
public class Nums_Recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the num:");
        int target = in.nextInt();
        nums(1,target);
    }
    static void nums(int start, int target){
        if(target == start){
            System.out.println(target);
            return;
        }
        System.out.println(start);
//        This is called tail recursion.
//        This is the last function call.
        nums(start+1,target);
    }
}