package DSA.Searching;
import java.util.*;
public class Linear_search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int[][] arr2D = {
                {1,2,3,4,5,6,7,8,9,10},
                {11,12,13,14,15,16,17,18,19,20},
                {-2000,-50000,500000000,-5000000}
        };
        System.out.print("Enter searching element:");
        int element = in.nextInt();
        int x = linear_search(arr, element);
        System.out.println(x);
        int y = max(arr);
        System.out.println("The Max element is:"+y);
        int z = min(arr);
        System.out.println("Tne Min element is:"+z);
        int[] w = search(arr2D,element);
        System.out.println(Arrays.toString(w));
    }

    static int linear_search(int[] arr, int element) {
        if(arr.length==0){
            return Integer.MIN_VALUE;
        }
        for (int i=0;i<arr.length;i++) {
            if (arr[i] == element) {
                return i;
            }

        }
        return Integer.MIN_VALUE;
    }
    static int max(int[] arr){
        int x = arr[0];
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        for(int a : arr) {
            if (x < a) {
                x = a;
            }
        }
        return x;
    }
    static int min(int[] arr){
        int y = arr[0];
        if(arr.length==0){
            return Integer.MIN_VALUE;
        }
        for(int a : arr) {
            if (y > a) {
                y = a;
            }
        }
        return y;
    }
    static int[] search(int[][] arr,int element){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==element){
                    return new int[]{row,col};
                }
            }// Another way to this
//            for(int[] a : arr){
//                for(int x : a){
//                    if(x==element){
//                        return new int[]{}
//                    }
//                }
//            }
        }
        return new int[]{Integer.MIN_VALUE};
    }

}