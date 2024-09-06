package Ooops.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)  throws CloneNotSupportedException {
        Human Tushar = new Human(22, "Tushar Mondal");
//        Human twin = new Human(Tushar);
        Human twin = (Human) Tushar.clone();
        System.out.println(twin.name + "  " + twin.age);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(Tushar.arr));
    }
}
