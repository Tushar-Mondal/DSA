package DSA.Sorting;

import java.util.Arrays;

public class Radix_Sort {
    public static void main(String[] args) {
        int[] arr = {29,83,471,36,91,8};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void radixSort (int[] arr){
        if (arr == null || arr.length == 0){
            return;
        }
        int max = Arrays.stream(arr).max().getAsInt();
        // Do count sort for every digit place.
        for (int exp = 1; (max / exp) >= 1; exp *= 10) {
            Count_Sort(arr, exp);
        }
    }
    public static void Count_Sort(int[] arr, int exp){
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }
        System.out.println(STR."Count array for \{exp} : \{Arrays.toString(count)}");
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        System.out.println(STR."Updated count array is \{Arrays.toString(count)}");
        for (int i = n - 1; i > -1; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        System.out.println(STR."Output array is \{Arrays.toString(output)}");
        System.arraycopy(output, 0, arr, 0, n);
    }
}
