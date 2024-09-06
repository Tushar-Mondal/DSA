package Questions;
import java.util.*;
public class Duplicate_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
//        int x = duplicate_num(arr);
//        System.out.println("The duplicate number is: " + x);
//        List<Integer> x = duplicate_num(arr);
//        System.out.println("The duplicate numbers are: "+x);
        int[] x = SetMismatch(arr);
        System.out.println("The array is: "+ Arrays.toString(x));
    }

//    static int duplicate_num(int[] arr) {
//        int i = 0;
//        while (i < arr.length) {
//            int correct = arr[i] - 1;
//            if (arr[i] != i + 1) {
//                if (arr[i] != arr[correct]) {
//                    int temp = arr[i];
//                    arr[i] = arr[correct];
//                    arr[correct] = temp;
//                } else {
//                    return arr[i];
//                }
//            }else {
//                i++;
//            }
//        }
//        return -1;
//    }
//    static List<Integer> duplicate_num(int[] arr) {
//        int i = 0;
//        List<Integer> list = new ArrayList<>();
//        while (i < arr.length) {
//            int correct = arr[i] - 1;
//            if (arr[i] != arr[correct]) {
//                int temp = arr[i];
//                arr[i] = arr[correct];
//                arr[correct] = temp;
//            } else {
//                i++;
//            }
//        }
//        for (int index = 0; index < arr.length; index++) {
//            if(arr[index] != index+1){
//                list.add(arr[index]);
//            }
//        }
//        return list;
//    }
static int[] SetMismatch(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != i + 1) {
                if (arr[i] != arr[correct]) {
                    int temp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                } else {
                    return new int[]{arr[i],i+1};
                }
            }else {
                i++;
            }
        }
        return new int[]{-1};
    }
}