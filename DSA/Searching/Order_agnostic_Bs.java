package DSA.Searching;
import java.util.*;
public class Order_agnostic_Bs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements in sorted form:");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.print("Enter the target element:");
        int target = in.nextInt();
        int x = binary_search(arr,target);
        System.out.println("The element is in "+x+"th position");
    }
    static int binary_search(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAc){
                if (target > arr[mid]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }else {
                if (target < arr[mid]) {
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}