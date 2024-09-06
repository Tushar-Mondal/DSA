package Questions;
import java.util.Scanner;
public class HelloGoodbye {
    public static void main(String[] args) {
        String x = null,y=null;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name:");
        for (int i = 0; i < 2; i++) {
            if (i < 1) {
                x = input.nextLine();
            } else {
                y = input.nextLine();
            }
        }
        System.out.println("Hello " + x + " and " + y);
        System.out.println("Goodbye " + y + " and " + x);
    }
}
