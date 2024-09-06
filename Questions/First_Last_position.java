package Questions;
import java.util.*;
public class First_Last_position {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements:");{
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
        }
        System.out.print("Enter the target element:");
        int target = in.nextInt();
        int[] x = first_last_position(arr,target);
        System.out.println("The first and last occurrence is: "+ Arrays.toString(x));
    }
    static int[] first_last_position(int[] arr,int target){
        int[] ans = {-1,-1};
        ans[0] = search(arr,target,true);
        if (ans[0] != -1){
            ans[1] = search(arr,target,false);
        }
        return ans;
    }
    static int search(int[] arr,int target,boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            } else if(target>arr[mid]){
                start = mid+1;
            }else{
                ans = mid;
                if (findStartIndex){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}