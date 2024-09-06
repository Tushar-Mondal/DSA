package Recursions.Dsa.Searching;
import java.util.*;
public class LinearSearch_Recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size:");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the target:");
        int target = in.nextInt();
        int x = LinearSearch(arr,target,0);
        ArrayList<Integer> list = Repeatative_Element(arr,target,0,new ArrayList<>());
        ArrayList<Integer> y = Repeatative_Element1(arr,target,0);
        System.out.println("The indexes are: "+list);
        System.out.println("The indexes are: "+y);
        System.out.printf("The index of the target element is %d",x);
    }
    static int LinearSearch(int[] arr , int target , int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else {
            return LinearSearch(arr, target, index + 1);
        }
    }
    static ArrayList<Integer> Repeatative_Element(int[] arr , int target , int index , ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return Repeatative_Element(arr,target,index+1,list);
    }
    //The below approach is not apropiate that's whi don't use it.
    static ArrayList<Integer> Repeatative_Element1(int[] arr , int target , int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> AnsFromBelowCalls = Repeatative_Element1(arr,target,index + 1);
        list.addAll(AnsFromBelowCalls);
        return list;
    }
}