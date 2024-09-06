package Questions;
import java.util.Scanner;
public class Amstrong_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the num:");
        int num = in.nextInt();
        for(int i=0;i<num;i++){
            if(amstrong(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean amstrong(int x) {
        int original = x;
        int sum = 0;
        while (0 < x) {
            int rem = x%10;
            x=x/10;
            sum += rem*rem*rem;
        }
        return sum==original;
    }
}