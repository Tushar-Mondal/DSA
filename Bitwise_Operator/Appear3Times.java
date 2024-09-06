package Bitwise_Operator;

public class Appear3Times {
    public static void main(String[] args) {
//        int[] arr = {
//                2,2,3,2,7,7,8,7,8,8
//        };
//        int x = Decimal(arr);
//        System.out.printf("The element which occur <3 times is %d",x);
        int[][] x = {
                {1982,1998},
                {2013,2042},
                {2010,2035},
                {2022,2050},
                {2047,2048}

        };
        int z = maximumPopulation(x);
        System.out.println(z);
    }
//    static int Decimal(int[] arr){
//        int x = 0;
//        for (int i : arr) {
//            x += Bit_num(i);
//        }
//        int y = 0;
//        int b = 1;
//        while (x != 0){
//            y += ((x % 10) % 3)*b;
//            x /= 10;
//            b *= 10;
//        }
//        int base = 1;
//        int ans = 0;
//        while (y != 0){
//            ans += y % 10 * base;
//            base *= 2;
//            y /= 10;
//        }
//        return ans;
//    }
//    static int Bit_num(int n) {
//        int ans = 0;
//        int mul = 1;
//        while (n > 0){
//            int last = n & 1;
//            n >>= 1;
//            ans += last*mul;
//            mul *= 10;
//        }
//        return ans;
//    }
//    static boolean isEven(int n){
//        return ((n & 1) == 0);
//    }
    public static int maximumPopulation(int[][] logs) {
        int size = logs.length;
        int val = logs[0][0];
        int val1 = logs[0][0];
        int count = 1;
        int max = 1;
        for (int i = 0; i < size - 1; i++) {
            if((logs[i][1] < logs[i + 1][1]) && (logs[i][0] > logs[i + 1][0])){
                if (count == 1){
                    val = logs[i][0];
                }
                count++;
            }
            for (int j = i - 1; j >= 0; j--) {
                if((logs[i][1] < logs[j][1]) || (logs[i][0] > logs[j][0])){
                    if (count == 1){
                        val = logs[i][0];
                    }
                    count++;
                }
            }
            if(count > max){
                max = count;
                val1 = val;
                count = 1;
            }
        }
        return val1;
    }
}