class Solution {
    public int singleNonDuplicate(int[] nums) {
        //Approach-1:
        // int ans=nums[0];
        // for(int i=1;i<nums.length;i++){
        //     ans = ans ^ nums[i];
        // }
        // return ans;
        //Efficient Appraoch:
        //base case
        if(nums.length==0){return 0;}
        if(nums.length==1){return nums[0];}
        if(nums[0]!=nums[1]){return nums[0];}
        if(nums[nums.length-1]!=nums[nums.length-2]){return nums[nums.length-1];}
        
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid = (start+(end-start)/2);
            //if mid is the required number
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            //if even then check right
            if((mid%2==0 && nums[mid]==nums[mid+1]) || (mid%2!=0 && nums[mid]==nums[mid-1])){
                start=mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
        
    }
}