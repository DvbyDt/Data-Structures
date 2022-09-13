class Solution {
    public int findDuplicate(int[] nums) {        
        // //Approach-1: Compare first element with second and then return common : O(nlogn)
        // Arrays.sort(nums);
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i-1]==nums[i]){
        //         return nums[i];
        //     }
        // }
        // return -1;
        
        //Approach-2: Pigenhole and binary search problem 
        int start = 0,end  = nums.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            int count = 0;
            //Counting 
            for(int i=0;i<nums.length;i++){
                if(nums[i]<=mid){
                    count++;
                }
            }
            
            if(count<=mid){
                start = mid+1;
            }else{
                end = mid;
            }
         
        }
        return start;
        
    }
}