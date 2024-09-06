package Ooops.Interfaces.Extends;

public interface A {
    static void greeting(){
        System.out.println("I am a static block");
    }
    default void fun(){
        System.out.println("I am in A");
    }
}
