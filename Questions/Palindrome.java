package Questions;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string:");
        String s = in.next();
        boolean x = ispalindrome(s);
        System.out.println(STR."The string is palindrome isn't it: \{x}");
    }
    static boolean ispalindrome(String s){
        if(s == null || s.length()==0){
            return true;
        }
        int start = 0;
        int end = s.length()-1;
        while (start <= end){
            if (s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }else {
                return false;
            }
        }
        return true;
    }
}