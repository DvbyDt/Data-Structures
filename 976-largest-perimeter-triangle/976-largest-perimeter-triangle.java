class Solution {
    public int largestPerimeter(int[] nums) {
        //First sort the array
        Arrays.sort(nums);
        int peri = 0;
        //Solution was easy but the journey to get to the solution is the hardest 
        for(int i=nums.length-1;i>=2;i--){
            if(nums[i]<nums[i-1]+nums[i-2]){
                peri = nums[i]+nums[i-1]+nums[i-2];
                break;
            }
        }
        
        
        return peri;   
    }
}