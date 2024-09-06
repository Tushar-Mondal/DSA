package Questions;
import java.util.Scanner;
public class Ceiling_problem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = in.nextInt();
        char[] arr = new char[n];
        System.out.print("Enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i]=in.next().trim().charAt(0);
        }
        System.out.print("Enter the target element:");
        char target = in.next().trim().charAt(0);
//        int x = ceiling_element(arr,target);
//        System.out.println("The ceiling element is in the "+x+"th position");
        char x = SmallestLetter_GraterThan_Target(arr,target);
        System.out.println("The ceiling character is: "+x);
    }
//    static int ceiling_element(int[] arr,int target){
//        int start = 0;
//        int end = arr.length-1;
//        boolean isAc = arr[0] < arr[arr.length-1];
//        if(target < arr[end] || arr[start] > target) {
//            while (start <= end) {
//                int mid = start + (end - start) / 2;
//                if (target == arr[mid]) {
//                    return mid;
//                }
//                if (isAc) {
//                    if (target < arr[mid]) {
//                        end = mid - 1;
//                    } else {
//                        start = mid + 1;
//                    }
//                } else {
//                    if (target > arr[mid]) {
//                        end = mid - 1;
//                    } else {
//                        start = mid + 1;
//                    }
//                }
//            }
//        }else {
//            return -1;
//        }
//        if(isAc){
//            return start;
//        }else{
//            return end;
//        }
//    }
    static char SmallestLetter_GraterThan_Target(char[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAc = arr[0] < arr[arr.length-1];
        if(target < arr[end] || arr[start] > target) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (isAc) {
                    if (target < arr[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                } else {
                    if (target > arr[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
        }else {
            return arr[0];
        }
        if(isAc){
            return arr[start];
        }else{
            return arr[end];
        }
    }
}