package Questions;
import java.util.*;
public class Sqrt_Num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = in.nextInt();
        double x = Sqrt(n);
        System.out.printf("The square root of %d is %.3f",n,x);
    }
    static double Sqrt(int n){
        double x = BinarySearch(n,0,n);
        double incr = 0.1;
        for (int i = 0; i < 3; i++) {
            while (x * x <= n){
                x += incr;
            }
            x -= incr;
            incr /= 10;
        }
        return x;
    }
    static double BinarySearch(int n , int start , int end){
        int mid = start + (end - start) / 2;
        if(mid * mid > n){
            return BinarySearch(n,start,mid - 1);
        }
        else if (mid * mid < n) {
            if((mid + 1) * (mid + 1) > n){
                return mid;
            }else {
                return BinarySearch(n, mid + 1, end);
            }
        } else {
            return mid;
        }
    }
}