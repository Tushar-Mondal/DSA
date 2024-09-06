package Strings;
import java.util.Scanner;
public class String_funk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name:");
        String name = input.next();
        String x = string(name);
        System.out.println(x);
    }
    static String string(String name){
        String message="Hello "+name;
        return message;
    }
}