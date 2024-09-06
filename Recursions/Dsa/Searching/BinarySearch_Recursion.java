package Recursions.Dsa.Searching;
import java.util.Scanner;
public class BinarySearch_Recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array element in sorting order:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the searching element:");
        int element = in.nextInt();
        boolean isAc = arr[0] < arr[arr.length-1];
        int x = BinarySearch(arr,element,0, arr.length-1,isAc);
        System.out.println("The position of the element is: "+x);
    }
    static int BinarySearch(int[] arr,int target,int start,int end,boolean isAc){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (isAc) {
            if (arr[mid] > target) {
                return BinarySearch(arr, target,start, mid - 1, isAc);
            } else if (arr[mid] < target) {
                return BinarySearch(arr, target, mid + 1, end, isAc);
            } else {
                return mid;
            }
        } else {
            if (arr[mid] < target) {
                return BinarySearch(arr, target, 0, mid - 1, isAc);
            } else if (arr[mid] > target) {
                return BinarySearch(arr, target, mid + 1, end, isAc);
            } else {
                return mid;
            }
        }
    }
}
