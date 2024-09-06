package Questions;
import java.util.Scanner;
public class EvennumOf_Digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int x = Find_num(arr);
        System.out.println("The no. of even digit is:"+x);
        int y = Find_num1(arr);
        System.out.println("The no. of even digit is:"+y);
    }
    static int Find_num(int[] arr){
        int count = 0;
        for(int a : arr){
            if(even(a)) {
                count++;
            }
//            if(a==0){
//                count = 1;
//            }It's for odd digit count.
        }
        return count;
    }
    static boolean even(int num){
        int count = 0;
        if(num<0){
            num *= -1;
        }
        while(num>0){
            count++;
            num /= 10;
        }
        return count % 2 == 0;
    }
    // Or we can write it another way
    static boolean even1(int num){
        if(num<0){
            num *= -1;
        }
        int x = (int)(Math.log10(num))+1;//It counts the no. of digits which is present in yhe num
        return x % 2 == 0;
    }
    static int Find_num1(int[] arr){
        int count = 0;
        for(int a : arr){
            if(even1(a)) {
                count++;
            }
//            if(a==0){
//                count = 1;
//            }Its for odd digit count.
        }
        return count;
    }
}