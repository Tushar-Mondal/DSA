package Ooops.Abstract;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(25);
        son.career("Engineer");

        Daughter daughter = new Daughter(20);
        daughter.career("Doctor");
        Parent.hello();
    }
}
