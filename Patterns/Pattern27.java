package Patterns;
public class Pattern27 {
    public static void main(String[] args) {
        pattern();
    }
    static void pattern(){
        int i = 1 , j = 17;
        for (int row = 1; row <= 4; row++) {
            for (int s = 1; s <= row - 1; s++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 4 - row + 1; col++) {
                System.out.print(i + " ");
                i++;
            }
            if(row == 4){
                System.out.print(" ");
            }else {
                System.out.print("  ");
            }
            for (int col = j; col <= j + 4 - row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
            j -= 4 - row;
        }
    }
}