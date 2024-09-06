package Questions;
import java.util.Scanner;
public class Primitives {
    public static void main(String[] args) {
        int id_num =003;
        char x='y';
        float num=0.003f;
        double marks= 1235556.4555;
        long num1=122222222222554L;
        boolean statement=false;
        int num2=(int)(0.12);
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the character:");
        char c=input.next().trim().charAt(0);
        System.out.println(c);
    }
}