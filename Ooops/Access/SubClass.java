package Ooops.Access;

public class SubClass extends A{
    public SubClass(int num, String name){
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(3, "Tushar");
        int n = obj.getNum();
        System.out.println(obj instanceof Object);
    }
}
