package DSA.Sorting;

import java.util.Arrays;
//It's preferable than the HashMap's Cont Sort.
public class Count_Sort {
    public static void main(String[] args) {
        int[] arr = {6,3,10,9,2,4,9,7};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void countSort (int[] arr){
        if(arr == null || arr.length == 0){
            return;
        }
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (max < num){
                max = num;
            }
        }
        //int max = Arrays.stream(arr).max().getAsInt(); This is sort cart to the above one without doing any iteration.
        int[] countArray = new int[max + 1];
        for (int num : arr){
            countArray[num]++;
        }
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (countArray[i] > 0){
                arr[index] = i;
                index++;
                countArray[i]--;
            }
        }
    }
}
