package Questions;
import java.util.Scanner;
public class P_constuctor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the name:");
        String x= input.next();
        Student s=new Student(x);
    }
}
class Student{
    Student(String name){
        System.out.println("Hello! "+name);
    }
}
