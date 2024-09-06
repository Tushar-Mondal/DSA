package Strings;
import java.util.*;
public class PhonePad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 2-9 range String:");
        String str = in.nextLine();
        ArrayList<String> string = phonePad("", str);
        System.out.println(string);
    }
    static ArrayList<String> phonePad(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();
        char ch;
        if(digit > 1 && digit < 7) {
            for (int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {
                ch = (char)('a' + i) ;
                ans.addAll(phonePad(p + ch, up.substring(1)));
            }
        } else if (digit == 7) {
            for (int i = (digit - 2) * 3; i <= (digit - 1) * 3; i++) {
                ch = (char)('a' + i) ;
                ans.addAll(phonePad(p + ch, up.substring(1)));
            }
        } else if (digit == 8) {
            for (int i = ((digit - 2) * 3) + 1; i <= (digit - 1) * 3; i++) {
                ch = (char)('a' + i) ;
                ans.addAll(phonePad(p + ch, up.substring(1)));
            }
        }else {
            for (int i = ((digit - 2) * 3) + 1; i <= ((digit - 1) * 3) + 1; i++) {
                ch = (char)('a' + i) ;
                ans.addAll(phonePad(p + ch, up.substring(1)));
            }
        }
        return ans;
    }
}