package Recursions.Dsa.Sorting;

import java.util.Arrays;
import java.util.Scanner;
public class MergeSort_Recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the array elements:");
        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        //arr = MergeSort(arr);
        MergeSortInPlace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static int[] MergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = MergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = MergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return Merge(left,right);
    }
    static int[] Merge(int[] left, int[] right){
        int[] mix = new int[left.length + right.length];
        int i = 0 , j = 0 , z = 0;
        while (i < left.length && j < right.length){
            if(left[i] < right[j]){
                mix[z] = left[i];
                i++;
            }else {
                mix[z] = right[j];
                j++;
            }
            z++;
        }
        while (i < left.length){
            mix[z] = left[i];
            i++;
            z++;
        }
        while (j < right.length){
            mix[z] = right[j];
            j++;
            z++;
        }
        return mix;
    }
    //Array InPlace means we don't copy or create extra array that's why we are using this
    static void MergeSortInPlace(int[] arr , int start , int end){
        if(end - start == 1){
            return;
        }
        int mid = start + (end - start)/2;
        MergeSortInPlace(arr,start,mid);
        MergeSortInPlace(arr,mid,arr.length);
        MergeInPlace(arr,start,mid,end);
    }
    static void MergeInPlace(int[] arr, int start, int mid, int end){
        int[] mix = new int[end - start];
        int i = start , j = mid , z = 0;
        while (i < mid && j < end){
            if(arr[i] < arr[j]){
                mix[z] = arr[i];
                i++;
            }else {
                mix[z] = arr[j];
                j++;
            }
            z++;
        }
        while (i < mid){
            mix[z] = arr[i];
            i++;
            z++;
        }
        while (j < end){
            mix[z] = arr[j];
            j++;
            z++;
        }
        for (int k = 0; k < mix.length; k++) {
            arr[start+k] = mix[k];
        }
    }
}