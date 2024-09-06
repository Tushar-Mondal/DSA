package Ooops;
public class StaticBlock {
    static int a = 4, b;
//  It Will only run once, when the first obj is created i.e. when the class loaded for the first time.
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}