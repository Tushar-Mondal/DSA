package Arrays;
import java.util.*;
public class MultiDimentional_Arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();//This is a null list.
        System.out.print("Enter the elements:");
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());//That's why we have to first add some list.
        }
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                list.get(row).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
