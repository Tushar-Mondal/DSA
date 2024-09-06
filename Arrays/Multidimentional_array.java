package Arrays;
import java.util.*;
public class Multidimentional_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[2][2];//It is not necessary for giving the column size but we must have to put row size.
        int[][] arr2D={
                {1,2,3},
                {4,5},
                {6,7,8}
        };//Size of array column can be different.
        System.out.print("Enter the array elements:");
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=in.nextInt();
            }
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
        //Or we can do it another way
        for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
        //There is also another way to do it
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
        for(int row=0;row< arr2D.length;row++){
            System.out.println(Arrays.toString(arr2D[row]));
        }//Or we can write it another way to print it.
        for(int[] a:arr2D){
            System.out.println(Arrays.toString(a));
        }//Or the traditional way.
        for(int row=0;row< arr2D.length;row++){
            for(int col=0;col< arr2D[row].length;col++){
                System.out.print(arr2D[row][col]+" ");
            }
            System.out.println();
        }
    }
}
