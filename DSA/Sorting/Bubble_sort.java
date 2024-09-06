package DSA.Sorting;
import java.util.*;
// Aka Sinking sort and Exchange sort
public class Bubble_sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble_sort(int[] arr){
        int temp;
        boolean swaped;
        for (int i = 0; i < arr.length-1; i++) {
            swaped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swaped = true;
                }
            }
            if (!swaped){
                break;
            }
        }
    }
}