package Ooops;
public class InnerClasses {
    static class Test {
        String name;
        Test (String name){
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Test obj = new Test("Tanjiro");
        Test obj1 = new Test("Bell");
        System.out.println(obj.name);
        System.out.println(obj1.name);

    }
}