package Questions;
import java.util.*;
public class Prime_num_range {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the range:");
        int n = in.nextInt();
        boolean[] Prime = new boolean[n + 1];
        Sieve(n,Prime);
    }
    static void Sieve (int n , boolean[] Prime){
        for (int i = 2; i * i <= n; i++) {
            for (int j = 2 * i ; j <= n; j += i) {
                Prime[j] = true;
            }
        }
        for (int i = 2; i <= n; i++) {
            if(!Prime[i]){
                System.out.print(i + " ");
            }
        }
    }
}