package Recursions.Questions;
import java.util.*;
public class RotatedArr_BinarySearch_Recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the target element:");
        int target = in.nextInt();
        int x = RotatedArr_BinarySearch(arr,target,0, arr.length-1);
        System.out.printf("The position of the target element is %d",x);
    }
    static int RotatedArr_BinarySearch(int[] arr , int target , int start , int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(target == arr[mid]){
            return mid;
        }
        if(arr[start] < arr[mid]){
            if(target >= arr[start] && target < arr[mid]){
                return RotatedArr_BinarySearch(arr,target,start,mid-1);
            }else {
                return RotatedArr_BinarySearch(arr,target,mid+1,end);
            }
        }
        if(target > arr[mid] && target <= arr[end]){
            return RotatedArr_BinarySearch(arr,target,mid+1,end);
        }else {
            return RotatedArr_BinarySearch(arr,target,start,mid-1);
        }
    }
}