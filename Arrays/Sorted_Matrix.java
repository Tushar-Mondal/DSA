package Arrays;
import java.util.*;
//for 3*3 order sorted matrix
public class Sorted_Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.print("Enter the target element:");
        int target = in.nextInt();
        int[] x = search(matrix,target);
        System.out.println("The element is in "+ Arrays.toString(x) +"th position");
    }
    static int[] binary_search(int[][] matrix,int row, int colstart,int colend,int target){
        while (colstart <= colend){
            int mid = colstart + (colend-colstart)/2;
            if(matrix[row][mid] == target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid] < target){
                colstart = mid+1;
            }else {
                colend = mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix,int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        if(rows == 1){
            return binary_search(matrix,0,0,cols-1,target);
        }
        int rowstart = 0;
        int rowend = rows-1;
        int colmid = cols/2;
        while (rowstart < rowend - 1){
            int mid = rowstart + (rowend - rowstart)/2;
            if(matrix[mid][colmid] == target){
                return new int[]{mid,colmid};
            }
            if(matrix[mid][colmid] < target){
                rowstart = mid;
            }else {
                rowend = mid;
            }
            if (matrix[rowstart][colmid] == target){
                return new int[]{rowstart+1,colmid};
            }
            if(target <= matrix[rowstart][colmid-1]){
                return binary_search(matrix,rowstart,0,colmid-1,target);
            }
            if(target >= matrix[rowstart][colmid+1] && target <= matrix[rowstart][cols-1]){
                return binary_search(matrix,rowstart,colmid+1,cols-1,target);
            }
            if(target <= matrix[rowstart+1][colmid-1]){
                return binary_search(matrix,rowstart+1,0,colmid-1,target);
            }else {
                return binary_search(matrix,rowstart+1,colmid+1,cols-1,target);
        }
    }
        return new int[]{-1,-1};
    }
}