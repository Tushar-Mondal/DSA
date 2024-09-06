package Recursions.Dsa.Sorting;
import java.util.*;
public class QuickSort_Recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        Sort(arr, 0,arr.length-1);
        System.out.print("The sorted array is: "+Arrays.toString(arr));
    }
    static void Sort(int[] arr, int low, int hi){
        if(hi <= low){
            return;
        }
        int start = low;
        int end = hi;
        int mid = start + (end - start)/2;
        int Pivot = arr[mid];
        while (start <= end){
            while (arr[start] < Pivot){
                start++;
            }
            while (arr[end] > Pivot){
                end--;
            }
            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
         Sort(arr, low, end);
         Sort(arr,start,hi);
    }
}