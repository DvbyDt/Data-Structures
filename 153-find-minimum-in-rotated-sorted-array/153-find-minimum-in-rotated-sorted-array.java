class Solution {
    public int findMin(int[] nums) {
        //base case
        if(nums.length==1){return nums[0];}
        int n = nums.length;
        //Case 1:No rotations
        if(nums[0]<nums[n-1]){
            return nums[0];
        }
        int start = 0,end = n-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            //Case 2: Mid+1 is the answer
            if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            //Case 3:Mid is the answer
            else if(nums[mid-1]>nums[mid]){
                return nums[mid];
            }
            //Case 4:Left side is sorted
            else if(nums[start]<nums[mid]){
                start = mid+1;
            }
            //Case 5: Right side is sorted
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}