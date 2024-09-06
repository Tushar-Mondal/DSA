package Arrays;
public class Position_In_Infinite_Array {
    public static void main(String[] args){
        int[] arr = {3,5,7,9,10,90,
                100,130,140,160,170};
        int target = 10;
        int x = positionIn_InfiniteArray(arr,target);
        System.out.printf(STR."The position of the element in Infinite array is: \{x}");
    }
    static int positionIn_InfiniteArray(int[] arr,int target){
        int start = 0;
        int end = 1;
        while (arr[end] < target){
            start = end + 1;
            end = 2*start + 1;
        }
        return binary(arr,target,start,end);
    }
    static int binary(int[] arr,int target,int start,int end){
        boolean isAc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end-start)/2;
            if(isAc){
                if(target<arr[mid]){
                    end = mid-1;
                } else if(target>arr[mid]){
                    start = mid+1;
                }else{
                    return mid;
                }
            } else {
                if(target<arr[mid]){
                    start = mid+1;
                } else if(target>arr[mid]){
                    end = mid-1;
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }
}
