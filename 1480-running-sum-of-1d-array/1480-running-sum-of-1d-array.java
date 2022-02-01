class Solution {
    public int[] runningSum(int[] nums) {
        // int sum =0;
        // for(int i=0;i<nums.length;i++){
        //     sum+= nums[i];
        //     nums[i] = sum;            
        // }
        //System.gc();
        for(int i=1;i<nums.length;i++){
            nums[i] = nums[i]+nums[i-1];
        }
        //return nums;
        return nums;
        
    }
}