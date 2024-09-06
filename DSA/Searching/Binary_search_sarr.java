package DSA.Searching;
import java.util.*;
public class Binary_search_sarr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array element in sorting order:");
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the searching element:");
        int element = in.nextInt();
        int x = binary(arr,element);
        System.out.println(STR."The element found in \{x}th position");
    }
    static int binary(int[] arr,int target){
        boolean isAc = arr[0] < arr[arr.length-1];
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(isAc){
                if(target<arr[mid]){
                    end = mid-1;
                } else if(target>arr[mid]){
                    start = mid+1;
                }else{
                    return mid;
                }
            } else {
                if(target<arr[mid]){
                    start = mid+1;
                } else if(target>arr[mid]){
                    end = mid-1;
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }
}
