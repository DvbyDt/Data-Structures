class Solution {
    public int thirdMax(int[] nums) {
        //base case
        if(nums.length==0){return 0;}
        if(nums.length==1||nums.length==2){return nums[nums.length-1];}
        
        long fmax = Long.MIN_VALUE,smax = Long.MIN_VALUE,tmax = Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){if(fmax<nums[i]){fmax = nums[i];}}
        for(int i=0;i<nums.length;i++){if(smax<nums[i] && nums[i]<fmax){smax = nums[i];}}
        for(int i=0;i<nums.length;i++){if(tmax<nums[i] && nums[i]<smax){tmax = nums[i];}}
        
        return (int)(tmax==Long.MIN_VALUE ? (int)fmax : (int)tmax);
    }
}