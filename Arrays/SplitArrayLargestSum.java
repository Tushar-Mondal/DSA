package Arrays;
import java.util.Scanner;
public class SplitArrayLargestSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements:");
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the split num:");
        int split = in.nextInt();
        int x = splitArrayLargestSum(arr,split);
        System.out.println("The Largest sum is: "+x);
    }
    static int splitArrayLargestSum(int[] arr,int m){
        int start = 0;
        int end = 0;
        for(int i=0;i<arr.length-1;i++){
            start = Math.max(start,arr[i]);//Find the max between the two integers given into the braces.
            end += arr[i];
        }
        while (start < end){
            int mid = start + (end - start)/2;
            int sum = 0;
            int pieces = 1;
            for(int num : arr){
                if(sum + num > mid){
                  sum = num;
                  pieces++;
                }else{
                    sum += num;
                }
            }
            if (pieces > m){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return end;
    }
}