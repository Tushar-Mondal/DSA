package Questions;
import java.util.Scanner;
public class Floor_problem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the target element:");
        int target = in.nextInt();
        int x = floor_element(arr,target);
        System.out.println("The floor element is in the " + x + "th position");
    }
    static int floor_element(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAc = arr[0] < arr[arr.length - 1];
        if(target<arr[end]||arr[start]>target) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target == arr[mid]) {
                    return mid;
                }
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
            return -1;
        }
        if (isAc) {
            return end;
        } else {
            return start;
        }
    }
}