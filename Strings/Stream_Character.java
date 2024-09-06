package Strings;
import java.util.*;
public class Stream_Character {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String:");
        String str = in.nextLine();
        System.out.print("Enter the Character:");
        char c = in.next().trim().charAt(0);
        System.out.print("Enter the removing string:");
        String s = in.next();
        Skip("",str,c);
        String x = Skip(str,c);
        System.out.printf("\nThe String is: %s",x);
        String y = Skip_String(str,s);
        System.out.printf("\nAfter removing %s the new String is: %s",s,y);
    }
    static void Skip(String p , String up , char c){
        if(up.isEmpty()){
            System.out.printf("The String is: %s",p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == c){
            Skip(p,up.substring(1),c);
        }else {
            Skip(p+ch,up.substring(1),c);
        }
    }
    static String Skip(String up , char c){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == c){
            return Skip(up.substring(1),c);
        }else {
            return ch + Skip(up.substring(1),c);
        }
    }
    static String Skip_String(String up, String s){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith(s)){
            return Skip_String(up.substring(s.length()),s);
        }else {
            return up.charAt(0) + Skip_String(up.substring(1),s);
        }
    }
}