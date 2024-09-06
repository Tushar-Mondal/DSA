package Questions;
import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer:");
        float x = input.nextInt();
        System.out.print("Enter the float:");
        float z=input.nextFloat();
        int a=(int)(z);
        System.out.print("Enter the char:");
        byte b=(byte)(x);
        byte a1=40;
        byte c=50;
        byte d=100;
        int e=a*c/d;
        int num= 'A';
        System.out.println(num);
    }
}
