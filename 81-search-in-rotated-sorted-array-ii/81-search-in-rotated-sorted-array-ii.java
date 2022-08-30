class Solution {
    public boolean search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){return true;}
            //Left side sorted
            else if(nums[start]<nums[mid]){
                if(target >= nums[start] && target <= nums[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }//Right side sorted
            else if(nums[mid]<nums[end]){
                if(target > nums[mid] && target <= nums[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
            //If arr[start]==arr[mid]==arr[end]
            else if(nums[start]==nums[mid]){
                //Just increase the value of start
                start++;
            }
            else if(nums[mid]==nums[end]){
                end--;
            }
        }
        return false;
    }
}