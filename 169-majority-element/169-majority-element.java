class Solution {
    public int majorityElement(int[] nums) {
        //Approach-1:
        // Arrays.sort(nums);
        // return nums[nums.length/2];
        
        //Approach-2: Moore's voting algo
        int count=0,candidate = -1;
        for(int n:nums){
            if(count==0){
                //count=count+1;
                //Assigning the candidate a value other than -1.
                candidate = n;
            }
            //If n == candidate count will increase else decrease
            if(n==candidate){
                count=count+1;
            }else{
                count=count-1;
            }
        }
        return candidate;
    }
}