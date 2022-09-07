class Solution {
    public boolean check(int[] nums) {
        //First we have to check if the array element 
        //At i+1 is greater than i 
        //And also consider the rotation by a very niche formula
        //arr[(i+1)%n]
        //If irregularities > 1 return false else return true
        int irregular = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                irregular++;
            }
        }
        
        return irregular <= 1 ? true:false;
    }
}