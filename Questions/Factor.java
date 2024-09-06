package Questions;
import java.util.*;
public class Factor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = in.nextInt();
        factor(n);
    }
    static void factor(int n){
        ArrayList<Integer> list = new ArrayList<>(1);
        for (int i = 1 ; i <= Math.sqrt(n) ; i++) {
            if((n % i) == 0){
                System.out.print(i + " ");
                list.add(n / i);
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}