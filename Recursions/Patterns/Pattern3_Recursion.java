package Recursions.Patterns;
import java.util.*;
public class Pattern3_Recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers of row:");
        int n = in.nextInt();
        Pattern(n,0);
    }
    static void Pattern(int row , int col){
        if(row == 0){
            return;
        }
        if(col < row){
            System.out.print("* ");
            Pattern(row,col+1);
        }else {
            System.out.println();
            Pattern(row-1,0);
        }
    }
}