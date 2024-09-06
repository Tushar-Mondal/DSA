package Ooops;
import java.util.*;
public class Ooops1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student[] students = new Student[5];
        Student tushar = new Student();
        Student ramdom = new Student();
        System.out.println(ramdom.name);
        System.out.println(ramdom.rollNo);
        System.out.println(ramdom.marks);
        System.out.println(tushar.name);
        System.out.println(tushar.rollNo);
        System.out.println(tushar.marks);
        tushar.changName("Bell Cranel");
        tushar.greeting();
    }
}
class Student {
    int rollNo;
    String name;
    float marks;
    void greeting(){
        System.out.println("Hello I am "+name);
    }
    void changName(String name){ this.name = name; }
    Student(Student other){
        this.name = other.name;
        this.rollNo = other.rollNo;
        this.marks = other.marks;
    }
    Student (){
        this ("Default person", 0, 56.4f);
    }
    Student (String name, int rollNo, float marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}