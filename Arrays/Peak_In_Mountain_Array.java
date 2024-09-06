package Arrays;
import java.util.Scanner;
public class Peak_In_Mountain_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the target element:");
        int target = in.nextInt();
//        int x = peak(arr);
//        System.out.println("The peak element is: "+x);
        int x = find_In_Mountain_array(arr,target);
        System.out.println("The position of the target element is: "+x);
    }
    static int peak(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]) {
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;//It also can be the end also.
    }
    static int find_In_Mountain_array(int[] arr,int target){
        int peakIndex = peak(arr);
        int position = binary(arr,target,0,peakIndex);
        if(position == -1){
            position = binary(arr,target,peakIndex + 1,arr.length-1);
        }
        return position;
    }
    static int binary(int[] arr,int target,int start,int end){
        boolean isAc = arr[start] < arr[end];
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
