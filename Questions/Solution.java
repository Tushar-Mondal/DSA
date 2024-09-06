//package Questions;
//989
//public class Solution {
//    public static void main(String[] args) {
//        int[] n = {9,9,9,9,9,9,9,9,9,9};
//        int k = 1;
//        ArrayList<Integer> list = (ArrayList<Integer>) addToArrayForm(n,k);
//        System.out.println(list);
//    }
//    static List<Integer> addToArrayForm(int[] num, int k) {
//        ArrayList<Integer> list = new ArrayList<>(num.length);
//        long sum = 0 , base = 1,sum1 = 0;
//        for(int i = num.length - 1 ; i >= 0 ; i--){
//            sum += num[i] * base;
//            base *= 10;
//        }
//        sum += k;
//        while (sum > 0){
//            if(sum < base) {
//                base /= 10;
//            }
//            sum1 += (sum % 10) * base;
//            sum /= 10;
//        }
//        while(sum1 > 0){
//            list.add((int)sum1 % 10);
//            sum1 /= 10;
//        }
//        return list;
//    }
//}
public class Solution {
    public static void main(String[] args) {

    }
    static int[] twoSum(int[] nums, int target) {
        for(int i = 0 ; i < nums.length - 1 ; i++){
            int x = binary(nums,target - nums[i],0,nums.length - 1);
            if(nums[i] + nums[x] == target){
                return new int[]{i + 1,x + 1};
            }
        }
        return new int[]{-1,-1};
    }

    static int binary(int[] nums , int target , int start , int end){
        int mid = start + (end - start)/2;
        if(nums[mid] > target){
            return binary(nums,target,start,mid-1);
        }else if(nums[mid] < target){
            return binary(nums,target,mid+1,end);
        }else{
            return mid;
        }
    }
}