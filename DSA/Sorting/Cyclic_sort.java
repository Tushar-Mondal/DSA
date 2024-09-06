package DSA.Sorting;
import java.util.*;
//If they say search till N number then we use cyclic sort for get better complexity.
public class Cyclic_sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        cyclic_sort(arr);
        System.out.println("The sorted array is: "+ Arrays.toString(arr));
    }
    static void cyclic_sort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1] = temp;
            }else {
                i++;
            }
        }
    }
}
