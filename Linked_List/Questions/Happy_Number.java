package Linked_List.Questions;

import java.util.Scanner;

public class Happy_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = in.nextInt();
        System.out.printf("Is the number is a happy num : %b", isHappy(num));
    }
    public static boolean isHappy(int num){
        int slow = num;
        int fast = num;
        do{
           slow = findSquare(slow);
           fast = findSquare(findSquare(fast));
        } while (slow != fast);
        if(slow == 1){
            return true;
        }
        return false;
    }

    public static int findSquare(int num){
        int ans = 0;
        while (num > 0){
            int rem = num % 10;
            ans += rem * rem;
            num /= 10;
        }
        return ans;
    }
}
