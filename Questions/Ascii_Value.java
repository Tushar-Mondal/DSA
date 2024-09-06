package Questions;
import java.util.*;
public class Ascii_Value {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the character:");
        char ch = in.next().trim().charAt(0);
        System.out.printf("The ascii value of %c is %d",ch,ch + 0);
        System.out.printf("The ascii value of %c is %d",ch,(int)ch);
    }
}