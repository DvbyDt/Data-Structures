class Solution {
    public int[] sortedSquares(int[] nums) {
        //Approach-1: square and sort
        // for(int i=0;i<nums.length;i++){
        //     nums[i] = nums[i]*nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;
        
        //Approach-2: Maintain two pointers
        int[] arr = new int[nums.length];
        int i = 0,j = nums.length-1,k=nums.length-1;
        while(i<=j)
        {
            if(Math.abs(nums[i])<=Math.abs(nums[j])){
                arr[k] = nums[j]*nums[j];
                k--;
                j--;
            }else{
                arr[k] = nums[i]*nums[i];
                k--;
                i++;
            }                
        }
        return arr;
    }
}