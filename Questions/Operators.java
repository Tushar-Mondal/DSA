package Questions;
import java.util.ArrayList;
public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println("a"+1);
        //This is same as after a few steps: "a" + "1".
        //integer will be converted to Integer(Wrapper class) that will call toString().
        System.out.println("Tushar" + new ArrayList<>());
        System.out.println("Tushar" + new Integer(56));
        String ans = new Integer(56) + "" + new ArrayList<>();//The '+' operator is only accepts when the data types are primitives or String.
        System.out.println(ans);
    }
}