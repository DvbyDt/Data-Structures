class Solution {
    public int findMin(int[] nums) {
        //Trying to find peak and returning the next element
        int start = 0,end = nums.length-1;
        //Case 1: Check if array is already sorted
        if(nums[start]<nums[end]){
            return nums[0];
        }
        //Simple appraoch
        while(start<=end){
            int mid = start+(end-start)/2;
            //Check right side
            if(nums[mid]>nums[end]){
                start = mid+1;
            }
            //Check left side
            else if(nums[mid]<nums[end]){
                end = mid;
            }else{
                end--;
            }
            
        }
        return nums[start];
    }
}