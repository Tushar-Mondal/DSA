package Questions;
import java.util.Scanner;
public class Repetation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the num:");
        long x= input.nextLong();
        System.out.print("Enter the finding num:");
        int y= input.nextInt();
        int counter=0;
        int i=0;
        while(x>0){
            if(y==x%10)
                counter++;
            x/=10;
            i++;
        }
        System.out.println("The no. of finding num is:"+counter);
    }
}
