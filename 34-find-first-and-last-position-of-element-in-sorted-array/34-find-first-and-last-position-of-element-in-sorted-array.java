class Solution {
    public int[] searchRange(int[] nums, int target) {
        //Base case
        if(nums.length==0){return new int[]{-1,-1};}
        int result[] = new int[2];
        result[0] = firstPosition(nums,target);
        result[1] = secondPosition(nums,target);
        return result;
    }
    
    public static int firstPosition(int[] nums,int target){
        int start = 0, end = nums.length-1, idx = -1;
        while(start <= end){
            int mid = (start+end)/2;
            if(nums[mid] >= target){
                end = mid - 1;
            }else if(nums[mid]<target){
                start = mid + 1;
            } if(nums[mid]==target){
                idx = mid;
            }
        //     int mid = (start + end) / 2;
        // if(nums[mid] >= target){
        //     end = mid - 1;
        // }else{
        //     start = mid + 1;
        // }
        // if(nums[mid] == target) idx = mid;
        }
        return idx ;
    }
    
    public static int secondPosition(int[] nums,int target){
        int start = 0, end = nums.length-1, idx = -1;
        while(start <= end){
            int mid = (start+end)/2;
            if(nums[mid]<=target){
                start=mid+1;
            }else if(nums[mid]>target){
                end=mid-1;
            } if(nums[mid]==target){
                idx =  mid;
            }
        }
        return idx;
    }
}