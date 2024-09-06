package Patterns;
public class Pattern23 {
    public static void main(String[] args) {
        pattern();
    }
    static void pattern(){
        int OuterSpace = 4;
        for (int row = 1; row <= 3; row++) {
            for (int osp = 1; osp <= OuterSpace; osp++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 15; col++) {
                if((row == 1 && (col == 1 || col == 7)) || ((row == 2 && (col == 1 || col == 4 || col == 7 || col == 11))) || (row == 3 && (col == 1 || col == 7 || col == 14))){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            OuterSpace -= 2;
        }
    }
}