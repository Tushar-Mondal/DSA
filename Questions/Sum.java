package Questions;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first num:");
        int y = input.nextInt();
        System.out.print("Enter the second num;");
        int z = input.nextInt();
        sum();
        int x = sum1(y, z);
        System.out.println("The sum of two nums is:" + x);
    }

    static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num:");
        int a = input.nextInt();
        System.out.print("Enter the another num:");
        int b = input.nextInt();
        System.out.println("The sum of two number is:" + (a + b));
    }

    static int sum1(int a, int b) {
        a = a + b;
        return a;
    }
}