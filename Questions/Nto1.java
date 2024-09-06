package Questions;
import java.util.*;
public class Nto1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the range:");
        int n = in.nextInt();
        funcRev(n);
        //func(n);
    }
    static void func(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        func(n-1);
    }
    static void funcRev(int n){
        if(n == 0){
            return;
        }
        funcRev(n-1);
        System.out.print(n + " ");
    }
}