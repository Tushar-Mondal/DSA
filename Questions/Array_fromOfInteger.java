import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public static class Array_fromOfInteger {
}
public static List<Integer> addToArrayForm(int[] num, int k) {
    List<Integer> list = new ArrayList<Integer>();
    int z = k;
    int y = digit(k);
    int x = 0;
    int n = num.length - 1;
    int addup = 0;
    if(y > n + 1){
        for(int i = y - 1; i >= 0; i--){
            if(y - 1 == i){
                for (int j = 0; j <= i; j++) {
                    list.add(0);
                }
            }
            list.set(i, (z % 10));
            z /= 10;
        }
        for (int i = y - 1; i >= 0; i--) {
            if(n >= 0){
                x = num[n];
                n--;
            }else {
                x = 0;
            }
            x += list.get(i) + addup;
            if(addup > 0){
                addup = 0;
            }
            if(digit(x) == 1){
                list.set(i, x);
            }else {
                list.set(i, (x % 10));
                addup = x / 10;
            }
            if(i == 0){
                if(addup == 0){
                    break;
                }else {
                    list.add(0);
                    for (int j = y; j > 0; j--) {
                        list.set(j, list.get(j - 1));
                    }
                    list.set(0, addup);
                }
            }
        }
        return list;
    }else {
        for(int i = 0; i <= n; i++){
            list.add(num[i]);
        }
        for (int i = n; i >= 0; i--){
            x = num[i];
            if(y > 1){
                x += (z % 10) + addup;
                z /= 10;
                y--;
            }else{
                x += z + addup;
                z = 0;
            }
            if(addup > 0){
                addup = 0;
            }
            if(digit(x) == 1){
                list.set(i, x);
            }else{
                list.set(i, (x % 10));
                x /= 10;
                addup = x;
            }
            if(i == 0){
                if(addup == 0){
                    break;
                }else {
                    list.add(0);
                    for (int j = n + 1; j > 0; j--) {
                        list.set(j, list.get(j - 1));
                    }
                    list.set(0, addup);
                }
            }
        }
    }
    return list;
}
public static int digit(int n){
    return  (int)((Math.log(n) / Math.log(10)) + 1);
}
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] arr =new int[1];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = in.nextInt();
    }
    List<Integer> x = addToArrayForm(arr, 809);
    for (int i = 0; i < x.size(); i++) {
        int x1 = x.get(i);
        System.out.printf("%d ", x1);
    }
}
