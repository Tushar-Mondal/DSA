package DSA.Sorting;
import java.util.*;
public class Insertion_sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements:");
        for (int i=0 ; i< arr.length ; i++){
            arr[i] = in.nextInt();
        }
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion_sort(int[] arr){
        for (int i=0 ; i < arr.length-1 ; i++){
            for (int j=i+1 ; j > 0 ; j--){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else{
                    break;
                }
            }
        }
    }
}