package Arrays;
import java.util.*;
public class Input_arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Arrays of Premitivies
        int[] arr = new int[20];//Dynamically memory allocation.
        System.out.print("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.print("Enter which you want to print:");
        int n = in.nextInt();
        System.out.println("The element is:"+arr[n-1]);
        for(int num:arr) {//For-Which loop
            System.out.print(num + " ");
        }//or I can print it another way which is below
        System.out.println(Arrays.toString(arr));
        //Arrays of objects
        String[] str = new String[3];
        System.out.println("Enter the array elements:");
        for(int i=0;i<str.length;i++){
            str[i]=in.nextLine();
        }
        System.out.println(Arrays.toString(str));
    }
}
