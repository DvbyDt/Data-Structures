class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0,end = nums.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(target>nums[mid]){
                start  = mid+1;
                ans = start;
            }else{
                ans = start;
                end = mid-1;                
            }
        }
        return ans;
    }
}