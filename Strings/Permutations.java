package Strings;
import java.util.*;
public class Permutations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String:");
        String str = in.nextLine();
//        permutations("",str);
//        ArrayList<String> ans = permutationsList("",str);
//        System.out.println(ans);
        int x = permutationsCount("",str);
        System.out.printf("The number of permutations is %d",x);
    }
    static void permutations(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutations(f + ch + s,up.substring(1));
        }
    }
    static ArrayList<String> permutationsList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permutationsList(f + ch + s,up.substring(1)));
        }
        return ans;
    }
    static int permutationsCount(String p , String up){
        if(up.isEmpty()){
            return 1;
        }
        char ch = up.charAt(0);
        int count = 0;
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count += permutationsCount(f + ch + s,up.substring(1));
        }
        return count;
    }
}