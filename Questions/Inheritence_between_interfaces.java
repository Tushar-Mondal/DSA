package Questions;
public class Inheritence_between_interfaces implements Showable1 {
    public void print(){
        System.out.println("Hello "+"Bell-");
    }
    public void show(){
        System.out.println("Welcome "+"Tanjiro");
    }

    public static void main(String[] args) {
        Inheritence_between_interfaces obj=new Inheritence_between_interfaces();
        obj.print();
        obj.show();
    }
}
interface Printable1{
    void print();
}
interface Showable1 extends Printable1{
    void show();
}