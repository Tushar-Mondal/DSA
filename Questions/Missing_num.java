package Questions;
import java.util.Scanner;
public class Missing_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        //int x = missing_num(arr);
        //System.out.println("The missing number is: "+ x);
        int x = firstMissingpositive(arr);
        System.out.println("The first missing positive number is : "+x);
    }
//    static int missing_num(int[] arr){
//        int i = 0;
//        while (i<arr.length){
//            int correct = arr[i];
//            if(arr[i] < arr.length && arr[i] != arr[correct]){
//                int temp = arr[i];
//                arr[i] = arr[correct];
//                arr[correct] = temp;
//            }else {
//                i++;
//            }
//        }
//        for (int index = 0; index < arr.length; index++) {
//            if(arr[index] != index){
//                return index;
//            }
//        }
//        return arr.length;
//    }
    static int firstMissingpositive(int[] arr){
        int i = 0;
        while (i<arr.length){
            int correct = arr[i] - 1;
            if(correct > 0 && arr[i] <= arr.length && arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index+1 && arr[index] >= 0){
                return index+1;
            }
        }
        return arr.length+1;
    }
}
