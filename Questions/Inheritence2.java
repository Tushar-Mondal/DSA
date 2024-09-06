package Questions;
public class Inheritence2 {
    public static void main(String[] args) {
        A7 obj=new A7();
        obj.print();
        obj.show();
    }
}
interface Printable{
    void print();
}
interface Showable{
    void show();
}
class A7 implements Printable,Showable{
    public void print(){
        System.out.println("I am a Fool!");
    }
    public void show(){
        System.out.println("I want to get Stronger!");
    }
}