package Questions;
import java.util.Scanner;
public class Char_search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string:");
        String s = in.next();
        System.out.print("Enter the finding char:");
        char c = in.next().trim().charAt(0);
        boolean x = string(s,c);
        System.out.println(x);
    }
    static boolean string(String s,char c){
        if(s.length()==0){
            return false;
        }
        for(char a : s.toCharArray()){
            if(a==c){
                return true;
            }
        }
        return false;
    }
}
