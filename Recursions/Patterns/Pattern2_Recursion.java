package Recursions.Patterns;
import java.util.*;
public class Pattern2_Recursion {
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
            Pattern(row,col+1);
            System.out.print("* ");
        }else {
            Pattern(row-1,0);
            System.out.println();
        }
    }
}