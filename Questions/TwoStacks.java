package Questions;

import java.util.Arrays;

public class TwoStacks {
    public static void main(String[] args) {
    }

    public static int func (int x, int[] a, int[] b){
        return func(x, a, b, 0, 0) - 1;
    }

     private static int func (int x, int[] a, int[] b, int sum, int count){
        if (sum > x) {
            return count;
        }
        if (a.length == 0 || b.length == 0) {
            return count;
        }
        int ans1 = func(x, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count++);
        int ans2 = func(x, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count++);

        return Math.max(ans1, ans2);
    }
}
