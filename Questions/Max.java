package Questions;
import java.util.*;
public class Max {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the three nums:");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int max=0;
        if(a>b && a>c){
            max=a;
        }
        else if(b>a && b>c){
            max=b;
        }
        else{
            max=c;
        }
        System.out.println("The maximum is:"+max);
    }
}
