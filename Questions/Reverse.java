package Questions;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num:");
        long x = input.nextLong();
        int y = 0, i = 0;
        while (x > 0) {
            y = (int) ((int)(y*10)+(x % 10));
            x /= 10;
            i++;
        }
        System.out.println("The num is:"+y);
    }
}
