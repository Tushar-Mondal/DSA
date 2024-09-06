package Arrays;
import java.util.*;
public class RowColMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {23,26,38,49},
                {33,30,43,55}
        };
        System.out.print("Enter the target element:");
        int target = in.nextInt();
        int[] x = matrix_search(arr,target);
        System.out.println("The element is in "+ Arrays.toString(x) +"th position");
    }
    static int[] matrix_search(int[][] arr,int target) {
        int row = 0;
        int col = arr.length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                return new int[]{row, col};
            }
            if (arr[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}