package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_list {
    public static void main(String[] args) {
        int x;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the num:");
        x= in.nextInt();
        ArrayList<Integer> list = new ArrayList<>(5);
        System.out.print("Enter the adding elements:");
        for(int i=0;i<x;i++){
            list.add(in.nextInt());
        }
        System.out.println(list.contains(15));//Its check whether the element present in the list or not.
        System.out.println(list);
        list.set(1,15);//It can change the element based on the location, the first one is the location and second one is the changed element.
        list.remove(2);//Its remove the element based on the index.
        for(int i=0;i<x-1;i++){
            System.out.println(list.get(i));//Passing index doesn't work here like list[i].
        }
        System.out.println(list);
        System.out.println(list.size());
    }
}
