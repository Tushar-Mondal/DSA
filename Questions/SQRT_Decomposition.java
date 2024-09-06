package Questions;

import java.util.Arrays;

public class SQRT_Decomposition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,7,6,3,1,4,8};
        int n = arr.length;

        //Build a blocks array.
        int sqrt = (int) Math.sqrt(n);
        int blocks_id = -1;
        int[] blocks = new int[sqrt + 1];
        for (int i = 0; i < n; i++) {
            //New block is starting.
            if(i % sqrt == 0){
                blocks_id++;
            }
            blocks[blocks_id] += arr[i];
        }
        System.out.println(query(blocks, arr, 0, 7, sqrt));
        System.out.println(Arrays.toString(blocks));
        update(blocks, arr, 4, 9, sqrt);
        System.out.println(Arrays.toString(blocks));
        System.out.println(Arrays.toString(arr));
    }
    public static int query (int[] blocks, int[] arr, int l, int r, int sqrt){
        int ans = 0;
        //Left part.
        while (l % sqrt != 0 && l < r){
            ans += arr[l];
            l++;
        }
        //Middle part.
        while (l + sqrt <= r){
            ans += blocks[l / sqrt];
            l += sqrt;
        }
        //Right part.
        while (l <= r){
            ans += arr[l];
            l++;
        }
        return ans;
    }
    public static void update (int[] blocks, int[] arr, int i, int val, int sqrt){
        int block_id = i / sqrt;
        blocks[block_id] += val - arr[i];
        arr[i] = val;
    }
}
