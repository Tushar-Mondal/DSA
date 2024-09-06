//package Questions;
//import java.util.Scanner;
//public class Pascal_Triangle {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the range:");
//        int range = in.nextInt();
//        Pattern(range);
//    }
//    static void Pattern(int range) {
//        int div = 1;
//        for (int row = 1; row <= range; row++) {
//            for (int s = 1; s <= range - row; s++) {
//                System.out.print(" ");f
//            }
//            for (int col = 1; col <= row; col++) {
//                if(col == 1 || col == row){
//                    System.out.print(1 + " ");
//                }else {
//                    System.out.print(((1 << (row - 1)) - 2) / div + " ");
//                }
//            }
//            System.out.println();
//            if(row > 2){
//                div++;
//            }
//        }
//    }
//}