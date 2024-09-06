package DSA.Sorting;
import java.util.*;
public class Selection_sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection_sort(int[] arr){
        for (int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = getmaxindex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static void swap(int[] arr,int max,int last){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }
    static int getmaxindex(int[] arr,int start,int end) {
        int max = start;
        for(int i=1;i<=end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}