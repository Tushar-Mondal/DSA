package Strings;
import java.util.*;
public class SubSeq {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String:");
        String Str = in.next();
        //subseq("",Str);
        ArrayList<String> str = SubSeqRetAscii("",Str,new ArrayList<>());
        System.out.println(str);
    }
    static void subseq(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch , up.substring(1));
        subseq(p , up.substring(1));
    }
    static ArrayList<String> SubSeqRet(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = SubSeqRet(p + ch , up.substring(1));
        ArrayList<String> right = SubSeqRet(p , up.substring(1));
        left.addAll(right);
        return left;
    }
    static ArrayList<String> SubSeqRet(String p , String up , ArrayList<String> str){
        if(up.isEmpty()){
            str.add(p);
            return str;
        }
        char ch = up.charAt(0);
        SubSeqRet(p + ch , up.substring(1) , str);
        SubSeqRet(p , up.substring(1) , str);
        return str;
    }
    static ArrayList<String> SubSeqRetAscii(String p , String up , ArrayList<String> str){
        if(up.isEmpty()){
            str.add(p);
            return str;
        }
        char ch = up.charAt(0);
        SubSeqRetAscii(p + ch , up.substring(1) , str);
        SubSeqRetAscii(p , up.substring(1) , str);
        SubSeqRetAscii(p + (ch + 0) , up.substring(1) , str);
        return str;
    }
}