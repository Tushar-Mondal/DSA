package Arrays;
import java.util.Scanner;
public class Rotated_sorted_Arr {
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
        int x = searchInRotatedArr(arr,target);
        System.out.println("The position of the element is: "+x);
    }
    static int searchInRotatedArr(int[] arr,int target){
        int Pivot = findPivotWithDuplicate(arr);
        int position = -1;
        if(Pivot == -1){
            position = binary(arr,target,0,arr.length-1);
        }else if(arr[Pivot] == target){
            return Pivot;
        }else if(arr[0] > target){
            position = binary(arr,target,Pivot+1,arr.length-1);
        }else {
            position = binary(arr,target,0,Pivot-1);
        }
        return position;
    }
//    static int findPivot(int[] arr){
//        int start = 0;
//        int end = arr.length - 1;
//        while (start < end){
//            int mid = start + (end - start)/2;
//            if(mid < end && arr[mid] > arr[mid + 1]) {
//                return mid;
//            }else if(mid > start && arr[mid] < arr[mid-1]){
//                return mid-1;
//            } else if (arr[mid] < arr[start]) {
//                end = mid - 1;
//            }else {
//                start = mid + 1;
//            }
//        }
//        return -1;
//    }
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
    static int binary(int[] arr,int target,int start,int end){
        while(start <= end){
            int mid = start + (end-start)/2;
                if(target<arr[mid]){
                    end = mid-1;
                } else if(target>arr[mid]){
                    start = mid+1;
                }else{
                    return mid;
                }
            }
        return -1;
    }
}