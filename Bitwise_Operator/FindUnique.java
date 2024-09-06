package Bitwise_Operator;
public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {
                2,3,3,4,2,6,4
        };
        int x = Unique(arr);
        System.out.printf("The unique number is %d",x);
    }
    static int Unique(int[] arr){
        int unique = 0;
        for (int n : arr) {
            unique ^= n;
        }
        return unique;
    }
}
