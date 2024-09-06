package Ooops.Generics.Comparing;

public class Main {
    public static void main(String[] args) {
        Student Tushar = new Student(3,90.2f);
        Student Bell = new Student(0,99.99f);
        if(Tushar.compareTo(Bell) > 0){
            System.out.println("Tushar has more marks");
        } else if (Tushar.compareTo(Bell) < 0) {
            System.out.println("Bell has more marks");
        }else {
            System.out.println("Bell and Tushar both has equal marks");
        }

    }
}
