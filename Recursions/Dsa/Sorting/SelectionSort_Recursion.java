package Recursions.Dsa.Sorting;
import java.util.*;
public class SelectionSort_Recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        Selection_sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void Selection_sort(int[] arr, int start, int end){
        if(end == 0){
            return;
        }
        int x = GetMaxIndex(arr,start,end);
        if(x != end){
            Swap(arr,x,end);
        }
        Selection_sort(arr,start,end-1);
    }
    static void Swap(int[] arr,int max,int last){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }
    static int GetMaxIndex(int[] arr,int start,int end) {
        int max = start;
        for(int i=1;i<=end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}