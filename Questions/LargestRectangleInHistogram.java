package Questions;

import java.util.Scanner;
import java.util.Stack;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(largestRectangleArea(arr));
    }
    public static int largestRectangleArea(int[] heights) {
        int ans = 0;
        int max = 0;
        if (heights[0] == heights[heights.length / 2] && heights[0] == heights[heights.length - 2]){
            if (heights[0] == heights[heights.length - 1]){
                return heights[0] * heights.length;
            } else {
                return heights[0] * (heights.length - 1);
            }
        }
        for (int i = 0; i < heights.length; i++){
            ans = heights[i];
            int j = i;
            while (j < heights.length - 1 && heights[i] <= heights[j + 1]){
                ans += heights[i];
                j++;
            }
            j = i;
            while ((j > 0) && (heights[i] <= heights[j - 1])) {
                ans += heights[i];
                j--;
            }
            if (max < ans){
                max = ans;
            }
        }
        return max;
    }
    public static int largestRectangleAreaOpt(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        stack.push(0);

        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]){
                max = getMax (heights, stack, max, i);
            }
            stack.push(i);
        }

        int i = heights.length;
        while (!stack.isEmpty()){
            max = getMax(heights, stack, max, i);
        }

        return max;
    }

    public static int getMax(int[] heights, Stack<Integer> stack, int max, int i) {
        int area;
        int pooped = stack.pop();
        if (stack.isEmpty()){
            area = heights[pooped] * i;
        }else {
            area = heights[pooped] * (i - 1 - stack.peek());
        }
        return Math.max(area, max);
    }
}
