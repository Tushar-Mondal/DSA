package Questions;
import java.util.Scanner;
public class Richest_person {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of row:");
        int row = in.nextInt();
        System.out.print("Enter the size of the col:");
        int col = in.nextInt();
        int[][] arr = new int[row][col];
        System.out.print("Enter array elements:");
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = in.nextInt();
            }
        }
        int y = Find_rich(arr);
        System.out.println(y);
    }
    static int Find_rich(int[][] arr){
        int n = 0;
        int y = 0;
        for(int[] i : arr){
            for(int j : i){
                n += j;
            }
            if(n>y){
                y = n;
            }
            n=0;
        }
        return y;
    }
}
