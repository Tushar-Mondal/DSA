package Questions;
import java.util.Scanner;
public class Switch_case {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the name of the fruit:");
        String fruit= input.next();
        switch (fruit){
            case "Mango" -> System.out.println("King of the fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Banana" -> System.out.println("Very useful fruit");
            default -> System.out.println("Enter a fucking valid fruit name");
        }
    }
}
