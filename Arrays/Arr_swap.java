package Arrays;
import java.util.*;
public class Arr_swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,56};
        int[] a = new int[5];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<a.length;i++){
            a[i]=in.nextInt();
        }
        change_arr(arr);
        System.out.println(Arrays.toString(arr));
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
    static void change_arr(int[] arr){
        arr[4]=90;
    }
    static  void reverse(int[] a){
        int start = 0;
        int end = a.length-1;
        while(start < end){
            swap(a,start,end);
            start++;
            end--;
        }
     }
    static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
