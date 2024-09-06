package Questions;
import java.util.*;
public class NewtonSqrt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = in.nextInt();
        double x = Sqrt(n);
        System.out.printf("The square root of %d is %.3f",n,x);
    }
    static double Sqrt(double n){
        double x = n;
        double root;
        while (true) {
            root = .5 * (x + (n / x));
            if(Math.abs(root - x) < 0.1){
                break;
            }
            x = root;
        }
        return root;
    }
}