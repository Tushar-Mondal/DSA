package Questions;
import java.util.Arrays;
public class VarArgs {
    static int x=50;
    public static void main(String[] args) {
        fun(2,2,3,5,5,8);
        System.out.println(x);
        int x = 60;//shadowing
        System.out.println(x);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}