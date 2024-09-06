package Recursions.Questions;
import java.util.*;
public class Check_SortedArr_Recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size:");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the array element:");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        boolean x , isAc = arr[0] < arr[arr.length-1];
        if(isAc) {
            x = ASortedArr(arr , 0);
        }else {
            x = DSortedArr(arr , 0);
        }
        System.out.printf("The arr is sorted: %b",x);
    }
    static boolean ASortedArr(int[] arr,int index){
       if(index == arr.length-1){
           return true;
       }
        return arr[index] <= arr[index + 1] && ASortedArr(arr,index + 1);
    }
    static boolean DSortedArr(int[] arr,int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index] >= arr[index + 1] && DSortedArr(arr,index + 1);
    }
}