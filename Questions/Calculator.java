package Questions;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter two nums:");
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.print("Enter the operator:");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                if (op == '+')
                    System.out.println("Addition of two nums is:" + (a + b));
                if (op == '-')
                    System.out.println("Subtraction of two nums is:" + (a - b));
                if (op == '*')
                    System.out.println("Multiplication of two nums is:" + (a * b));
                if (op == '/')
                    if (b != 0)
                        System.out.println("Division of two nums is:" + (a / b));
                if (op == '%')
                    System.out.println("Modeulo of two nums is:" + (a % b));
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operator!!");
            }
        }
    }
}
