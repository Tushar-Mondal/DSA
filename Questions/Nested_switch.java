package Questions;
import java.util.Scanner;
public class Nested_switch {
    public static void main(String[] args) {
        Scanner inpurt = new Scanner(System.in);
        System.out.print("Entwr the employee id:");
        String s = inpurt.nextLine();
        System.out.print("Enter the department:");
        String d = inpurt.nextLine();
        switch (s) {
            case "Tushar" -> System.out.println("Tushar Mondal");
            case "Bell" -> System.out.println("Bell Cranel");
            case "Tanjiro" -> System.out.println("Tanjiro kamado");
            case "Department" -> {
                System.out.print("The department is:");
                switch (d) {
                    case "Tushar" -> System.out.println("A pathetick human");
                    case "Bell" -> System.out.println("The legendary Hero and also my biggest inspiration");
                    case "Tanjiro"-> System.out.println("The legendary Demon Slayer");
                    default -> System.out.println("Enter a fucking correct department");
                    }
            }
            default -> System.out.println("Enter a correct option");
            }
        }
    }

