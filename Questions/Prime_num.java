package Questions;
import java.util.*;
public class Prime_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the num:");
        int n = in.nextInt();
        System.out.printf("Is %d is a prime number? %b",n,isPrime(n));
    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if((n % i) == 0){
                return false;
            }
        }
        return true;
    }
}