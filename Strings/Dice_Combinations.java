package Strings;
import java.util.*;
public class Dice_Combinations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the dice face no:");
        int diceFace = in.nextInt();
        System.out.print("Enter the target:");
        int target = in.nextInt();
        dice("",target, diceFace);
        ArrayList<String> str = diceRet("", target, diceFace, new ArrayList<>());
        System.out.println(str);
    }
    static void dice(String p, int target, int diceFace){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= diceFace && i <= target; i++) {
            dice(p + i , target - i, diceFace);
        }
    }
    static ArrayList<String> diceRet(String p, int target , int diceFace, ArrayList<String> ans){
        if(target == 0){
            ans.add(p);
            return ans;
        }
        for (int i = 1; i <= diceFace && i <= target; i++) {
            diceRet(p + i , target - i,diceFace, ans);
        }
        return ans;
    }
}