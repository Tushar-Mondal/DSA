package Arrays;
import java.util.Scanner;
public class RotationCountInRotatedSortedArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int x = RotationCount(arr);
        System.out.println("The total rotation number is: "+x);
    }
    static int RotationCount(int[] arr){
        return findPivotWithDuplicate(arr)+1;
    }
    static int findPivotWithDuplicate(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }else if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            } else if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if(arr[start] > arr[start+1]){
                    return start;
                }start++;
                if(arr[end] < arr[end-1]){
                    return end-1;
                }end--;
            }else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
}