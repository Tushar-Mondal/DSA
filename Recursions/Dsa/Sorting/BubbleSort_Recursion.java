package Recursions.Dsa.Sorting;
import java.util.*;
public class BubbleSort_Recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        bubble_sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble_sort(int[] arr, int start, int end){
        if(end == 0){
            return;
        }
        if(start < end) {
            if (arr[start] > arr[start + 1]) {
                Swap(arr,start,start+1);
            }
            bubble_sort(arr,start+1,end);
        }else {
            bubble_sort(arr,0,end-1);
        }
    }
    static void Swap(int[] arr, int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}