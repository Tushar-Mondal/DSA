package Questions;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=0,y=1,i=2,z=0;
        System.out.print("Enter the position:");
        int n= input.nextInt();
        while(i<=n){
            z=x+y;
            x=y;
            y=z;
            i++;
        }
        System.out.println("The nth fibonacci num is:"+z);
   }
}